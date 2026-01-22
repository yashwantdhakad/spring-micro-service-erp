import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { AuthService } from './auth.service';
import { TokenStorageService } from './token-storage.service';
import { ApiConfigService } from './api-config.service';
import { Router } from '@angular/router';

describe('AuthService', () => {
  let service: AuthService;
  let httpTestingController: HttpTestingController;
  let routerSpy: jasmine.SpyObj<Router>;
  let tokenStorage: TokenStorageService;

  beforeEach(() => {
    const spy = jasmine.createSpyObj('Router', ['navigateByUrl']);

    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [
        AuthService,
        { provide: Router, useValue: spy },
        TokenStorageService,
        ApiConfigService
      ],
    });

    service = TestBed.inject(AuthService);
    httpTestingController = TestBed.inject(HttpTestingController);
    routerSpy = TestBed.inject(Router) as jasmine.SpyObj<Router>;
    tokenStorage = TestBed.inject(TokenStorageService);
  });

  afterEach(() => {
    httpTestingController.verify();
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should login', () => {
    const mockResponse = { accessToken: '12345' };

    service.login('john.doe', 'moqui').subscribe(response => {
      expect(response).toEqual(mockResponse);
    });

    const req = httpTestingController.expectOne('http://localhost:8080/security/auth/login');
    expect(req.request.method).toBe('POST');
    req.flush(mockResponse);
  });

  it('should set token', () => {
    service.setToken('12345');
    expect(tokenStorage.getToken()).toBe('12345');
  });

  it('should get token', () => {
    tokenStorage.setToken('12345');
    expect(service.getToken()).toBe('12345');
  });

  it('should check if user is authenticated', () => {
    tokenStorage.setToken('12345');
    expect(service.isAuthenticated()).toBeTrue();

    tokenStorage.clearToken();
    expect(service.isAuthenticated()).toBeFalse();
  });

  it('should logout', () => {
    tokenStorage.setToken('12345');
    service.logout();
    expect(tokenStorage.getToken()).toBeNull();
    expect(routerSpy.navigateByUrl).toHaveBeenCalledWith('/login');
  });
});
