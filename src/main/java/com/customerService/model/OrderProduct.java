package com.customerService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ORDERPRODUCT")
public class OrderProduct {

	@Id
	@Column(name = "IDORDERPRODUCT")
	private Long idOrderProduct;
	
	@Column(name = "IDPRODUCT")
	private Long idProduct;
	
	@Column(name = "IDORDER")
	private Long idOrder;
	
	public Long getIdOrderProduct() {
		return idOrderProduct;
	}
	public void setIdOrderProduct(Long idOrderProduct) {
		this.idOrderProduct = idOrderProduct;
	}
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public Long getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}
	
	
	
}
