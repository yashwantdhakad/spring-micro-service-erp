import { TestBed } from '@angular/core/testing';
import { HTTP_INTERCEPTORS, HttpClient } from '@angular/common/http';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { Router } from '@angular/router';

import { TokenInterceptor } from './token.interceptor';
import { NavigationService } from './navigation.service';
import { TokenStorageService } from './token-storage.service';

describe('TokenInterceptor', () => {
  let http: HttpClient;
  let httpMock: HttpTestingController;
  let routerSpy: jasmine.SpyObj<Router>;
  let navigationSpy: jasmine.SpyObj<NavigationService>;
  let tokenStorage: TokenStorageService;

  beforeEach(() => {
    routerSpy = jasmine.createSpyObj('Router', ['navigate'], { url: '/current' });
    navigationSpy = jasmine.createSpyObj('NavigationService', ['setLastUrl']);

    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [
        {
          provide: HTTP_INTERCEPTORS,
          useClass: TokenInterceptor,
          multi: true,
        },
        { provide: Router, useValue: routerSpy },
        { provide: NavigationService, useValue: navigationSpy },
        TokenStorageService,
      ],
    });

    http = TestBed.inject(HttpClient);
    httpMock = TestBed.inject(HttpTestingController);
    tokenStorage = TestBed.inject(TokenStorageService);
  });

  afterEach(() => {
    httpMock.verify();
    tokenStorage.clearToken();
  });

  it('should add token header', () => {
    tokenStorage.setToken('ABC');
    http.get('/data').subscribe();

    const req = httpMock.expectOne('/data');
    expect(req.request.headers.get('Authorization')).toBe('Bearer ABC');
  });

  it('should handle unauthorized error', () => {
    tokenStorage.setToken('ABC');

    http.get('/data').subscribe({
      error: () => {
        expect(tokenStorage.getToken()).toBeNull();
        expect(navigationSpy.setLastUrl).toHaveBeenCalledWith('/current');
        expect(routerSpy.navigate).toHaveBeenCalledWith(['/login']);
      },
    });

    const req = httpMock.expectOne('/data');
    req.flush('err', { status: 401, statusText: 'Unauthorized' });
  });
});
