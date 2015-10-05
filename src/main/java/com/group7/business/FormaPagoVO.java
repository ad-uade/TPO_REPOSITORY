package com.group7.business;

import java.io.Serializable;

public class FormaPagoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9220416292831057179L;
	private int idFormaPago;
	private String descripcion;
	
	public FormaPagoVO(){
		
	}

	public int getIdFormaPago() {
		return idFormaPago;
	}

	public void setIdFormaPago(int idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
