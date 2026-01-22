import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { ShipmentService } from './shipment.service';
import { ApiService } from '../common/api.service';
import { of } from 'rxjs';
import { HttpResponse } from '@angular/common/http';

describe('ShipmentService', () => {
  let service: ShipmentService;
  let apiServiceSpy: jasmine.SpyObj<ApiService>;

  beforeEach(() => {
    const spy = jasmine.createSpyObj('ApiService', ['customGet', 'get']);

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
    const mockResponse = new HttpResponse({
      body: { shipments: ['SHP001'], total: 1 },
      status: 200,
      statusText: 'OK',
      url: '/api/rest/s1/mantle/shipments?pageIndex=0&queryString=test'
    });


    const pageIndex = 0;
    const keyword = 'test';
    const expectedUrl = `/api/rest/s1/mantle/shipments?pageIndex=${pageIndex}&queryString=${keyword}`;

    apiServiceSpy.customGet.and.returnValue(of(mockResponse));

    service.getShipments(pageIndex, keyword).subscribe((res) => {
      expect(res).toEqual(mockResponse);
      expect(apiServiceSpy.customGet).toHaveBeenCalledWith(expectedUrl);
      done();
    });
  });

  it('should fetch single shipment', (done) => {
    const shipmentId = 'SHP001';
    const mockResponse = { shipmentId: 'SHP001', status: 'DELIVERED' };
    const expectedUrl = `/api/rest/s1/mantle/shipments/${shipmentId}`;

    apiServiceSpy.get.and.returnValue(of(mockResponse));

    service.getShipment(shipmentId).subscribe((res) => {
      expect(res).toEqual(mockResponse);
      expect(apiServiceSpy.get).toHaveBeenCalledWith(expectedUrl);
      done();
    });
  });
});
