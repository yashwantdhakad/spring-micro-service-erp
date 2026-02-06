import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute, Router } from '@angular/router';
import { OrderService } from 'src/app/services/order/order.service';
import { PartyService } from 'src/app/services/party/party.service';
import { FacilityService } from 'src/app/services/facility/facility.service';
import { DatePipe } from '@angular/common';
import { TranslateService } from '@ngx-translate/core';
import { CommonService } from 'src/app/services/common/common.service';
import { ProductService } from 'src/app/services/product/product.service';
import { AddEditAddressComponent } from 'src/app/components/party/add-edit-address/add-edit-address.component';
import { ContentComponent } from '../../order/content/content.component';
import { NoteComponent } from '../../order/note/note.component';
import { ProductItemComponent } from '../../order/product-item/product-item.component';
import { ShippingInstructionDialogComponent } from '../../order/shipping-instruction-dialog/shipping-instruction-dialog.component';
import { ConfirmationDialogComponent } from '../../common/confirmation-dialog/confirmation-dialog.component';
import { forkJoin, of } from 'rxjs';
import { catchError, distinctUntilChanged, filter, finalize, map, switchMap, tap } from 'rxjs/operators';

@Component({
  standalone: false,
  selector: 'app-po-detail',
  templateUrl: './po-detail.component.html',
  styleUrls: ['./po-detail.component.css'],
  providers: [DatePipe]
})
export class PODetailComponent implements OnInit {
  orderId: string | undefined;
  orderPrimaryId: string | undefined;
  orderHeader: any;
  statusItem: any;
  vendorAddresses: any[] = [];
  vendorName: string | undefined;
  facilityAddress: any;
  orderShipToAddress: any;
  vendorPartyId: string | undefined;
  facilityId: string | undefined;
  canApprove = false;
  canReceive = false;
  canEditItems = false;

  addPOItemDialog: boolean = false;
  createOrderNoteDialog: boolean = false;
  isLoading: boolean = false;
  isSavingQuantity = false;
  itemSubtotal = 0;
  shippingTotal = 0;
  discountTotal = 0;
  orderTotal = 0;
  editingItemKey: string | null = null;
  editingQuantity: number | null = null;

  pages: number = 0;

  noteData: any;
  orderNotes: any[] = [];
  noteColumns = [
    { key: 'noteText', label: this.translate.instant('PO.NOTE') },
    { key: 'noteDate', label: this.translate.instant('PO.NOTE_DATE') },
    { key: 'userId', label: this.translate.instant('PO.CREATED_BY') },
    { key: 'action', label: this.translate.instant('COMMON.ACTION') }
  ];
  noteColumnKeys: string[] = this.noteColumns.map(c => c.key);

  itemData: any;
  parts: any[] = [];
  partColumns = [
    { key: 'productId', label: this.translate.instant('PO.PRODUCT_ID') },
    { key: 'productName', label: this.translate.instant('PO.PRODUCT_NAME') },
    { key: 'itemDescription', label: this.translate.instant('PO.ITEM_DESCRIPTION') },
    { key: 'description', label: this.translate.instant('COMMON.TYPE') },
    { key: 'requiredByDate', label: this.translate.instant('PO.REQUIRED_BY_DATE') },
    { key: 'unitAmount', label: this.translate.instant('COMMON.PRICE') },
    { key: 'quantity', label: this.translate.instant('PO.QUANTITY') },
    { key: 'receivedQuantity', label: this.translate.instant('PO.RECEIVED_QTY') },
    { key: 'remainingQuantity', label: this.translate.instant('PO.REMAINING_QTY') },
    { key: 'totalAmount', label: this.translate.instant('PO.TOTAL_AMOUNT') },
  ];
  partColumnKeys: string[] = this.partColumns.map(c => c.key);

  contents: any[] = [];
  contentColumns = [
    { key: 'description', label: this.translate.instant('PO.TITLE_COL') },
    { key: 'contentDate', label: this.translate.instant('PO.CONTENT_COL') },
    { key: 'contentLocation', label: this.translate.instant('PO.MIME_TYPE') }
  ];
  contentColumnKeys: string[] = this.contentColumns.map(c => c.key);

  shipments: any[] = [];
  shipmentColumns = [
    { key: 'shipmentId', label: 'Shipment' },
    { key: 'shipmentTypeId', label: 'Type' },
    { key: 'statusId', label: 'Status' },
    { key: 'createdDate', label: 'Created' }
  ];
  shipmentColumnKeys: string[] = this.shipmentColumns.map(c => c.key);

  invoiceItems: any[] = [];
  invoiceColumns = [
    { key: 'invoiceId', label: 'Invoice' },
    { key: 'productId', label: 'Product' },
    { key: 'quantity', label: 'Qty' },
    { key: 'amount', label: 'Amount' }
  ];
  invoiceColumnKeys: string[] = this.invoiceColumns.map(c => c.key);

  contentData: any;
  productItemData: any;

  overviewFields: { label: string, value: any }[] = [];
  orderTerms: any[] = [];
  orderPaymentPreferences: any[] = [];
  termColumns: string[] = ['termTypeId', 'termValue', 'termDays'];
  preferenceColumns: string[] = ['paymentMethodTypeId', 'statusId', 'maxAmount'];
  statusDescriptionMap = new Map<string, string>();
  shipmentTypeMap = new Map<string, string>();
  orderItemTypeMap = new Map<string, string>();
  productNameMap = new Map<string, string>();

  constructor(
    private route: ActivatedRoute,
    private orderService: OrderService,
    private partyService: PartyService,
    private facilityService: FacilityService,
    private dialog: MatDialog,
    private router: Router,
    private datePipe: DatePipe,
    private translate: TranslateService,
    private commonService: CommonService,
    private productService: ProductService,
    private cdr: ChangeDetectorRef
  ) { }

  ngOnInit(): void {
    this.loadLookupData();
    this.route.paramMap
      .pipe(
        map((params) => params.get('id') || ''),
        filter((id) => id.length > 0),
        distinctUntilChanged(),
        switchMap((id) => {
          this.orderPrimaryId = id;
          return this.getOrderById(id);
        })
      )
      .subscribe();
  }

  getOrderById(id: string) {
    this.isLoading = true;

    return forkJoin({
      orderResponse: this.orderService.getOrderById(id).pipe(catchError(() => of(null))),
      displayInfo: this.orderService.getOrderDisplayInfoById(id).pipe(catchError(() => of(null))),
    }).pipe(
      tap(({ orderResponse, displayInfo }) => {
        if (!orderResponse) {
          return;
        }

        this.parts = orderResponse.parts || [];
        this.primeProductNames(this.parts || []);
        this.contents = orderResponse.contents || [];

        if (displayInfo) {
          this.orderHeader = displayInfo.orderHeader;
          this.orderId = this.orderHeader?.orderId;
          this.statusItem = displayInfo.statusItem;
          this.orderNotes = displayInfo.orderNoteList || [];
          this.orderTerms = displayInfo.orderTermList || [];
          this.orderPaymentPreferences = displayInfo.orderPaymentPreferenceList || [];
          this.calculateSummary(displayInfo.orderAdjustmentList || []);
          this.canApprove = this.statusItem?.statusId === 'ORDER_CREATED';
          this.canReceive = this.statusItem?.statusId === 'ORDER_APPROVED';
          this.canEditItems = this.statusItem?.statusId === 'ORDER_CREATED'
            || this.statusItem?.statusId === 'ORDER_APPROVED';

          this.overviewFields = [
            { label: 'COMMON.ID', value: this.orderHeader?.orderId },
            { label: 'PO.ORDER_DATE', value: this.datePipe.transform(this.orderHeader?.entryDate, 'MMMM d, y') },
            { label: 'COMMON.STATUS', value: this.statusItem?.description },
          ];

          if (displayInfo?.firstPart?.vendorPartyId) {
            this.vendorPartyId = displayInfo.firstPart.vendorPartyId;
            this.loadVendorDetails(displayInfo.firstPart.vendorPartyId);
          }

          this.facilityId = displayInfo?.firstPart?.facilityId || this.orderHeader?.originFacilityId;
          if (this.facilityId) {
            this.loadFacilityAddress(this.facilityId);
          }

          const shippingContacts = (displayInfo?.orderContactMechList || [])
            .filter((contact: any) => (contact?.contactMechPurposeTypeId || '').toUpperCase() === 'SHIPPING_LOCATION');
          this.orderShipToAddress = shippingContacts.length ? shippingContacts[0]?.postalAddress : null;
        }
        if (this.orderId) {
          this.orderService.getOrderShipments(this.orderId).pipe(catchError(() => of([]))).subscribe((shipments) => {
            const list = Array.isArray(shipments) ? shipments : [];
            setTimeout(() => {
              this.shipments = list;
              this.cdr.markForCheck();
            }, 0);
          });
          this.orderService.getOrderInvoices(this.orderId).pipe(catchError(() => of([]))).subscribe((invoices) => {
            const invoiceList = Array.isArray(invoices) ? invoices : [];
            const items = invoiceList.flatMap((invoice: any) =>
              (invoice.items || []).map((item: any) => ({
                invoiceId: invoice.invoiceId,
                currencyUomId: invoice.currencyUomId,
                productId: item.productId,
                quantity: item.quantity,
                amount: item.amount
              }))
            );
            setTimeout(() => {
              this.invoiceItems = items;
              this.cdr.markForCheck();
            }, 0);
          });
        }
      }),
      finalize(() => {
        this.isLoading = false;
        setTimeout(() => this.cdr.markForCheck(), 0);
      })
    );
  }

  private calculateSummary(adjustments: any[]): void {
    const shipping = adjustments
      .filter((adj: any) => adj?.orderAdjustmentTypeId === 'SHIPPING_CHARGES')
      .reduce((sum: number, adj: any) => sum + Number(adj?.amount ?? 0), 0);

    const discount = adjustments
      .filter((adj: any) => adj?.orderAdjustmentTypeId === 'DISCOUNT_ADJUSTMENT')
      .reduce((sum: number, adj: any) => sum + Number(adj?.amount ?? 0), 0);

    const itemSubtotal = (this.parts || [])
      .reduce((sum: number, part: any) => sum + Number(part?.partTotal ?? 0), 0);

    this.shippingTotal = shipping;
    this.discountTotal = discount;
    this.itemSubtotal = itemSubtotal;
    this.orderTotal = itemSubtotal + shipping + discount;
  }

  startEditQuantity(item: any): void {
    if (!this.canEditItems || !item?.orderItemSeqId) {
      return;
    }
    this.editingItemKey = this.getItemKey(item);
    this.editingQuantity = Number(item?.quantity ?? 0);
  }

  cancelEditQuantity(): void {
    this.editingItemKey = null;
    this.editingQuantity = null;
  }

  saveQuantity(item: any): void {
    if (!this.orderId || !item?.orderItemSeqId || this.editingQuantity === null) {
      return;
    }
    const quantity = Number(this.editingQuantity);
    if (Number.isNaN(quantity) || quantity < 0) {
      return;
    }
    this.isSavingQuantity = true;
    this.orderService.updateOrderItemQuantity(this.orderId, item.orderItemSeqId, quantity)
      .pipe(finalize(() => {
        this.isSavingQuantity = false;
        setTimeout(() => this.cdr.markForCheck(), 0);
      }))
      .subscribe({
        next: (updated) => {
          item.quantity = updated?.quantity ?? quantity;
          item.remainingQuantity = updated?.remainingQuantity ?? item.remainingQuantity;
          this.cancelEditQuantity();
        },
      });
  }

  isEditingItem(item: any): boolean {
    return this.getItemKey(item) === this.editingItemKey;
  }

  private getItemKey(item: any): string {
    return `${item?.orderItemSeqId || ''}`;
  }

  loadLookupData(): void {
    this.commonService.getAllStatusItems().subscribe({
      next: (items) => {
        const list = Array.isArray(items) ? items : [];
        this.statusDescriptionMap = new Map(
          list.map((item: any) => [item.statusId, item.description || item.statusId])
        );
      },
    });
    this.commonService.getShipmentTypes().subscribe({
      next: (items) => {
        const list = Array.isArray(items) ? items : [];
        this.shipmentTypeMap = new Map(
          list.map((item: any) => [item.shipmentTypeId, item.description || item.shipmentTypeId])
        );
      },
    });
    this.commonService.getOrderItemTypes().subscribe({
      next: (items) => {
        const list = Array.isArray(items) ? items : [];
        this.orderItemTypeMap = new Map(
          list.map((item: any) => [
            item.orderItemTypeId,
            item.description || item.orderItemTypeId,
          ])
        );
      },
    });
  }

  getStatusDescription(statusId: string): string {
    return this.statusDescriptionMap.get(statusId) || statusId;
  }

  getShipmentTypeDescription(shipmentTypeId: string): string {
    return this.shipmentTypeMap.get(shipmentTypeId) || shipmentTypeId;
  }

  getOrderItemTypeDescription(orderItemTypeId?: string): string {
    if (!orderItemTypeId) {
      return '';
    }
    return this.orderItemTypeMap.get(orderItemTypeId) || orderItemTypeId;
  }

  getProductName(item: any): string {
    const productId = item?.productId;
    return (
      this.productNameMap.get(productId) ||
      item?.product?.productName ||
      item?.productName ||
      item?.itemDescription ||
      productId ||
      ''
    );
  }

  private primeProductNames(parts: any[]): void {
    const ids = new Set<string>();
    (parts || []).forEach((part: any) => {
      (part.items || []).forEach((item: any) => {
        const productId = item?.productId;
        if (!productId) {
          return;
        }
        const name = item?.product?.productName || item?.productName;
        if (name) {
          this.productNameMap.set(productId, name);
        } else {
          ids.add(productId);
        }
      });
    });

    const missing = Array.from(ids).filter((id) => !this.productNameMap.has(id));
    if (missing.length === 0) {
      return;
    }
    const requests = missing.map((productId) =>
      this.productService.getProduct(productId).pipe(
        map((response) => {
          const product = response?.product || response;
          return {
            productId,
            productName: product?.productName || productId,
          };
        }),
        catchError(() => of({ productId, productName: productId }))
      )
    );

    forkJoin(requests).subscribe({
      next: (results) => {
        results.forEach((result) => {
          if (result?.productId) {
            this.productNameMap.set(result.productId, result.productName || result.productId);
          }
        });
      },
    });
  }

  addItemDialog(params: any = null) {
    this.productItemData = {
      ...params,
      orderId: this.orderId,
    };

    this.dialog
      .open(ProductItemComponent, {
        data: { productItemData: this.productItemData },
      })
      .afterClosed()
      .subscribe((result) => {
        if (this.orderId) {
          if (this.orderPrimaryId) {
            this.getOrderById(this.orderPrimaryId).subscribe();
          }
        }
      });
  }

  addUpdateNoteDialog(params: any = null) {
    this.noteData = {
      ...params,
      orderId: this.orderId,
    };

    this.dialog
      .open(NoteComponent, { data: { noteData: this.noteData } })
      .afterClosed()
      .subscribe((result) => {
        if (this.orderId) {
          if (this.orderPrimaryId) {
            this.getOrderById(this.orderPrimaryId).subscribe();
          }
        }
      });
  }

  deleteNote(note: any): void {
    if (!this.orderId || !note?.id) {
      return;
    }
    const dialogRef = this.dialog.open(ConfirmationDialogComponent, {
      data: {
        title: this.translate.instant('COMMON.CONFIRM'),
        message: this.translate.instant('COMMON.CONFIRM_DELETE'),
      },
    });
    dialogRef.afterClosed().subscribe((confirmed) => {
      if (!confirmed) {
        return;
      }
      this.orderService.deleteOrderNote({ orderId: this.orderId, noteId: note.id }).subscribe({
        next: () => {
          if (this.orderPrimaryId) {
            this.getOrderById(this.orderPrimaryId).subscribe();
          }
        },
      });
    });
  }

  addUpdateContentDialog(params: any = null) {
    this.contentData = {
      ...params,
      orderId: this.orderId,
    };

    this.dialog
      .open(ContentComponent, { data: { contentData: this.contentData } })
      .afterClosed()
      .subscribe((result) => {
        if (this.orderId) {
          if (this.orderPrimaryId) {
            this.getOrderById(this.orderPrimaryId).subscribe();
          }
        }
      });
  }

  editShippingInstructions(part: any): void {
    if (!this.orderId || !part?.orderPartSeqId) {
      return;
    }
    this.dialog.open(ShippingInstructionDialogComponent, {
      data: {
        titleKey: 'PO.SHIPPING_INST',
        shippingInstructions: part?.shippingInstructions || '',
      },
    }).afterClosed().subscribe((value) => {
      if (value === null || value === undefined) {
        return;
      }
      this.orderService.updateShippingInstructions(this.orderId as string, part.orderPartSeqId, value)
        .subscribe(() => {
          if (this.orderPrimaryId) {
            this.getOrderById(this.orderPrimaryId).subscribe();
          }
        });
    });
  }

  openOrderContent(item: any): void {
    if (!this.orderId || !item?.contentId) {
      return;
    }
    this.orderService.downloadOrderContent(this.orderId, item.contentId).subscribe({
      next: (blob) => {
        const url = URL.createObjectURL(blob);
        window.open(url, '_blank', 'noopener');
        setTimeout(() => URL.revokeObjectURL(url), 10000);
      },
      error: () => {
      },
    });
  }

  loadVendorDetails(partyId: string): void {
    this.partyService.getSupplier(partyId).subscribe({
      next: (response) => {
        const supplierDetail = response?.supplierDetail;
        const vendorName = supplierDetail?.party?.groupName || partyId;
        const addresses = Array.isArray(supplierDetail?.postalAddressList)
          ? supplierDetail.postalAddressList
          : [];
        const preferredPurposeOrder = ['SHIP_ORIG_LOCATION', 'SHIPPING_LOCATION', 'PRIMARY_LOCATION'];
        let selected = null;
        for (const purpose of preferredPurposeOrder) {
          selected = addresses.find((address: any) =>
            (address?.contactMechPurposeId || '').toUpperCase() === purpose
          );
          if (selected) {
            break;
          }
        }
        if (!selected && addresses.length) {
          selected = addresses[0];
        }
        const vendorAddresses = selected ? [selected] : [];
        setTimeout(() => {
          this.vendorName = vendorName;
          this.vendorAddresses = vendorAddresses;
          this.cdr.markForCheck();
        }, 0);
      },
      error: () => {
        setTimeout(() => {
          this.vendorName = partyId;
          this.vendorAddresses = [];
          this.cdr.markForCheck();
        }, 0);
      }
    });
  }

  loadFacilityAddress(facilityId: string): void {
    forkJoin({
      contactMechs: this.facilityService.getFacilityContactMechs(facilityId),
      purposes: this.facilityService.getFacilityContactMechPurposes(facilityId),
    }).subscribe({
      next: ({ contactMechs, purposes }) => {
        const mechList = Array.isArray(contactMechs) ? contactMechs : [];
        const purposeList = Array.isArray(purposes) ? purposes : [];
        const purposeMap = new Map<string, string[]>();
        purposeList.forEach((purpose: any) => {
          const list = purposeMap.get(purpose.contactMechId) || [];
          list.push(purpose.contactMechPurposeTypeId);
          purposeMap.set(purpose.contactMechId, list);
        });

        const preferredPurposeOrder = ['SHIPPING_LOCATION', 'PRIMARY_LOCATION', 'SHIP_ORIG_LOCATION'];
        let contactMechId: string | undefined;
        for (const purpose of preferredPurposeOrder) {
          const match = mechList.find((mech: any) =>
            (purposeMap.get(mech.contactMechId) || []).includes(purpose)
          );
          if (match?.contactMechId) {
            contactMechId = match.contactMechId;
            break;
          }
        }
        if (!contactMechId && mechList.length) {
          contactMechId = mechList[0].contactMechId;
        }
        if (!contactMechId) {
          setTimeout(() => {
            this.facilityAddress = null;
            this.cdr.markForCheck();
          }, 0);
          return;
        }
        this.partyService.getPostalAddressByContactMechId(contactMechId).subscribe({
          next: (address) => {
            setTimeout(() => {
              this.facilityAddress = address;
              this.cdr.markForCheck();
            }, 0);
          },
          error: () => {
            setTimeout(() => {
              this.facilityAddress = null;
              this.cdr.markForCheck();
            }, 0);
          },
        });
      },
      error: () => {
        setTimeout(() => {
          this.facilityAddress = null;
          this.cdr.markForCheck();
        }, 0);
      },
    });
  }

  addShipToAddress(): void {
    if (!this.orderId) {
      return;
    }
    const addressData = {
      orderId: this.orderId,
      contactMechPurposeId: 'SHIPPING_LOCATION',
    };

    this.dialog.open(AddEditAddressComponent, {
      data: { addressData },
    }).afterClosed().subscribe(() => {
      if (this.orderId) {
        if (this.orderPrimaryId) {
          this.getOrderById(this.orderPrimaryId).subscribe();
        }
      }
    });
  }

  editVendorAddress(address: any = null): void {
    if (!this.vendorPartyId) {
      return;
    }
    const addressData = {
      partyId: this.vendorPartyId,
      contactMechId: address?.contactMechId,
      contactMechPurposeId: address?.contactMechPurposeId || 'PRIMARY_LOCATION',
      toName: address?.toName,
      address1: address?.address1,
      address2: address?.address2,
      city: address?.city,
      postalCode: address?.postalCode,
      countryGeoId: address?.countryGeoId,
      stateProvinceGeoId: address?.stateProvinceGeoId,
    };

    this.dialog.open(AddEditAddressComponent, {
      data: { addressData },
    }).afterClosed().subscribe(() => {
      if (this.vendorPartyId) {
        this.loadVendorDetails(this.vendorPartyId);
      }
    });
  }

  approveOrder(): void {
    if (!this.orderId) {
      return;
    }
    this.orderService.approvePurchaseOrder(this.orderId).subscribe({
      next: () => {
        if (this.orderPrimaryId) {
          this.getOrderById(this.orderPrimaryId).subscribe();
        }
      },
    });
  }

  goToReceive(): void {
    if (!this.orderPrimaryId) {
      return;
    }
    this.router.navigate([`/pos/${this.orderPrimaryId}/receive`]);
  }

  openPdf(): void {
    if (!this.orderId) {
      return;
    }
    this.orderService.getOrderPdf(this.orderId).subscribe({
      next: (blob) => {
        const url = URL.createObjectURL(blob);
        window.open(url, '_blank');
        setTimeout(() => URL.revokeObjectURL(url), 1000);
      },
    });
  }
}
