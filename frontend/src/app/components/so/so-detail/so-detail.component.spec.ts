import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { of, throwError } from 'rxjs';
import { ActivatedRoute } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { SODetailComponent } from './so-detail.component';
import { OrderService } from 'src/app/services/order/order.service';
import { PartyService } from 'src/app/services/party/party.service';

describe('SODetailComponent', () => {
  let component: SODetailComponent;
  let fixture: ComponentFixture<SODetailComponent>;
  let orderService: jasmine.SpyObj<OrderService>;
  let partyService: jasmine.SpyObj<PartyService>;
  let dialog: jasmine.SpyObj<MatDialog>;

  const mockRoute = {
    params: of({ orderId: 'ORDER123' }),
  };

  beforeEach(async () => {
    const orderSpy = jasmine.createSpyObj('OrderService', ['getOrder', 'getPODisplayInfo']);
    const partySpy = jasmine.createSpyObj('PartyService', ['getPartyPostalContactMechByPurpose']);
    const dialogSpy = jasmine.createSpyObj('MatDialog', ['open']);

    await TestBed.configureTestingModule({
      declarations: [SODetailComponent],
      providers: [
        { provide: OrderService, useValue: orderSpy },
        { provide: PartyService, useValue: partySpy },
        { provide: MatDialog, useValue: dialogSpy },
        { provide: ActivatedRoute, useValue: mockRoute },
      ],
    }).compileComponents();

    orderService = TestBed.inject(OrderService) as jasmine.SpyObj<OrderService>;
    partyService = TestBed.inject(PartyService) as jasmine.SpyObj<PartyService>;
    dialog = TestBed.inject(MatDialog) as jasmine.SpyObj<MatDialog>;
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SODetailComponent);
    component = fixture.componentInstance;
  });

  it('should create component', () => {
    fixture.detectChanges();
    expect(component).toBeTruthy();
  });

  it('should call getOrder with route param on init', fakeAsync(() => {
    const mockOrderResponse = {
      parts: [{ productId: 'P1' }],
      contents: [{ description: 'Manual' }],
    };
    const mockDisplayInfo = {
      orderHeader: { orderId: 'ORDER123' },
      statusItem: { statusId: 'ORDER_CREATED' },
      orderNoteList: [],
      firstPartInfo: {},
      firstPart: { customerPartyId: 'CUST123' },
    };

    orderService.getOrder.and.returnValue(of(mockOrderResponse));
    orderService.getPODisplayInfo.and.returnValue(of(mockDisplayInfo));
    partyService.getPartyPostalContactMechByPurpose.and.returnValue(of([{ address1: '123 Main St' }]));

    fixture.detectChanges(); // triggers ngOnInit
    tick();

    expect(orderService.getOrder).toHaveBeenCalledWith('ORDER123');
    expect(orderService.getPODisplayInfo).toHaveBeenCalledWith('ORDER123');
    expect(partyService.getPartyPostalContactMechByPurpose).toHaveBeenCalledWith('CUST123', 'PostalShippingOrigin', 'customer');
    expect(component.parts.length).toBe(1);
    expect(component.orderHeader.orderId).toBe('ORDER123');
    expect(component.isLoading).toBeFalse();
  }));

  it('should handle getOrder error', fakeAsync(() => {
    orderService.getOrder.and.returnValue(throwError(() => new Error('Order error')));
    orderService.getPODisplayInfo.and.returnValue(of({}));

    fixture.detectChanges();
    tick();

    expect(component.isLoading).toBeFalse();
  }));

  it('should open addUpdateNoteDialog and refresh on close', fakeAsync(() => {
    const dialogRefSpyObj = jasmine.createSpyObj({ afterClosed: of(true), close: null });
    dialog.open.and.returnValue(dialogRefSpyObj);
    component.orderId = 'ORDER123';
    orderService.getOrder.and.returnValue(of({ parts: [], contents: [] }));
    orderService.getPODisplayInfo.and.returnValue(of({}));

    component.addUpdateNoteDialog({ noteText: 'Note' });
    tick();

    expect(dialog.open).toHaveBeenCalled();
    expect(orderService.getOrder).toHaveBeenCalledWith('ORDER123');
  }));

  it('should open addItemDialog and refresh on close', fakeAsync(() => {
    const dialogRefSpyObj = jasmine.createSpyObj({ afterClosed: of(true), close: null });
    dialog.open.and.returnValue(dialogRefSpyObj);
    component.orderId = 'ORDER123';
    orderService.getOrder.and.returnValue(of({ parts: [], contents: [] }));
    orderService.getPODisplayInfo.and.returnValue(of({}));

    component.addItemDialog({ productId: 'P001' });
    tick();

    expect(dialog.open).toHaveBeenCalled();
    expect(orderService.getOrder).toHaveBeenCalledWith('ORDER123');
  }));

  it('should open addUpdateContentDialog and refresh on close', fakeAsync(() => {
    const dialogRefSpyObj = jasmine.createSpyObj({ afterClosed: of(true), close: null });
    dialog.open.and.returnValue(dialogRefSpyObj);
    component.orderId = 'ORDER123';
    orderService.getOrder.and.returnValue(of({ parts: [], contents: [] }));
    orderService.getPODisplayInfo.and.returnValue(of({}));

    component.addUpdateContentDialog({ contentLocation: 'URL' });
    tick();

    expect(dialog.open).toHaveBeenCalled();
    expect(orderService.getOrder).toHaveBeenCalledWith('ORDER123');
  }));

  it('should load vendor addresses directly', fakeAsync(() => {
    partyService.getPartyPostalContactMechByPurpose.and.returnValue(of([{ city: 'Test' }]));
    component.loadVendorAddresses('PARTY001');
    tick();
    expect(component.vendorAddresses.length).toBe(1);
  }));
});
