import { Component, OnInit } from '@angular/core';
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
import { forkJoin, of } from 'rxjs';
import { catchError, map } from 'rxjs/operators';

@Component({
  selector: 'app-po-detail',
  templateUrl: './po-detail.component.html',
  styleUrls: ['./po-detail.component.css'],
  providers: [DatePipe]
})
export class PODetailComponent implements OnInit {
  orderId: string | undefined;
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

  addPOItemDialog: boolean = false;
  createOrderNoteDialog: boolean = false;
  isLoading: boolean = false;

  pages: number = 0;

  noteData: any;
  orderNotes: any[] = [];
  noteColumns = [
    { key: 'noteText', label: this.translate.instant('PO.NOTE') },
    { key: 'noteDate', label: this.translate.instant('PO.NOTE_DATE') },
    { key: 'userId', label: this.translate.instant('PO.CREATED_BY') },
    { key: 'action', label: this.translate.instant('PO.ACTION') }
  ];
  noteColumnKeys: string[] = this.noteColumns.map(c => c.key);

  itemData: any;
  parts: any[] = [];
  partColumns = [
    { key: 'productId', label: this.translate.instant('PO.PRODUCT_ID') },
    { key: 'productName', label: this.translate.instant('PO.PRODUCT_NAME') },
    { key: 'itemDescription', label: this.translate.instant('PO.ITEM_DESCRIPTION') },
    { key: 'description', label: this.translate.instant('PO.TYPE') },
    { key: 'requiredByDate', label: this.translate.instant('PO.REQUIRED_BY_DATE') },
    { key: 'unitAmount', label: this.translate.instant('PO.PRICE') },
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
    private productService: ProductService
  ) { }

  ngOnInit(): void {
    this.loadLookupData();
    this.route.params.subscribe((params) => {
      this.orderId = params['orderId'];
      if (this.orderId) {
        this.isLoading = true;
        this.getOrder(this.orderId);
      }
    });
  }

  getOrder(orderId: string): void {
    this.isLoading = true;

    const order$ = this.orderService.getOrder(orderId);
    const display$ = this.orderService.getPODisplayInfo(orderId);
    const shipments$ = this.orderService.getOrderShipments(orderId);
    const invoices$ = this.orderService.getOrderInvoices(orderId);

    order$.subscribe({
      next: (orderResponse) => {
        this.parts = orderResponse.parts;
        this.primeProductNames(this.parts || []);
        this.contents = orderResponse.contents;

        display$.subscribe({
          next: (displayResponse) => {
            this.orderHeader = displayResponse.orderHeader;
            this.statusItem = displayResponse.statusItem;
            this.orderNotes = displayResponse.orderNoteList;
            this.canApprove = this.statusItem?.statusId === 'ORDER_CREATED';
            this.canReceive = this.statusItem?.statusId === 'ORDER_APPROVED';

            this.overviewFields = [
              { label: 'Order #', value: this.orderHeader?.orderId },
              { label: 'Order Date', value: this.datePipe.transform(this.orderHeader?.entryDate, 'MMMM d, y') },
              { label: 'Status', value: this.statusItem?.description },
            ];

            if (displayResponse?.firstPart?.vendorPartyId) {
              this.vendorPartyId = displayResponse.firstPart.vendorPartyId;
              this.loadVendorDetails(displayResponse.firstPart.vendorPartyId);
            }

            this.facilityId = displayResponse?.firstPart?.facilityId || this.orderHeader?.originFacilityId;
            if (this.facilityId) {
              this.loadFacilityAddress(this.facilityId);
            }

            const shippingContacts = (displayResponse?.orderContactMechList || [])
              .filter((contact: any) => (contact?.contactMechPurposeTypeId || '').toUpperCase() === 'SHIPPING_LOCATION');
            this.orderShipToAddress = shippingContacts.length ? shippingContacts[0]?.postalAddress : null;
          },
          error: (error) => {
            this.isLoading = false;
          },
          complete: () => {
            this.isLoading = false;
          }
        });

        shipments$.subscribe({
          next: (shipmentResponse) => {
            this.shipments = Array.isArray(shipmentResponse) ? shipmentResponse : [];
          },
          error: () => {
            this.shipments = [];
          }
        });

        invoices$.subscribe({
          next: (invoiceResponse) => {
            const invoices = Array.isArray(invoiceResponse) ? invoiceResponse : [];
            this.invoiceItems = invoices.flatMap((invoice: any) =>
              (invoice.items || []).map((item: any) => ({
                invoiceId: invoice.invoiceId,
                currencyUomId: invoice.currencyUomId,
                productId: item.productId,
                quantity: item.quantity,
                amount: item.amount
              }))
            );
          },
          error: () => {
            this.invoiceItems = [];
          }
        });
      },
      error: (error) => {
        this.isLoading = false;
      }
    });
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
          this.getOrder(this.orderId);
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
          this.getOrder(this.orderId);
        }
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
          this.getOrder(this.orderId);
        }
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
        this.vendorName = supplierDetail?.party?.groupName || partyId;
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
        this.vendorAddresses = selected ? [selected] : [];
      },
      error: () => {
        this.vendorName = partyId;
        this.vendorAddresses = [];
      },
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
          this.facilityAddress = null;
          return;
        }
        this.partyService.getPostalAddressByContactMechId(contactMechId).subscribe({
          next: (address) => {
            this.facilityAddress = address;
          },
          error: () => {
            this.facilityAddress = null;
          },
        });
      },
      error: () => {
        this.facilityAddress = null;
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
        this.getOrder(this.orderId);
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
        this.getOrder(this.orderId as string);
      },
    });
  }

  goToReceive(): void {
    if (!this.orderId) {
      return;
    }
    this.router.navigate([`/pos/${this.orderId}/receive`]);
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
