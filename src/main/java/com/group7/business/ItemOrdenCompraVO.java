package com.group7.business;

import java.io.Serializable;

public class ItemOrdenCompraVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8967833939410944407L;
	private int nroOrdenCompra;
	private RodamientoVO rodamiento;
	private int cantidad;
	
	public ItemOrdenCompraVO(){
		
	}

	public int getNroOrdenCompra() {
		return nroOrdenCompra;
	}

	public void setNroOrdenCompra(int nroOrdenCompra) {
		this.nroOrdenCompra = nroOrdenCompra;
	}

	public RodamientoVO getRodamiento() {
		return rodamiento;
	}

	public void setRodamiento(RodamientoVO rodamiento) {
		this.rodamiento = rodamiento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
