import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute } from '@angular/router';
import { forkJoin, of } from 'rxjs';
import { catchError, map } from 'rxjs/operators';
import { OrderService } from 'src/app/services/order/order.service';
import { CommonService } from 'src/app/services/common/common.service';
import { ProductService } from 'src/app/services/product/product.service';
import { FacilityService } from 'src/app/services/facility/facility.service';
import { PartyService } from 'src/app/services/party/party.service';
import { AddEditAddressComponent } from 'src/app/components/party/add-edit-address/add-edit-address.component';
import { ContentComponent } from '../../order/content/content.component';
import { NoteComponent } from '../../order/note/note.component';
import { ProductItemComponent } from '../../order/product-item/product-item.component';

@Component({
  selector: 'app-so-detail',
  templateUrl: './so-detail.component.html',
  styleUrls: ['./so-detail.component.css'],
})
export class SODetailComponent implements OnInit {
  orderId: string | undefined;
  orderHeader: any;
  statusItem: any;
  canApprove = false;
  canPicklist = false;
  shipToAddresses: any[] = [];
  firstPartInfo: any;
  customerPartyId: string | undefined;
  facilityAddress: any;

  addPOItemDialog: boolean = false;
  createOrderNoteDialog: boolean = false;
  isLoading: boolean = false;
  showTable: boolean = false;

  pages: number = 0;

  noteData: any;
  orderNotes: any[] = [];
  noteColumns: string[] = ['noteText', 'noteDate', 'userId', 'action'];

  itemData: any;
  parts: any[] = [];
  partColumns: string[] = [
    'productId',
    'productName',
    'itemDescription',
    'description',
    'requiredByDate',
    'unitAmount',
    'quantity',
    'pickedQuantity',
    'totalAmount',
  ];

  contents: any[] = [];
  contentColumns: string[] = ['description', 'contentDate', 'contentLocation'];
  contentData: any;

  shipments: any[] = [];
  shipmentColumns: string[] = ['shipmentId', 'shipmentTypeId', 'statusId', 'createdDate'];
  shipmentStatusById = new Map<string, string>();
  statusDescriptionMap = new Map<string, string>();
  shipmentTypeMap = new Map<string, string>();
  orderItemTypeMap = new Map<string, string>();
  productNameMap = new Map<string, string>();

  invoiceItems: any[] = [];
  invoiceColumns: string[] = ['invoiceId', 'productId', 'quantity', 'amount'];

  picklists: any[] = [];
  picklistColumns: string[] = ['picklistId', 'statusId', 'shipmentId', 'createdDate', 'action'];

  productItemData: any;

  constructor(
    private route: ActivatedRoute,
    private orderService: OrderService,
    private commonService: CommonService,
    private productService: ProductService,
    private facilityService: FacilityService,
    private partyService: PartyService,
    private dialog: MatDialog
  ) {}

  ngOnInit(): void {
    this.loadLookupData();
    this.route.params.subscribe((params) => {
      this.orderId = params['orderId'];
      if (this.orderId) {
        this.getOrder(this.orderId);
      }
    });
  }

  getOrder(orderId: string): void {
    this.isLoading = true;

    forkJoin({
      orderResponse: this.orderService.getOrder(orderId),
      displayInfo: this.orderService.getPODisplayInfo(orderId),
      shipments: this.orderService.getOrderShipments(orderId),
      invoices: this.orderService.getOrderInvoices(orderId),
      reservationStatus: this.orderService.getReservationStatus(orderId),
      picklists: this.orderService.getOrderPicklists(orderId),
    }).subscribe({
      next: ({ orderResponse, displayInfo, shipments, invoices, reservationStatus, picklists }) => {
        this.parts = orderResponse.parts;
        this.primeProductNames(this.parts || []);
        this.contents = orderResponse?.contents;
        this.orderHeader = displayInfo.orderHeader;
        this.statusItem = displayInfo.statusItem;
        this.orderNotes = displayInfo.orderNoteList;
        this.firstPartInfo = displayInfo.firstPartInfo;
        this.shipToAddresses = (displayInfo?.orderContactMechList || [])
          .filter((contact: any) => (contact?.contactMechPurposeTypeId || '').toUpperCase() === 'SHIPPING_LOCATION');
        this.shipments = Array.isArray(shipments) ? shipments : [];
        this.shipmentStatusById = new Map(
          this.shipments
            .filter((shipment: any) => shipment?.shipmentId)
            .map((shipment: any) => [shipment.shipmentId, shipment.statusId])
        );
        const invoiceList = Array.isArray(invoices) ? invoices : [];
        this.invoiceItems = invoiceList.flatMap((invoice: any) =>
          (invoice.items || []).map((item: any) => ({
            invoiceId: invoice.invoiceId,
            currencyUomId: invoice.currencyUomId,
            productId: item.productId,
            quantity: item.quantity,
            amount: item.amount
          }))
        );
        this.picklists = Array.isArray(picklists) ? picklists : [];
        this.canApprove = this.statusItem?.statusId === 'ORDER_CREATED' && this.hasAnyItems();
        this.canPicklist = reservationStatus?.fullyReserved === true
          && this.hasRemainingPickQuantity()
          && this.picklists.length === 0;

        const customerPartyId = displayInfo?.firstPart?.customerPartyId;
        if (customerPartyId) {
          this.customerPartyId = customerPartyId;
        }

        const facilityId = displayInfo?.firstPart?.facilityId || this.orderHeader?.originFacilityId;
        if (facilityId) {
          this.loadFacilityAddress(facilityId);
        } else {
          this.facilityAddress = null;
        }
      },
      error: (error) => {
        this.isLoading = false;
      },
      complete: () => {
        this.isLoading = false;
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

        const preferredPurposeOrder = ['SHIP_ORIG_LOCATION', 'SHIPPING_LOCATION', 'PRIMARY_LOCATION'];
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

  addItemDialog(params: any = null): void {
    this.productItemData = {
      ...params,
      orderId: this.orderId,
    };

    this.dialog.open(ProductItemComponent, {
      data: { productItemData: this.productItemData },
    }).afterClosed().subscribe(() => {
      if (this.orderId) this.getOrder(this.orderId);
    });
  }

  addUpdateNoteDialog(params: any = null): void {
    this.noteData = {
      ...params,
      orderId: this.orderId,
    };

    this.dialog.open(NoteComponent, {
      data: { noteData: this.noteData },
    }).afterClosed().subscribe(() => {
      if (this.orderId) this.getOrder(this.orderId);
    });
  }

  addUpdateContentDialog(params: any = null): void {
    this.contentData = {
      ...params,
      orderId: this.orderId,
    };

    this.dialog.open(ContentComponent, {
      data: { contentData: this.contentData },
    }).afterClosed().subscribe(() => {
      if (this.orderId) this.getOrder(this.orderId);
    });
  }

  editShipToAddress(address: any = null): void {
    if (!this.orderId) {
      return;
    }
    const postal = address?.postalAddress || {};
    const addressData = {
      orderId: this.orderId,
      contactMechId: address?.contactMechId,
      contactMechPurposeId: address?.contactMechPurposeTypeId || 'SHIPPING_LOCATION',
      defaultPurpose: 'SHIPPING_LOCATION',
      toName: postal?.toName,
      address1: postal?.address1,
      address2: postal?.address2,
      city: postal?.city,
      postalCode: postal?.postalCode,
      countryGeoId: postal?.countryGeoId,
      stateProvinceGeoId: postal?.stateProvinceGeoId || postal?.stateProvinceGeo?.geoName,
    };

    this.dialog.open(AddEditAddressComponent, {
      data: { addressData },
    }).afterClosed().subscribe(() => {
      if (this.orderId) {
        this.getOrder(this.orderId);
      }
    });
  }

  approveOrder(): void {
    if (!this.orderId) {
      return;
    }
    this.orderService.approveSalesOrder(this.orderId).subscribe({
      next: () => {
        this.getOrder(this.orderId as string);
      },
    });
  }

  createPicklist(): void {
    if (!this.orderId) {
      return;
    }
    this.orderService.createPicklist(this.orderId).subscribe({
      next: () => {
        this.getOrder(this.orderId as string);
      },
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
      }
    });
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

  markPicklistPicked(picklistId: string): void {
    if (!picklistId) {
      return;
    }
    this.orderService.markPicklistPicked(picklistId).subscribe({
      next: () => {
        if (this.orderId) {
          this.getOrder(this.orderId);
        }
      },
    });
  }

  shipShipment(shipmentId: string): void {
    if (!shipmentId) {
      return;
    }
    this.orderService.shipShipment(shipmentId).subscribe({
      next: () => {
        if (this.orderId) {
          this.getOrder(this.orderId);
        }
      },
    });
  }

  private hasRemainingPickQuantity(): boolean {
    return (this.parts || []).some((part: any) =>
      (part.items || []).some((item: any) => {
        const qty = Number(item?.quantity || 0);
        const picked = Number(item?.pickedQuantity || 0);
        return picked < qty;
      })
    );
  }

  private hasAnyItems(): boolean {
    return (this.parts || []).some((part: any) => (part.items || []).length > 0);
  }

  getShipmentStatus(shipmentId: string | undefined): string | undefined {
    if (!shipmentId) {
      return undefined;
    }
    return this.shipmentStatusById.get(shipmentId);
  }
}
