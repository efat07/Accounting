package com.customerService.payload;

public class BillResponse {

	private Long idOrder;
	private Long idProveedor;
	private String nombreProveedor;
	private Double price;

	public BillResponse(Long idOrder, Long idProveedor, String nombreProveedor, Double price) {
		super();
		this.idOrder = idOrder;
		this.idProveedor = idProveedor;
		this.nombreProveedor = nombreProveedor;
		this.price = price;
	}
	
	public Long getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}
	public Long getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
