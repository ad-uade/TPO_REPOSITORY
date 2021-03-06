package com.group7.business;

import java.io.Serializable;

public class ProveedorVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9111991128782143313L;
	private Long cuilProveedor;
	private String razonSocial;
	private String direccion;
	private String telefono;
	private boolean estado;
	
	public ProveedorVO(){
		
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	/**
	 * @return the cuilProveedor
	 */
	public Long getCuilProveedor() {
		return cuilProveedor;
	}

	/**
	 * @param cuilProveedor the cuilProveedor to set
	 */
	public void setCuilProveedor(Long cuilProveedor) {
		this.cuilProveedor = cuilProveedor;
	}
	
}
