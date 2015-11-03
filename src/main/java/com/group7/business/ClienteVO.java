package com.group7.business;

import java.io.Serializable;
 
public class ClienteVO implements Serializable{
	
	private static final long serialVersionUID = -2857643638341621653L;
	
	private Integer CUILCliente;
	private String razonSocial;
	private String direccion;
	private String telefono;
	private OficinaVentasVO ODV;
	private boolean estado;
	
	public ClienteVO(){
		
	}
	
	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public int getCUILCliente() {
		return CUILCliente;
	}

	public void setCUILCliente(int cUILCliente) {
		CUILCliente = cUILCliente;
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

	public void setODV(OficinaVentasVO oDV) {
		ODV = oDV;
	}

	public OficinaVentasVO getODV() {
		return ODV;
	}
	
}
