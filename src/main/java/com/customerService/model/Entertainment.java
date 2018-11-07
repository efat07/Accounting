package com.customerService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ENTERTAINMENT")
public class Entertainment {

	@Id
	@Column(name = "IDENTERTAINMENT")
	private Long idEntertainment;
	
	@Column(name = "PRICE")
	private Double price;
	
	@Column(name = "NAME")
	private String name;
	
	public Long getIdEntertainment() {
		return idEntertainment;
	}
	public void setIdEntertainment(Long idEntertainment) {
		this.idEntertainment = idEntertainment;
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
