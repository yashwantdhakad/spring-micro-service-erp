import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FormArray, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { OrderService } from 'src/app/services/order/order.service';
import { CommonService } from 'src/app/services/common/common.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { forkJoin, of } from 'rxjs';
import { finalize, switchMap, tap } from 'rxjs/operators';
import { FacilityService } from 'src/app/services/facility/facility.service';

@Component({
  standalone: false,
  selector: 'app-po-receive',
  templateUrl: './po-receive.component.html',
  styleUrls: ['./po-receive.component.css'],
})
export class POReceiveComponent implements OnInit {
  orderId: string | undefined;
  orderPrimaryId: string | undefined;
  isLoading = false;
  itemsForm: FormGroup;
  orderHeader: any;
  vendorPartyId: string | undefined;
  facilityId: string | undefined;
  shipGroupSeqId: string | undefined;
  allFacilityLocations: any[] = [];

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private orderService: OrderService,
    private fb: FormBuilder,
    private commonService: CommonService,
    private snackbarService: SnackbarService,
    private cdr: ChangeDetectorRef,
    private facilityService: FacilityService
  ) {
    this.itemsForm = this.fb.group({
      items: this.fb.array([]),
    });
  }

  ngOnInit(): void {
    this.route.params.subscribe((params) => {
      this.orderPrimaryId = params['id'];
      if (this.orderPrimaryId) {
        this.loadOrderById(this.orderPrimaryId);
      }
    });
  }

  get items(): FormArray {
    return this.itemsForm.get('items') as FormArray;
  }

  loadOrderById(id: string): void {
    this.isLoading = true;
    this.cdr.markForCheck();

    this.orderService.getOrderDisplayInfoById(id).pipe(
      switchMap((displayInfo) => {
        this.orderHeader = displayInfo.orderHeader;
        this.orderId = this.orderHeader?.orderId;
        this.vendorPartyId = displayInfo?.firstPart?.vendorPartyId;
        this.facilityId = displayInfo?.firstPart?.facilityId;
        this.shipGroupSeqId = displayInfo?.firstPart?.orderPartSeqId || '00001';

        const orderRequest = this.orderService.getOrderById(id);
        const locationsRequest = this.facilityId
          ? this.facilityService.getFacilityLocations(this.facilityId, 0, 1000) // Fetch up to 1000 locations for this facility
          : of({ content: [] });

        return forkJoin({
          orderResponse: orderRequest,
          locationsResponse: locationsRequest
        });
      }),
      finalize(() => {
        this.isLoading = false;
        this.cdr.markForCheck();
      })
    ).subscribe({
      next: ({ orderResponse, locationsResponse }) => {
        this.allFacilityLocations = locationsResponse?.content || [];

        const items = (orderResponse?.parts || [])
          .flatMap((part: any) => (part.items || []).map((item: any) => ({
            ...item,
            facilityId: part?.facility?.facilityId || part?.facilityId || this.facilityId,
          })));
        this.items.clear();
        items.forEach((item: any) => {
          this.items.push(this.fb.group({
            orderItemSeqId: [item.orderItemSeqId],
            productId: [item.productId],
            productName: [item?.product?.productName],
            quantity: [item.quantity],
            receivedQuantity: [item.receivedQuantity || 0],
            remainingQuantity: [item.remainingQuantity || 0],
            receiveQuantity: [item.remainingQuantity || 0, [Validators.required, Validators.min(0)]],
            locationSeqId: [null],
            facilityId: [item.facilityId],
          }));
        });
        this.cdr.markForCheck();
      },
      error: () => {
        this.snackbarService.showError('Failed to load purchase order');
      },
    });
  }

  receiveItems(): void {
    if (!this.orderId || this.itemsForm.invalid) {
      this.itemsForm.markAllAsTouched();
      return;
    }

    const payloadItems = this.items.controls
      .map((group) => group.value)
      .filter((item) => item.receiveQuantity > 0)
      .map((item) => ({
        orderItemSeqId: item.orderItemSeqId,
        quantity: item.receiveQuantity,
        locationSeqId: item.locationSeqId,
      }));

    if (!payloadItems.length) {
      this.snackbarService.showError('No quantities to receive');
      return;
    }

    const payload = {
      facilityId: this.facilityId,
      vendorPartyId: this.vendorPartyId,
      shipGroupSeqId: this.shipGroupSeqId,
      items: payloadItems,
    };

    this.isLoading = true;
    this.orderService.receivePurchaseOrder(this.orderId, payload).subscribe({
      next: () => {
        this.snackbarService.showSuccess('Receipt processed');
        if (this.orderPrimaryId) {
          this.router.navigate([`/pos/${this.orderPrimaryId}`]);
        }
      },
      error: () => {
        this.snackbarService.showError('Failed to receive items');
        this.isLoading = false;
      },
    });
  }

  getLocationsForItem(row: any): any[] {
    const facilityId = row?.value?.facilityId || this.facilityId;
    if (!facilityId) {
      return this.allFacilityLocations;
    }
    return this.allFacilityLocations.filter((location: any) =>
      location.facilityId === facilityId
    );
  }
}
