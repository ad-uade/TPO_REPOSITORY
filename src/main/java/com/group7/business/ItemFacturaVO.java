package com.group7.business;

import java.io.Serializable;

public class ItemFacturaVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5045886688567559846L;
	private FacturaVO nroFactura;
	private RodamientoVO rodamiento;
	private float precioUnitario;
	private Integer cantidad;
	private Float subtotal;
	private CondicionVentaVO condicion;
	
	public ItemFacturaVO(){
		
	}

	public FacturaVO getNroFactura() {
		return nroFactura;
	}

	public void setNroFactura(FacturaVO nroFactura) {
		this.nroFactura = nroFactura;
	}

	public RodamientoVO getRodamiento() {
		return rodamiento;
	}

	public void setRodamiento(RodamientoVO rodamiento) {
		this.rodamiento = rodamiento;
	}

	public float getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public CondicionVentaVO getCondicion() {
		return condicion;
	}

	public void setCondicion(CondicionVentaVO condicion) {
		this.condicion = condicion;
	}

	/**
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the subtotal
	 */
	public Float getSubtotal() {
		return subtotal;
	}

	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}
	
}
