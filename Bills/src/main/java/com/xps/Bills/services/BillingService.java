package com.xps.Bills.services;

import java.util.List;

import com.xps.Bills.Pojos.Billing;

public interface BillingService {

	public List<Billing>saveBilling(String billings);
	public List<Billing>findAllByDateCreated(String dateCreated);

}
