package com.group7.business;

import java.io.Serializable;

public class ItemsComparativaPreciosVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7058061819384273303L;
	private int idComparativa;
	private RodamientoVO rodamiento;
	private float mejorPrecio;
	private int numListaPrecios; 
	private ProveedorVO proveedor;

	public ItemsComparativaPreciosVO(){
		
	}

	public int getIdComparativa() {
		return idComparativa;
	}

	public void setIdComparativa(int idComparativa) {
		this.idComparativa = idComparativa;
	}

	public RodamientoVO getRodamiento() {
		return rodamiento;
	}

	public void setRodamiento(RodamientoVO rodamiento) {
		this.rodamiento = rodamiento;
	}

	public float getMejorPrecio() {
		return mejorPrecio;
	}

	public void setMejorPrecio(float mejorPrecio) {
		this.mejorPrecio = mejorPrecio;
	}

	public int getNumListaPrecios() {
		return numListaPrecios;
	}

	public void setNumListaPrecios(int numListaPrecios) {
		this.numListaPrecios = numListaPrecios;
	}

	public ProveedorVO getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorVO proveedor) {
		this.proveedor = proveedor;
	}
	
}