package com.customerService.payload;

import java.util.Date;

public class InvoiceResponse {

	private Long idOrder;
	private Long idCustomer;
	private Double amount;
	private Long idCard;
	private Date modificationDate;
	private Long idStateOrder;
	
	public InvoiceResponse(Long idOrder, Long idCustomer, Double amount, Long idCard, Date modificationDate, Long idStateOrder) {
		super();
		this.idOrder = idOrder;
		this.idCustomer = idCustomer;
		this.amount = amount;
		this.idCard = idCard;
		this.modificationDate = modificationDate;
		this.idStateOrder = idStateOrder;
	}
	public Long getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}
	public Long getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Long getIdCard() {
		return idCard;
	}
	public void setIdCard(Long idCard) {
		this.idCard = idCard;
	}
	public Date getModificationDate() {
		return modificationDate;
	}
	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}
	public Long getIdStateOrder() {
		return idStateOrder;
	}
	public void setIdStateOrder(Long idStateOrder) {
		this.idStateOrder = idStateOrder;
	}
	
	
	
}
