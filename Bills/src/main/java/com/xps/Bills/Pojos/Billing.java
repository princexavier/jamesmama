package com.xps.Bills.Pojos;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Billing {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "billingSeq")
	@SequenceGenerator(name = "james_flower", sequenceName = "james_flower.billingSeq")
	@Column
	private Long idBILLING;
	@Column
	private String customerName;
	@Column(name = "cust_group")
	private String customerGroup;
	@Column
	private BigDecimal amount;
	@Column(name = "date_created")
	private Date createdDate;
	@ManyToOne
	@JoinColumn(name="PRODUCT")
	private Product product;  

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getCustomerId() {
		return idBILLING;
	}

	public void setCustomerId(Long idBILLING) {
		this.idBILLING = idBILLING;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGroup() {
		return customerGroup;
	}

	public void setCustomerGroup(String customerGroup) {
		this.customerGroup = customerGroup;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Billing [idBILLING=" + idBILLING + ", customerName=" + customerName + ", customerGroup=" + customerGroup
				+ ", amount=" + amount + ", createdDate=" + createdDate + "]";
	}

}
