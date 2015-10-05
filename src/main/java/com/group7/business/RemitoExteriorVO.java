package com.group7.business;

public class RemitoExteriorVO extends RemitoVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1317170435725608969L;
	private ClienteVO cliente;
	private OrdenPedidoVO ordenPedido;
	private boolean conformeCliente;
	
	public RemitoExteriorVO(){
		
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
