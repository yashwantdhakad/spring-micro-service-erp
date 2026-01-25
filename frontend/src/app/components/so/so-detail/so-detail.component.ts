import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute } from '@angular/router';
import { forkJoin } from 'rxjs';
import { OrderService } from 'src/app/services/order/order.service';
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
  vendorAddresses: any[] = [];
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
    'totalAmount',
  ];

  contents: any[] = [];
  contentColumns: string[] = ['description', 'contentDate', 'contentLocation'];
  contentData: any;

  productItemData: any;

  constructor(
    private route: ActivatedRoute,
    private orderService: OrderService,
    private partyService: PartyService,
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
    }).subscribe({
      next: ({ orderResponse, displayInfo }) => {
        this.parts = orderResponse.parts;
        this.contents = orderResponse?.contents;
        this.orderHeader = displayInfo.orderHeader;
        this.statusItem = displayInfo.statusItem;
        this.orderNotes = displayInfo.orderNoteList;
        this.firstPartInfo = displayInfo.firstPartInfo;

        const customerPartyId = displayInfo?.firstPart?.customerPartyId;
        if (customerPartyId) {
          this.customerPartyId = customerPartyId;
          this.loadVendorAddresses(customerPartyId);
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

  loadVendorAddresses(partyId: string): void {
    this.partyService.getPartyPostalContactMechByPurpose(partyId, 'PostalShippingOrigin', 'customer').subscribe({
      next: (data) => {
        this.vendorAddresses = Array.isArray(data) ? data : [];
      },
      error: (err) => {
      },
    });
  }

  editVendorAddress(address: any = null): void {
    if (!this.customerPartyId) {
      return;
    }
    const addressData = {
      partyId: this.customerPartyId,
      contactMechId: address?.contactMechId,
      contactMechPurposeId: address?.contactMechPurposeId || 'PostalShippingOrigin',
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
      if (this.customerPartyId) {
        this.loadVendorAddresses(this.customerPartyId);
      }
    });
  }
}
