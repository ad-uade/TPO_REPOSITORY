package com.group7.business;

import java.io.Serializable;
import java.util.Date;

public class CondicionVentaVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2130328448117916481L;
	private int nroCondicion;
	private Date fechaDesde;
	private Date fechaHasta;
	private float IVA;
	private FormaPagoVO formaPago;
	
	public CondicionVentaVO(){
		
	}

	public int getNroCondicion() {
		return nroCondicion;
	}

	public void setNroCondicion(int nroCondicion) {
		this.nroCondicion = nroCondicion;
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

	public float getIVA() {
		return IVA;
	}

	public void setIVA(float iVA) {
		IVA = iVA;
	}

	public FormaPagoVO getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPagoVO formaPago) {
		this.formaPago = formaPago;
	}
	
	
}
