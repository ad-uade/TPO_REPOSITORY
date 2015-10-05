package com.group7.business;

import java.io.Serializable;

public class ItemSolicitudCotizacionVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5277380593552858951L;
	private int nroSolicitudCotizacion;
	private RodamientoVO rodamiento;
	private int cantidad;
	private CondicionVentaVO condicion;
	
	public ItemSolicitudCotizacionVO(){
		
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

	public int getNroSolicitudCotizacion() {
		return nroSolicitudCotizacion;
	}

	public void setNroSolicitudCotizacion(int nroSolicitudCotizacion) {
		this.nroSolicitudCotizacion = nroSolicitudCotizacion;
	}

	public void setCondicion(CondicionVentaVO condicion) {
		this.condicion = condicion;
	}

	public CondicionVentaVO getCondicion() {
		return condicion;
	}
	
}
