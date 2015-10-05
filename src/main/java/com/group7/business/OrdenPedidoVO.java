package com.group7.business;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrdenPedidoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4154907584534127480L;
	private int nroOrdenPedido;
	private Date fecha;
	private ClienteVO cliente;
	private CotizacionVO cotizacion;
	private boolean estado;
	private List<ItemOrdenPedidoVO> items;
	
	public OrdenPedidoVO(){
		
	}

	public int getNroOrdenPedido() {
		return nroOrdenPedido;
	}

	public void setNroOrdenPedido(int nroOrdenPedido) {
		this.nroOrdenPedido = nroOrdenPedido;
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

	public CotizacionVO getCotizacion() {
		return cotizacion;
	}

	public void setCotizacion(CotizacionVO cotizacion) {
		this.cotizacion = cotizacion;
	}

	public List<ItemOrdenPedidoVO> getItems() {
		return items;
	}

	public void setItems(List<ItemOrdenPedidoVO> items) {
		this.items = items;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
