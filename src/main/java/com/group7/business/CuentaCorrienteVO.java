package com.group7.business;

public class CuentaCorrienteVO extends FormaPagoVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3007807408498751241L;
	private float recargo;
	private int dias;
	
	public CuentaCorrienteVO(){
		
	}

	public float getRecargo() {
		return recargo;
	}

	public void setRecargo(float recargo) {
		this.recargo = recargo;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

}
