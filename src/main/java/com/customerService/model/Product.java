package com.customerService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "PRODUCT")
public class Product {

	@Id
	@Column(name = "IDPRODUCT")
	private Long idProduct; 
	
	@Column(name = "IDTRANSPORT")
	private Long idTransport; 
	
	@Column(name = "IDENTERTAINMENT")
	private Long idEntertainment; 
	
	@Column(name = "IDHOTEL")
	private Long idHotel;
	
	
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public Long getIdTransport() {
		return idTransport;
	}
	public void setIdTransport(Long idTransport) {
		this.idTransport = idTransport;
	}
	public Long getIdEntertainment() {
		return idEntertainment;
	}
	public void setIdEntertainment(Long idEntertainment) {
		this.idEntertainment = idEntertainment;
	}
	public Long getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}
}
