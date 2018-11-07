package com.customerService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "CREDITCARD")
public class CreditCard {

	@Id
	@Column(name = "IDCARD")
	private Long idCard;
	
	@Column(name = "IDCUSTOMER")
	private Long idCustomer;
	
	@Column(name = "NUMBERCARD")
	private Long numberCard;
	
	@Column(name = "CARDTYPE")
	private String cardType;
	
	@Column(name = "EXPIRATIONMONTH")
	private Integer expirationMonth;
	
	@Column(name = "EXPIRATIONYEAR")
	private Integer expirationYear;
	
	
	
	public CreditCard(Long idCard, Long idCustomer, Long numberCard, String cardType, Integer expirationMonth,
			Integer expirationYear) {
		super();
		this.idCard = idCard;
		this.idCustomer = idCustomer;
		this.numberCard = numberCard;
		this.cardType = cardType;
		this.expirationMonth = expirationMonth;
		this.expirationYear = expirationYear;
	}
	public Long getIdCard() {
		return idCard;
	}
	public void setIdCard(Long idCard) {
		this.idCard = idCard;
	}
	public Long getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}
	public Long getNumberCard() {
		return numberCard;
	}
	public void setNumberCard(Long numberCard) {
		this.numberCard = numberCard;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Integer getExpirationMonth() {
		return expirationMonth;
	}
	public void setExpirationMonth(Integer expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
	public Integer getExpirationYear() {
		return expirationYear;
	}
	public void setExpirationYear(Integer expirationYear) {
		this.expirationYear = expirationYear;
	}
	
	
}
