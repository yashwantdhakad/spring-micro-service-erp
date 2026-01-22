import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SupplierAutoCompleteComponent } from './supplier-auto-complete.component';

describe('SupplierAutoCompleteComponent', () => {
  let component: SupplierAutoCompleteComponent;
  let fixture: ComponentFixture<SupplierAutoCompleteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SupplierAutoCompleteComponent]
    });
    fixture = TestBed.createComponent(SupplierAutoCompleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
