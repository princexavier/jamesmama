import { TestBed } from '@angular/core/testing';

import { AreamasterService } from './areamaster.service';

describe('AreamasterService', () => {
  let service: AreamasterService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AreamasterService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
