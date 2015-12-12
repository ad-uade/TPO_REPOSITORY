package com.group7.business;

import java.io.Serializable;

public class ItemSolicitudCotizacionVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5277380593552858951L;
	private SolicitudCotizacionVO nroSolicitudCotizacion;
	private RodamientoVO rodamiento;
	private int cantidad;
	
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

	public SolicitudCotizacionVO getSolicitudCotizacion() {
		return nroSolicitudCotizacion;
	}

	public void setSolicitudCotizacion(SolicitudCotizacionVO nroSolicitudCotizacion) {
		this.nroSolicitudCotizacion = nroSolicitudCotizacion;
	}

}
