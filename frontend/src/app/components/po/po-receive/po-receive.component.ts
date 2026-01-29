import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FormArray, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { OrderService } from 'src/app/services/order/order.service';
import { CommonService } from 'src/app/services/common/common.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';
import { forkJoin } from 'rxjs';

@Component({
  selector: 'app-po-receive',
  templateUrl: './po-receive.component.html',
  styleUrls: ['./po-receive.component.css'],
})
export class POReceiveComponent implements OnInit {
  orderId: string | undefined;
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
    private snackbarService: SnackbarService
  ) {
    this.itemsForm = this.fb.group({
      items: this.fb.array([]),
    });
  }

  ngOnInit(): void {
    this.route.params.subscribe((params) => {
      this.orderId = params['orderId'];
      if (this.orderId) {
        this.loadOrder(this.orderId);
      }
    });
  }

  get items(): FormArray {
    return this.itemsForm.get('items') as FormArray;
  }

  loadOrder(orderId: string): void {
    this.isLoading = true;
    forkJoin({
      orderResponse: this.orderService.getOrder(orderId),
      displayInfo: this.orderService.getPODisplayInfo(orderId),
      facilityLocations: this.commonService.getFacilityLocations(),
    }).subscribe({
      next: ({ orderResponse, displayInfo, facilityLocations }) => {
        this.orderHeader = displayInfo.orderHeader;
        this.vendorPartyId = displayInfo?.firstPart?.vendorPartyId;
        this.facilityId = displayInfo?.firstPart?.facilityId;
        this.shipGroupSeqId = displayInfo?.firstPart?.orderPartSeqId || '00001';
        this.allFacilityLocations = facilityLocations || [];

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
      },
      error: () => {
        this.snackbarService.showError('Failed to load purchase order');
      },
      complete: () => {
        this.isLoading = false;
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
        this.router.navigate([`/pos/${this.orderId}`]);
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
