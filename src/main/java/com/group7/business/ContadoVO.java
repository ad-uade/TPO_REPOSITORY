package com.group7.business;

public class ContadoVO extends FormaPagoVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5986146559703232295L;
	private float descuento;
	
	public ContadoVO(){
		
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
}
