import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute } from '@angular/router';
import { forkJoin } from 'rxjs';
import { OrderService } from 'src/app/services/order/order.service';
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

  invoiceItems: any[] = [];
  invoiceColumns: string[] = ['invoiceId', 'productId', 'quantity', 'amount'];

  picklists: any[] = [];
  picklistColumns: string[] = ['picklistId', 'statusId', 'shipmentId', 'createdDate', 'action'];

  productItemData: any;

  constructor(
    private route: ActivatedRoute,
    private orderService: OrderService,
    private dialog: MatDialog
  ) {}

  ngOnInit(): void {
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
      },
      error: (error) => {
        this.isLoading = false;
      },
      complete: () => {
        this.isLoading = false;
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
