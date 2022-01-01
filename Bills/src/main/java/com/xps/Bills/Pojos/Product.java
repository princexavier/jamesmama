package com.xps.Bills.Pojos;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Product {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "prodseq")
	@SequenceGenerator(name = "james_flower", sequenceName = "james_flower.prodseq")
	@Column(name = "PID")
	private Long productId;

	@Column(name = "PNAME")
	private String productName; 
	@Column(name = "CREATED_DATE")
	private Date createdDate;

    
  //bi-directional many-to-one association to LpcomDocument
  		@OneToMany(mappedBy="product")
  		private List<Billing> billingList;
	
	public List<Billing> getBillingList() {
		return billingList;
	}
	public void setBillingList(List<Billing> billingList) {
		this.billingList = billingList;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", createdDate=" + createdDate
				+ "]";
	}
}
