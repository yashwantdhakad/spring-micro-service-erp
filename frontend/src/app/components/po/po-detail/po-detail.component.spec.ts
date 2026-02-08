import { ComponentFixture, TestBed } from '@angular/core/testing';
import { PODetailComponent } from './po-detail.component';
import { ActivatedRoute, Router } from '@angular/router';
import { of, throwError } from 'rxjs';
import { MatDialog } from '@angular/material/dialog';
import { OrderService } from 'src/app/services/order/order.service';
import { PartyService } from 'src/app/services/oms/party/party.service';
import { DatePipe } from '@angular/common';
import { TranslateService } from '@ngx-translate/core';

describe('PODetailComponent', () => {
  let component: PODetailComponent;
  let fixture: ComponentFixture<PODetailComponent>;
  let orderServiceSpy: jasmine.SpyObj<OrderService>;
  let partyServiceSpy: jasmine.SpyObj<PartyService>;
  let dialogSpy: jasmine.SpyObj<MatDialog>;
  let routerSpy: jasmine.SpyObj<Router>;

  beforeEach(async () => {
    const orderSpy = jasmine.createSpyObj('OrderService', ['getOrder', 'getPODisplayInfo']);
    const partySpy = jasmine.createSpyObj('PartyService', ['getPartyPostalContactMechByPurpose']);
    const dialogMock = jasmine.createSpyObj('MatDialog', ['open']);
    const routerMock = jasmine.createSpyObj('Router', ['navigate']);

    await TestBed.configureTestingModule({
      declarations: [PODetailComponent],
      providers: [
        DatePipe,
        { provide: OrderService, useValue: orderSpy },
        { provide: PartyService, useValue: partySpy },
        { provide: MatDialog, useValue: dialogMock },
        { provide: Router, useValue: routerMock },
        {
          provide: ActivatedRoute,
          useValue: {
            params: of({ orderId: 'PO-123' })
          }
        },
        {
          provide: TranslateService,
          useValue: {
            instant: (key: string) => key
          }
        }
      ]
    }).compileComponents();

    fixture = TestBed.createComponent(PODetailComponent);
    component = fixture.componentInstance;

    orderServiceSpy = TestBed.inject(OrderService) as jasmine.SpyObj<OrderService>;
    partyServiceSpy = TestBed.inject(PartyService) as jasmine.SpyObj<PartyService>;
    dialogSpy = TestBed.inject(MatDialog) as jasmine.SpyObj<MatDialog>;
    routerSpy = TestBed.inject(Router) as jasmine.SpyObj<Router>;
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should fetch order and display info on init', () => {
    const mockOrder = {
      parts: [{ productId: 'P1' }],
      contents: [{ description: 'Spec' }]
    };

    const mockDisplay = {
      orderHeader: { orderId: 'PO-123', entryDate: '2024-01-01T00:00:00Z' },
      statusItem: { description: 'Confirmed' },
      orderNoteList: [{ noteText: 'Urgent' }],
      firstPart: { vendorPartyId: 'VENDOR-1' }
    };

    orderServiceSpy.getOrder.and.returnValue(of(mockOrder));
    orderServiceSpy.getPODisplayInfo.and.returnValue(of(mockDisplay));
    partyServiceSpy.getPartyPostalContactMechByPurpose.and.returnValue(of([{ address1: '123 Main St' }]));

    fixture.detectChanges(); // triggers ngOnInit()

    expect(orderServiceSpy.getOrder).toHaveBeenCalledWith('PO-123');
    expect(orderServiceSpy.getPODisplayInfo).toHaveBeenCalledWith('PO-123');
    expect(partyServiceSpy.getPartyPostalContactMechByPurpose).toHaveBeenCalledWith('VENDOR-1', 'PostalShippingOrigin', 'supplier');

    expect(component.parts.length).toBe(1);
    expect(component.contents.length).toBe(1);
    expect(component.orderHeader.orderId).toBe('PO-123');
  });

  it('should handle error in getOrder gracefully', () => {
    orderServiceSpy.getOrder.and.returnValue(throwError(() => new Error('Failed')));
    fixture.detectChanges();

    expect(orderServiceSpy.getOrder).toHaveBeenCalled();
    expect(component.isLoading).toBeFalse();
  });

  it('should handle error in getPODisplayInfo gracefully', () => {
    orderServiceSpy.getOrder.and.returnValue(of({ parts: [], contents: [] }));
    orderServiceSpy.getPODisplayInfo.and.returnValue(throwError(() => new Error('Failed')));
    fixture.detectChanges();

    expect(orderServiceSpy.getPODisplayInfo).toHaveBeenCalled();
    expect(component.isLoading).toBeFalse();
  });

  it('should open ProductItemComponent dialog on addItemDialog()', () => {
    const afterClosedSpy = jasmine.createSpyObj({ afterClosed: of({}) });
    dialogSpy.open.and.returnValue(afterClosedSpy);

    component.orderId = 'PO-123';
    component.addItemDialog();

    expect(dialogSpy.open).toHaveBeenCalled();
    expect(orderServiceSpy.getOrder).toHaveBeenCalledWith('PO-123');
  });

  it('should open NoteComponent dialog on addUpdateNoteDialog()', () => {
    const afterClosedSpy = jasmine.createSpyObj({ afterClosed: of({}) });
    dialogSpy.open.and.returnValue(afterClosedSpy);

    component.orderId = 'PO-123';
    component.addUpdateNoteDialog();

    expect(dialogSpy.open).toHaveBeenCalled();
    expect(orderServiceSpy.getOrder).toHaveBeenCalledWith('PO-123');
  });

  it('should open ContentComponent dialog on addUpdateContentDialog()', () => {
    const afterClosedSpy = jasmine.createSpyObj({ afterClosed: of({}) });
    dialogSpy.open.and.returnValue(afterClosedSpy);

    component.orderId = 'PO-123';
    component.addUpdateContentDialog();

    expect(dialogSpy.open).toHaveBeenCalled();
    expect(orderServiceSpy.getOrder).toHaveBeenCalledWith('PO-123');
  });
});
