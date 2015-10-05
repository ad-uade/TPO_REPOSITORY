package com.group7.business;

import java.io.Serializable;

public class ItemRemitoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8596945072201535463L;
	private int nroRemito;
	private RodamientoVO rodamiento;
	private int cantidad;
	
	public ItemRemitoVO(){
		
	}

	public int getNroRemito() {
		return nroRemito;
	}

	public void setNroRemito(int nroRemito) {
		this.nroRemito = nroRemito;
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
