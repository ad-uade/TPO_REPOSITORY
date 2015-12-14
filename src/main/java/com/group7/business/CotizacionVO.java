package com.group7.business;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CotizacionVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4378046180714010631L;
	private int nroCotizacion;
	private Date fecha;
	private int diasValidez;
	private ClienteVO cliente;
	private String nroSolicitudCotizacion;
	private List<ItemCotizacionVO> items;
	
	public CotizacionVO(){
		
	}

	public int getNroCotizacion() {
		return nroCotizacion;
	}

	public void setNroCotizacion(int nroCotizacion) {
		this.nroCotizacion = nroCotizacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getDiasValidez() {
		return diasValidez;
	}

	public void setDiasValidez(int diasValidez) {
		this.diasValidez = diasValidez;
	}

	public ClienteVO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}

	public List<ItemCotizacionVO> getItems() {
		return items;
	}

	public void setItems(List<ItemCotizacionVO> items) {
		this.items = items;
	}

	/**
	 * @return the nroSolicitudCotizacion
	 */
	public String getNroSolicitudCotizacion() {
		return nroSolicitudCotizacion;
	}

	/**
	 * @param nroSolicitudCotizacion the nroSolicitudCotizacion to set
	 */
	public void setNroSolicitudCotizacion(String nroSolicitudCotizacion) {
		this.nroSolicitudCotizacion = nroSolicitudCotizacion;
	}

}
