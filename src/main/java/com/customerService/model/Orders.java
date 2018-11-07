package com.customerService.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ORDERS")
public class Orders {

	@Id
	@Column(name = "IDORDER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrder;
	
	@Column(name = "IDSTATEORDER")
	private Long idStateOrder;
	
	@Column(name = "IDCUSTOMER")
	private Long idCustomer;

	@Column(name = "NUMBERCARD")
	private Long numberCard;
	
	@Column(name = "AMOUNT")
	private Double amount;
	
	@Column(name = "CREATIONDATE")
	private Date creationDate;
	
	@Column(name = "MODIFICATIONDATE")
	private Date modificationDate;
	
	@Column(name = "IDACCOUNTING")
	private Long idAccounting;
	
	@Column(name = "ACCOUNTINGPROCESS")
	private String accountingProcess;
	
	public Orders() {

	}

	
	public Orders(Long idOrder, Long idState, Long idCustomer, Long numberCard, Double amount, Date creationDate,
			Date modificationDate) {
		this.idOrder = idOrder;
		this.idStateOrder = idState;
		this.idCustomer = idCustomer;
		this.numberCard = numberCard;
		this.amount = amount;
		this.creationDate = creationDate;
		this.modificationDate = modificationDate;
	}
	
	public Long getidOrder() {
		return idOrder;
	}

	public void setidOrder(Long idOrder) {
		this.idOrder = idOrder;
	}

	public Long getIdStateOrder() {
		return idStateOrder;
	}

	public void setIdStateOrder(Long idState) {
		this.idStateOrder = idState;
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

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}


	public Long getIdAccounting() {
		return idAccounting;
	}


	public void setIdAccounting(Long idAccounting) {
		this.idAccounting = idAccounting;
	}


	public String getAccountingProcess() {
		return accountingProcess;
	}


	public void setAccountingProcess(String accountingProcess) {
		this.accountingProcess = accountingProcess;
	}

	
}
