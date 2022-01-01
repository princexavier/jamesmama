package com.xps.Bills.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.xps.Bills.Pojos.AreaMaster;
import com.xps.Bills.Pojos.Billing;
import com.xps.Bills.Pojos.Product;
import com.xps.Bills.services.AreaServiceImpl;
import com.xps.Bills.services.BillingServiceImpl;
import com.xps.Bills.services.ProductServiceImpl;

@RestController
public class RESTController {

	@Autowired
	BillingServiceImpl billingServiceImpl;

	@Autowired
	AreaServiceImpl areaServiceImpl;
	
	@Autowired
	ProductServiceImpl productServiceImpl;

	@RequestMapping(value = "addBilling", method = RequestMethod.POST)
	public List<Billing> addBilling(@RequestBody String requestData)
			throws JsonMappingException, JsonProcessingException {

		return billingServiceImpl.saveBilling(requestData);

	}

	@RequestMapping(value = "getBilling", method = RequestMethod.GET)
	public String getBilling() {
		return "Hi";

	}

	@RequestMapping(value = "addArea", method = RequestMethod.POST)
	public AreaMaster addArea(@RequestBody String requestData) {

		return areaServiceImpl.saveArea(requestData);

	}

	@RequestMapping(value = "getAreas", method = RequestMethod.GET)
	public List<AreaMaster> getAreas() {

		return areaServiceImpl.getAreas();

	}
	
	@RequestMapping(value = "viewbydate", method = RequestMethod.POST)
	public List<Billing> viewbydate(@RequestBody String requestDate) {

		return billingServiceImpl.findAllByDateCreated(requestDate);

	}
	
	@RequestMapping(value = "addProduct", method = RequestMethod.POST)
	public Product addProduct(@RequestBody String requestData) {

		return productServiceImpl.saveProduct(requestData);

	}
	
	@RequestMapping(value = "getProducts", method = RequestMethod.GET)
	public List<Product> getProducts() {

		return productServiceImpl.getProducts();

	}
	
	

}
