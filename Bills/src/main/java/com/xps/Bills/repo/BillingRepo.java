package com.xps.Bills.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xps.Bills.Pojos.Billing;

@Repository
public interface BillingRepo extends JpaRepository<Billing, Long> {

//	@Query(value="select * from Billing where DATE_CREATED = :DATE_CREATED",nativeQuery = true)
	public List<Billing> findAllByCreatedDate(Date DATE_CREATED) ;
	
}
