import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BillingviewComponent } from './billingview.component';

describe('BillingviewComponent', () => {
  let component: BillingviewComponent;
  let fixture: ComponentFixture<BillingviewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BillingviewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BillingviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
