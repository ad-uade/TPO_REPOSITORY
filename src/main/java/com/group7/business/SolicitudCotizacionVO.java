package com.group7.business;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SolicitudCotizacionVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3574075703293324626L;
	private int nroSolicitudCotizacion;
	private Date fecha;
	private ClienteVO cliente;
	private List<ItemSolicitudCotizacionVO> items;
	private OficinaVentasVO oficinaVentasVO;
	
	public SolicitudCotizacionVO(){
		
	}

	public int getNroSolicitudCotizacion() {
		return nroSolicitudCotizacion;
	}

	public void setNroSolicitudCotizacion(int nroSolicitudCotizacion) {
		this.nroSolicitudCotizacion = nroSolicitudCotizacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public ClienteVO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}

	public List<ItemSolicitudCotizacionVO> getItems() {
		return items;
	}

	public void setItems(List<ItemSolicitudCotizacionVO> items) {
		this.items = items;
	}

	/**
	 * @return the oficinaVentasVO
	 */
	public OficinaVentasVO getOficinaVentasVO() {
		return oficinaVentasVO;
	}

	/**
	 * @param oficinaVentasVO the oficinaVentasVO to set
	 */
	public void setOficinaVentasVO(OficinaVentasVO oficinaVentasVO) {
		this.oficinaVentasVO = oficinaVentasVO;
	}
	
}
