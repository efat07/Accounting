package com.customerService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "TRANSPORT")
public class Transport {

	@Id
	@Column(name = "IDTRANSPORT")
	private Long idTransport;
	
	@Column(name = "PRICE")
	private Double price;
	
	@Column(name = "NAME")
	private String name;
	
	public Long getIdTransport() {
		return idTransport;
	}
	public void setIdTransport(Long idTransport) {
		this.idTransport = idTransport;
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
