import { TestBed } from '@angular/core/testing';

import { CustomergroupService } from './customergroup.service';

describe('CustomergroupService', () => {
  let service: CustomergroupService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CustomergroupService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
