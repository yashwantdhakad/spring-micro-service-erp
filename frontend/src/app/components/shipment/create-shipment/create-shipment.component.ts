import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { forkJoin } from 'rxjs';
import { finalize } from 'rxjs/operators';
import { CommonService } from 'src/app/services/common/common.service';
import { ShipmentService } from 'src/app/services/shipment/shipment.service';
import { SnackbarService } from 'src/app/services/common/snackbar.service';

@Component({
  selector: 'app-create-shipment',
  templateUrl: './create-shipment.component.html',
  styleUrls: ['./create-shipment.component.css']
})
export class CreateShipmentComponent implements OnInit {
  isLoading = false;
  shipmentForm: FormGroup;
  shipmentTypes: any[] = [];
  shipmentStatuses: any[] = [];
  carrierServiceStatuses: any[] = [];
  shipmentMethodTypes: any[] = [];

  constructor(
    private fb: FormBuilder,
    private shipmentService: ShipmentService,
    private router: Router,
    private snackbarService: SnackbarService,
    private commonService: CommonService
  ) {
    this.shipmentForm = this.fb.group({
      shipmentId: [''],
      shipmentTypeId: ['', Validators.required],
      statusId: ['', Validators.required],
      primaryOrderId: [''],
      originFacilityId: [''],
      destinationFacilityId: [''],
      partyIdFrom: [''],
      partyIdTo: [''],
      estimatedShipDate: [''],
      estimatedArrivalDate: [''],
      items: this.fb.array([]),
      routeSegments: this.fb.array([]),
    });
  }

  ngOnInit(): void {
    this.addItem();
    this.addRouteSegment();
    this.loadLookups();
  }

  get items(): FormArray {
    return this.shipmentForm.get('items') as FormArray;
  }

  get routeSegments(): FormArray {
    return this.shipmentForm.get('routeSegments') as FormArray;
  }

  addItem(): void {
    this.items.push(
      this.fb.group({
        shipmentItemSeqId: [''],
        productId: ['', Validators.required],
        quantity: ['', Validators.required],
        shipmentContentDescription: [''],
      })
    );
  }

  removeItem(index: number): void {
    this.items.removeAt(index);
  }

  addRouteSegment(): void {
    this.routeSegments.push(
      this.fb.group({
        shipmentRouteSegmentId: [''],
        originFacilityId: [''],
        destFacilityId: [''],
        shipmentMethodTypeId: [''],
        carrierPartyId: [''],
        carrierServiceStatusId: [''],
      })
    );
  }

  removeRouteSegment(index: number): void {
    this.routeSegments.removeAt(index);
  }

  private loadLookups(): void {
    forkJoin({
      statuses: this.commonService.getAllStatusItems(),
      shipmentTypes: this.commonService.getShipmentTypes(),
      shipmentMethodTypes: this.commonService.getShipmentMethodTypes(),
    }).subscribe({
      next: ({ statuses, shipmentTypes, shipmentMethodTypes }) => {
        const statusList = statuses || [];
        const shipmentStatuses = statusList.filter(
          (item: any) => item.statusTypeId === 'SHIPMENT_STATUS'
        );
        this.shipmentStatuses = shipmentStatuses.length ? shipmentStatuses : statusList;
        this.carrierServiceStatuses = statusList;
        this.shipmentTypes = shipmentTypes || [];
        this.shipmentMethodTypes = shipmentMethodTypes || [];
      },
      error: () => {
        this.shipmentStatuses = [];
        this.carrierServiceStatuses = [];
        this.shipmentTypes = [];
        this.shipmentMethodTypes = [];
      },
    });
  }

  createShipment(): void {
    if (this.shipmentForm.invalid) {
      this.shipmentForm.markAllAsTouched();
      return;
    }

    const value = this.shipmentForm.value;
    const payload = {
      shipment: {
        shipmentId: value.shipmentId || null,
        shipmentTypeId: value.shipmentTypeId,
        statusId: value.statusId,
        primaryOrderId: value.primaryOrderId || null,
        originFacilityId: value.originFacilityId || null,
        destinationFacilityId: value.destinationFacilityId || null,
        partyIdFrom: value.partyIdFrom || null,
        partyIdTo: value.partyIdTo || null,
        estimatedShipDate: this.toLocalDateTime(value.estimatedShipDate),
        estimatedArrivalDate: this.toLocalDateTime(value.estimatedArrivalDate),
      },
      items: (value.items || []).map((item: any) => ({
        shipmentItemSeqId: item.shipmentItemSeqId || null,
        productId: item.productId,
        quantity: item.quantity,
        shipmentContentDescription: item.shipmentContentDescription || null,
      })),
      routeSegments: (value.routeSegments || []).map((segment: any) => ({
        shipmentRouteSegmentId: segment.shipmentRouteSegmentId || null,
        originFacilityId: segment.originFacilityId || null,
        destFacilityId: segment.destFacilityId || null,
        shipmentMethodTypeId: segment.shipmentMethodTypeId || null,
        carrierPartyId: segment.carrierPartyId || null,
        carrierServiceStatusId: segment.carrierServiceStatusId || null,
      })),
    };

    this.isLoading = true;
    this.shipmentService
      .createShipment(payload)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (response) => {
          const shipmentId = response?.shipment?.shipmentId || response?.shipmentId;
          if (shipmentId) {
            this.snackbarService.showSuccess('Shipment created successfully.');
            this.router.navigate([`/shipments/${shipmentId}`]);
          } else {
            this.snackbarService.showError('Shipment created, but no ID returned.');
          }
        },
        error: () => {
          this.snackbarService.showError('Error creating shipment.');
        },
      });
  }

  private toLocalDateTime(value: any): string | null {
    if (!value) {
      return null;
    }
    if (value instanceof Date && !isNaN(value.getTime())) {
      const year = value.getFullYear();
      const month = String(value.getMonth() + 1).padStart(2, '0');
      const day = String(value.getDate()).padStart(2, '0');
      return `${year}-${month}-${day}T00:00:00`;
    }
    if (typeof value === 'string') {
      if (value.includes('T')) {
        return value;
      }
      return `${value}T00:00:00`;
    }
    return null;
  }
}
