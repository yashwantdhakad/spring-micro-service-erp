import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ShipmentService } from './shipment.service';
import { ApiService } from '../common/api.service';
import { of } from 'rxjs';

describe('ShipmentService', () => {
  let service: ShipmentService;
  let apiServiceSpy: jasmine.SpyObj<ApiService>;

  beforeEach(() => {
    const spy = jasmine.createSpyObj('ApiService', ['get', 'post']);

    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [
        ShipmentService,
        { provide: ApiService, useValue: spy }
      ]
    });

    service = TestBed.inject(ShipmentService);
    apiServiceSpy = TestBed.inject(ApiService) as jasmine.SpyObj<ApiService>;
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should fetch shipments', (done) => {
    const pageIndex = 0;
    const keyword = 'test';
    const expectedUrl = `/wms/api/shipments?page=${pageIndex}&size=10&queryString=${keyword}`;
    const mockResponse = { responseMap: { resultList: ['SHP001'], total: 1 } };

    apiServiceSpy.get.and.returnValue(of(mockResponse));

    service.getShipments(pageIndex, keyword).subscribe((res) => {
      expect(res).toEqual(mockResponse);
      expect(apiServiceSpy.get).toHaveBeenCalledWith(expectedUrl);
      done();
    });
  });

  it('should fetch single shipment', (done) => {
    const shipmentId = 'SHP001';
    const mockResponse = { shipmentId: 'SHP001', status: 'DELIVERED' };
    const expectedUrl = `/wms/api/shipments/${shipmentId}`;

    apiServiceSpy.get.and.returnValue(of(mockResponse));

    service.getShipment(shipmentId).subscribe((res) => {
      expect(res).toEqual(mockResponse);
      expect(apiServiceSpy.get).toHaveBeenCalledWith(expectedUrl);
      done();
    });
  });

  it('should create a shipment', (done) => {
    const payload = { shipment: { shipmentTypeId: 'SALES_SHIPMENT', statusId: 'SHIPMENT_INPUT' } };
    const mockResponse = { shipment: { shipmentId: 'SHP001' } };
    const expectedUrl = '/wms/api/shipments';

    apiServiceSpy.post.and.returnValue(of(mockResponse));

    service.createShipment(payload).subscribe((res) => {
      expect(res).toEqual(mockResponse);
      expect(apiServiceSpy.post).toHaveBeenCalledWith(expectedUrl, payload);
      done();
    });
  });
});
