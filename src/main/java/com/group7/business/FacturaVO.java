package com.group7.business;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class FacturaVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7809580096548274803L;
	private int nroFactura;
	private Date fecha;
	private ClienteVO cliente;
	private float precio;
	private RemitoExteriorVO remito;
	private List<ItemFacturaVO> items;
	
	public FacturaVO(){
		
	}

	public int getNroFactura() {
		return nroFactura;
	}

	public void setNroFactura(int nroFactura) {
		this.nroFactura = nroFactura;
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

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public RemitoExteriorVO getRemito() {
		return remito;
	}

	public void setRemito(RemitoExteriorVO remito) {
		this.remito = remito;
	}

	public List<ItemFacturaVO> getItems() {
		return items;
	}

	public void setItems(List<ItemFacturaVO> items) {
		this.items = items;
	}

}
