package com.customerService.payload;

import java.util.Date;

public class ReceiptResponse {

	private Long idOrder;
	private Long idStateOrder;
	private Long idCustomer;
	private Double amount;
	private Long idCard;
	private String cardType;
	private Date modificationDate;
	
	
	
	public ReceiptResponse(Long idOrder, Long idStateOrder, Long idCustomer, Double amount, Long idCard, String cardType,
			Date modificationDate) {
		super();
		this.idOrder = idOrder;
		this.idStateOrder = idStateOrder;
		this.idCustomer = idCustomer;
		this.amount = amount;
		this.idCard = idCard;
		this.cardType = cardType;
		this.modificationDate = modificationDate;
	}
	public Long getIdStateOrder() {
		return idStateOrder;
	}
	public void setIdStateOrder(Long idStateOrder) {
		this.idStateOrder = idStateOrder;
	}
	public Long getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}
	public Long getIdCard() {
		return idCard;
	}
	public void setIdCard(Long idCard) {
		this.idCard = idCard;
	}
	public Long getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Date getModificationDate() {
		return modificationDate;
	}
	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}
	
	
	
	
}
