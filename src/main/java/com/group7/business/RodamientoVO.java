package com.group7.business;

import java.io.Serializable;

public class RodamientoVO implements Serializable{

	private static final long serialVersionUID = 3603125587820710013L;
	
	private String codigoSFK;
	private String codigoPieza;
	private String descripcion;
	private String marca;
	private String paisOrigen;
	private boolean estado;
	
	public RodamientoVO(){
		
	}

	public String getCodigoSFK() {
		return codigoSFK;
	}

	public void setCodigoSFK(String codigoSFK) {
		this.codigoSFK = codigoSFK;
	}

	public String getCodigoPieza() {
		return codigoPieza;
	}

	public void setCodigoPieza(String codigoPieza) {
		this.codigoPieza = codigoPieza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public boolean equals(RodamientoVO obj) {
		return this.getCodigoPieza().equals(obj.getCodigoPieza()) && this.getCodigoSFK().equals(obj.getCodigoSFK());
	}
	
}