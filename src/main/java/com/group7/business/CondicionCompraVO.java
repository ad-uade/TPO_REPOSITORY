package com.group7.business;

import java.io.Serializable;
import java.util.Date;

public class CondicionCompraVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8392880337531233745L;
	private int nroCondicionCompra;
	private Date fechaDesde;
	private Date fechaHasta;
	private FormaPagoVO formaPago;
	
	public CondicionCompraVO(){
		
	}

	public int getNroCondicionCompra() {
		return nroCondicionCompra;
	}

	public void setNroCondicionCompra(int nroCondicionCompra) {
		this.nroCondicionCompra = nroCondicionCompra;
	}

	public Date getFechaDesde() {
		return fechaDesde;
	}

	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public Date getFechaHasta() {
		return fechaHasta;
	}

	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}

	public FormaPagoVO getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPagoVO formaPago) {
		this.formaPago = formaPago;
	}
	
	
}
