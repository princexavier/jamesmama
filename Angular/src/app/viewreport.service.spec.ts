import { TestBed } from '@angular/core/testing';

import { ViewreportService } from './viewreport.service';

describe('ViewreportService', () => {
  let service: ViewreportService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ViewreportService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
