import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { ApiService } from './api.service';
import { TokenStorageService } from './token-storage.service';
import { ApiConfigService } from './api-config.service';
import { environment } from 'src/environments/environment';

describe('ApiService', () => {
  let service: ApiService;
  let httpTestingController: HttpTestingController;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [ApiService, TokenStorageService, ApiConfigService]
    });
    service = TestBed.inject(ApiService);
    httpTestingController = TestBed.inject(HttpTestingController);
  });

  afterEach(() => {
    httpTestingController.verify();
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should perform GET request', () => {
    const testData = { name: 'Test Data' };

    service.get('/test-endpoint').subscribe(data => {
      expect(data).toEqual(testData);
    });

    const req = httpTestingController.expectOne(environment.apiUrl + '/test-endpoint');
    expect(req.request.method).toEqual('GET');
    req.flush(testData);
  });

  it('should handle error', () => {
    const errorMessage = 'test 404 error';

    service.get('/test-endpoint').subscribe(
      () => fail('expected an error, not data'),
      error => expect(error).toContain('404')
    );

    const req = httpTestingController.expectOne(environment.apiUrl + '/test-endpoint');

    req.flush(errorMessage, { status: 404, statusText: 'Not Found' });
  });
});
