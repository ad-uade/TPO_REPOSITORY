package com.group7.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.group7.business.ClienteVO;
import com.group7.business.CondicionVentaVO;
import com.group7.business.CotizacionVO;
import com.group7.business.OficinaVentasVO;
import com.group7.business.RemitoExteriorVO;
import com.group7.business.RodamientoVO;
import com.group7.business.SolicitudCotizacionVO;

public interface InterfazRemotaODV extends Remote{

	public List<CotizacionVO> dameCotizaciones()throws RemoteException;
	
	public RemitoExteriorVO dameRemito(int nroRemito) throws RemoteException;
	
	public void generarFactura(RemitoExteriorVO remito) throws RemoteException;
	
	public List<RemitoExteriorVO> traerRemitos() throws RemoteException;
	
	public List<OficinaVentasVO> obtenerOficinas() throws RemoteException;
	
	public OficinaVentasVO dameOficina(int idOficina) throws RemoteException;
	
	public List<RemitoExteriorVO> traerRemitosNoConformados() throws RemoteException;
	
	public List<CondicionVentaVO> condiciones() throws RemoteException;
	
	public CondicionVentaVO dameCondicion(int nroCondicion) throws RemoteException;
	
	public boolean altaCliente(String razonSocial, int CUIL, String direccion, String telefono, OficinaVentasVO of) throws RemoteException;
	
	public boolean modificarCliente(ClienteVO cliente) throws RemoteException;

	public ClienteVO traerCliente(int CUIL) throws RemoteException; 
	
	public boolean generarCotizacion(SolicitudCotizacionVO SC, int diasValidez) throws RemoteException;
	
	public boolean bajaCliente(int CUIL) throws RemoteException;
	
	public List<ClienteVO> listarClientes() throws RemoteException;
	
	public SolicitudCotizacionVO dameSolicitud (int nroSolicitud) throws RemoteException;
	
	public RodamientoVO obtenerRodamiento (String SFK, String codigo) throws RemoteException;
	
	public List<RodamientoVO> traerRodamientos () throws RemoteException;
	
	public CotizacionVO dameCotizacion(int nroCotizacion) throws RemoteException;
	
	public List<SolicitudCotizacionVO> listarSolicitudesCotizacion() throws RemoteException;
	
	public void guardarSolicitudCotizacion(ClienteVO cliente, List<RodamientoVO> rodamientos, List<Integer> cantidades, List<CondicionVentaVO> condiciones) throws RemoteException;
	
	public void aprobarCotizacion(CotizacionVO cotizacion) throws RemoteException;
	
	public void generarOrdenPedido(CotizacionVO cotizacion) throws RemoteException;
	
	public void registrarConformidadCliente(int nroRemito) throws RemoteException;
	
}

