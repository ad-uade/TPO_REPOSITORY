package com.group7.business;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ListaPreciosVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3811119019300931872L;
	private int nroLista;
	private String tipo;
	private Date fechaPublicacion;
	private String vigencia;
	private boolean estado;
	private ProveedorVO proveedor;
	private List<ItemsListaPreciosVO> items;
	
	public ListaPreciosVO(){
		
	}

	public int getNroLista() {
		return nroLista;
	}

	public void setNroLista(int nroLista) {
		this.nroLista = nroLista;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getVigencia() {
		return vigencia;
	}

	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public ProveedorVO getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorVO proveedor) {
		this.proveedor = proveedor;
	}

	public List<ItemsListaPreciosVO> getItems() {
		return items;
	}

	public void setItems(List<ItemsListaPreciosVO> items) {
		this.items = items;
	}

}
