package com.group7.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.group7.business.ListaPreciosVO;
import com.group7.business.OrdenCompraVO;
import com.group7.business.OrdenPedidoVO;
import com.group7.business.ProveedorVO;
import com.group7.business.RodamientoVO;

public interface InterfazRemotaCPR extends Remote{

	public boolean bajaProveedor(int CUIL) throws RemoteException;
	public List<ProveedorVO> listarProveedores()throws RemoteException;
	public ProveedorVO traerProveedor(Integer cuil)throws RemoteException;
	public boolean  modificarProveedor(ProveedorVO p)throws RemoteException;
	public boolean altaProveedor(String razonSocial, int CUIL, String direccion, String telefono) throws RemoteException;
	public ListaPreciosVO armarListaDePrecios(ProveedorVO proveedor, List<RodamientoVO> rodamientos, List<Float> precios, String tipo, String vigencia, float descuento) throws RemoteException;
	public void actualizarComparativaPrecios(ListaPreciosVO listaVO) throws RemoteException;
	public ListaPreciosVO obtenerLista (Integer nro) throws RemoteException;
	public List<ListaPreciosVO> traerListas () throws RemoteException;
	public boolean generarOrdenDeCompra(OrdenPedidoVO ordenDePedido) throws RemoteException;
	public void generarOrdenDeCompraManual(List<RodamientoVO> rodamientos, List<Integer> cantidades) throws RemoteException;
	public OrdenPedidoVO dameOrdenVO(int nroOrdenPedido) throws RemoteException;
	public List<OrdenPedidoVO> listarOrdenesPedido()throws RemoteException;
	public OrdenCompraVO dameOrdenCompraVO(int nroOrdenCompra) throws RemoteException;
	public boolean revisarOrdenDePedido(OrdenPedidoVO ordenPedido) throws RemoteException;
	public void recepcionDeMercaderia(OrdenCompraVO ordenVO) throws RemoteException;
	public List<OrdenPedidoVO> listarOrdenesPedidoARemitir() throws RemoteException;
	public List<OrdenCompraVO> dameOrdenesComprasVO()throws RemoteException;
	public void altaRodamiento(String codigoSFK, String codigoPieza, String descripcion, String paisOrigen, String marca, boolean estado) throws RemoteException;
	
}