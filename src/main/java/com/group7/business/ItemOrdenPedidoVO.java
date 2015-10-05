package com.group7.business;

import java.io.Serializable;

public class ItemOrdenPedidoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4495636113386478547L;
	private int nroOrdenPedido;
	private RodamientoVO rodamiento;
	private ProveedorVO proveedor;
	private boolean estado;
	private int cantidad;
	
	public ItemOrdenPedidoVO(){
		
	}

	public int getNroOrdenPedido() {
		return nroOrdenPedido;
	}

	public void setNroOrdenPedido(int nroOrdenPedido) {
		this.nroOrdenPedido = nroOrdenPedido;
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

	public ProveedorVO getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorVO proveedor) {
		this.proveedor = proveedor;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
