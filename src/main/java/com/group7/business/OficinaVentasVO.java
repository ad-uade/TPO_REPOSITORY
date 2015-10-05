package com.group7.business;

import java.io.Serializable;
import java.util.List;

public class OficinaVentasVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2134799133113358181L;
	private int idOficina;
	private String sucursal;
	private List<ClienteVO> clientes;
	private List<CotizacionVO> cotizaciones;
	private List<SolicitudCotizacionVO> solicitudes;
	private List<FacturaVO> facturas;
	private List<RemitoExteriorVO> remitos;
	
	public OficinaVentasVO(){
		
	}

	public int getIdOficina() {
		return idOficina;
	}

	public void setIdOficina(int idOficina) {
		this.idOficina = idOficina;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public List<ClienteVO> getClientes() {
		return clientes;
	}

	public void setClientes(List<ClienteVO> clientes) {
		this.clientes = clientes;
	}

	public List<CotizacionVO> getCotizaciones() {
		return cotizaciones;
	}

	public void setCotizaciones(List<CotizacionVO> cotizaciones) {
		this.cotizaciones = cotizaciones;
	}

	public List<SolicitudCotizacionVO> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(List<SolicitudCotizacionVO> solicitudes) {
		this.solicitudes = solicitudes;
	}

	public List<FacturaVO> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<FacturaVO> facturas) {
		this.facturas = facturas;
	}

	public List<RemitoExteriorVO> getRemitos() {
		return remitos;
	}

	public void setRemitos(List<RemitoExteriorVO> remitos) {
		this.remitos = remitos;
	}
	
}
