package com.group7.business;

import java.io.Serializable;

public class ItemFacturaVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5045886688567559846L;
	private int nroFactura;
	private RodamientoVO rodamiento;
	private float precioUnitario;
	private CondicionVentaVO condicion;
	
	public ItemFacturaVO(){
		
	}

	public int getNroFactura() {
		return nroFactura;
	}

	public void setNroFactura(int nroFactura) {
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
	
}
