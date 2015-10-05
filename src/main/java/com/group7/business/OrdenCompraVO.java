package com.group7.business;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrdenCompraVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3534691798193988152L;
	private int nroOrdenCompra;
	private Date fecha;
	private ProveedorVO proveedor;
	private List<ItemOrdenCompraVO> items;
	
	public OrdenCompraVO(){
		
	}

	public int getNroOrdenCompra() {
		return nroOrdenCompra;
	}

	public void setNroOrdenCompra(int nroOrdenCompra) {
		this.nroOrdenCompra = nroOrdenCompra;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public ProveedorVO getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorVO proveedor) {
		this.proveedor = proveedor;
	}

	public List<ItemOrdenCompraVO> getItems() {
		return items;
	}

	public void setItems(List<ItemOrdenCompraVO> items) {
		this.items = items;
	}

}
