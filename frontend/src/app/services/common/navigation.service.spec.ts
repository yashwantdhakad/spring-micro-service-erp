import { TestBed } from '@angular/core/testing';

import { NavigationService } from './navigation.service';

describe('NavigationService', () => {
  let service: NavigationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NavigationService);
    localStorage.clear();
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should store last url in localStorage', () => {
    service.setLastUrl('/home');
    expect(localStorage.getItem('lastUrl')).toBe('/home');
  });

  it('should return stored url from getLastUrl', () => {
    service.setLastUrl('/dashboard');
    expect(service.getLastUrl()).toBe('/dashboard');
  });
});
