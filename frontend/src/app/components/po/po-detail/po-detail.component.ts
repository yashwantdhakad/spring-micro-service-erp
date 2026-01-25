import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute } from '@angular/router';
import { OrderService } from 'src/app/services/order/order.service';
import { PartyService } from 'src/app/services/party/party.service';
import { DatePipe } from '@angular/common';
import { TranslateService } from '@ngx-translate/core';
import { AddEditAddressComponent } from 'src/app/components/party/add-edit-address/add-edit-address.component';
import { ContentComponent } from '../../order/content/content.component';
import { NoteComponent } from '../../order/note/note.component';
import { ProductItemComponent } from '../../order/product-item/product-item.component';

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
  vendorPartyId: string | undefined;

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

  contentData: any;
  productItemData: any;

  overviewFields: { label: string, value: any }[] = [];

  constructor(
    private route: ActivatedRoute,
    private orderService: OrderService,
    private partyService: PartyService,
    private dialog: MatDialog,
    private datePipe: DatePipe,
    private translate: TranslateService
  ) { }

  ngOnInit(): void {
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

    order$.subscribe({
      next: (orderResponse) => {
        this.parts = orderResponse.parts;
        this.contents = orderResponse.contents;

        display$.subscribe({
          next: (displayResponse) => {
            this.orderHeader = displayResponse.orderHeader;
            this.statusItem = displayResponse.statusItem;
            this.orderNotes = displayResponse.orderNoteList;

            this.overviewFields = [
              { label: 'Order #', value: this.orderHeader?.orderId },
              { label: 'Order Date', value: this.datePipe.transform(this.orderHeader?.entryDate, 'MMMM d, y') },
              { label: 'Status', value: this.statusItem?.description },
            ];

            if (displayResponse?.firstPart?.vendorPartyId) {
              this.vendorPartyId = displayResponse.firstPart.vendorPartyId;
              this.loadVendorAddresses(displayResponse.firstPart.vendorPartyId);
            }
          },
          error: (error) => {
            this.isLoading = false;
          },
          complete: () => {
            this.isLoading = false;
          }
        });
      },
      error: (error) => {
        this.isLoading = false;
      }
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

  loadVendorAddresses(partyId: string): void {
    this.partyService.getPartyPostalContactMechByPurpose(partyId, 'PostalShippingOrigin', 'supplier').subscribe({
      next: (data) => {
        this.vendorAddresses = Array.isArray(data) ? data : [];
      },
      error: (error) => {
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
      if (this.vendorPartyId) {
        this.loadVendorAddresses(this.vendorPartyId);
      }
    });
  }
}
