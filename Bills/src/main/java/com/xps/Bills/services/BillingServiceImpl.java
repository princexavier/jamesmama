package com.xps.Bills.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xps.Bills.Pojos.Billing;
import com.xps.Bills.repo.BillingRepo;

@Service
public class BillingServiceImpl implements BillingService{
	
	@Autowired
	BillingRepo billingRepo;
	@Override
	public List<Billing> saveBilling(String billings) {
		List<Billing> participantJsonList=null;
	try {
		ObjectMapper mapper = new ObjectMapper();
		participantJsonList = mapper.readValue(billings, new TypeReference<List<Billing>>(){});
		System.out.println(participantJsonList);
	}
	catch(Exception e) {
		
	}
		// TODO Auto-generated method stub
		return billingRepo.saveAll(participantJsonList);
	}
	@Override
	public List<Billing> findAllByDateCreated(String dateCreated) {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

		Date date=null;
		try {
			date = formatter.parse(dateCreated);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		

		return billingRepo.findAllByCreatedDate(date);
	}

}
