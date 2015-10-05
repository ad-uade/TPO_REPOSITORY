package com.group7.business;

import java.io.Serializable;

public class ItemCotizacionVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6836419191054134938L;
	private int nroCotizacion;
	private int cantidad;
	private String estado;
	private RodamientoVO rodamiento;
	private float precio;
	private ProveedorVO proveedor;
	
	public ItemCotizacionVO(){
		
	}

	public int getNroCotizacion() {
		return nroCotizacion;
	}

	public void setNroCotizacion(int nroCotizacion) {
		this.nroCotizacion = nroCotizacion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public RodamientoVO getRodamiento() {
		return rodamiento;
	}

	public void setRodamiento(RodamientoVO rodamiento) {
		this.rodamiento = rodamiento;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public ProveedorVO getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorVO proveedor) {
		this.proveedor = proveedor;
	}

}
