package com.group7.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.group7.business.ClienteVO;
import com.group7.business.CotizacionVO;
import com.group7.business.OficinaVentasVO;
import com.group7.business.RodamientoVO;
import com.group7.business.SolicitudCotizacionVO;

public interface InterfazRemotaODV extends Remote{

	public List<CotizacionVO> dameCotizaciones()throws RemoteException;
	
	public void generarFactura(CotizacionVO cotizacionVO) throws RemoteException;
	
	public List<OficinaVentasVO> obtenerOficinas() throws RemoteException;
	
	public OficinaVentasVO dameOficina(int idOficina) throws RemoteException;
	
	// Cliente
	
	public void altaCliente(ClienteVO clientevo) throws RemoteException;
	
	public void modificarCliente(ClienteVO cliente) throws RemoteException;

	public ClienteVO buscarCliente(Long CUIL) throws RemoteException; 
	
	public void bajaCliente(Long CUIL) throws RemoteException;
	
	public List<ClienteVO> listarClientes() throws RemoteException;
	
	// -----

	public SolicitudCotizacionVO dameSolicitud (int nroSolicitud) throws RemoteException;
	
	public List<RodamientoVO> traerRodamientos () throws RemoteException;
	
	public CotizacionVO dameCotizacion(int nroCotizacion) throws RemoteException;
	
	public List<SolicitudCotizacionVO> listarSolicitudesCotizacion() throws RemoteException;
	
	public void guardarSolicitudCotizacion(SolicitudCotizacionVO solicitudCotizacionVO) throws RemoteException;
	
	public void aprobarCotizacion(CotizacionVO cotizacion) throws RemoteException;

	RodamientoVO obtenerRodamiento(String SFK, String codigo) throws RemoteException;
	
}