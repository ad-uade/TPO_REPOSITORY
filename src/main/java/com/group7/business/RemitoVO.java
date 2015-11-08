package com.group7.business;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class RemitoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4349285614233134860L;
	private int nroRemito;
	private Date fecha;
	private List<ItemRemitoVO> items;
	private ClienteVO cliente;
	private OrdenPedidoVO ordenPedido;
	private boolean conformeCliente;
	
	public RemitoVO(){
		
	}

	public int getNroRemito() {
		return nroRemito;
	}

	public void setNroRemito(int nroRemito) {
		this.nroRemito = nroRemito;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<ItemRemitoVO> getItems() {
		return items;
	}

	public void setItems(List<ItemRemitoVO> items) {
		this.items = items;
	}

	public ClienteVO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}

	public OrdenPedidoVO getOrdenPedido() {
		return ordenPedido;
	}

	public void setOrdenPedido(OrdenPedidoVO ordenPedido) {
		this.ordenPedido = ordenPedido;
	}

	public boolean isConformeCliente() {
		return conformeCliente;
	}

	public void setConformeCliente(boolean conformeCliente) {
		this.conformeCliente = conformeCliente;
	}

}
