package com.group7.business;

import java.io.Serializable;

public class ItemsListaPreciosVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3001535047446773249L;
	private int nroLista;
	private RodamientoVO rodamiento;
	private float precioVenta;
	private float descuento;
	
	public ItemsListaPreciosVO(){
		
	}

	public int getNroLista() {
		return nroLista;
	}

	public void setNroLista(int nroLista) {
		this.nroLista = nroLista;
	}

	public RodamientoVO getRodamiento() {
		return rodamiento;
	}

	public void setRodamiento(RodamientoVO rodamiento) {
		this.rodamiento = rodamiento;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

}
