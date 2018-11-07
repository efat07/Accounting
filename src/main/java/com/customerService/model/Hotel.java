package com.customerService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "HOTEL")
public class Hotel {

	@Id
	@Column(name = "IDHOTEL")
	private Long idHotel;
	
	@Column(name = "PRICE")
	private Double price;
	
	@Column(name = "NAME")
	private String name;
	
	public Long getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
