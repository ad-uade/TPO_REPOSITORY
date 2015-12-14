package com.group7.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.group7.business.ProveedorVO;

public interface InterfazRemotaCPR extends Remote{

	public void bajaProveedor(Long CUIL) throws RemoteException;
	
	public List<ProveedorVO> listarProveedores()throws RemoteException;
	
	public ProveedorVO traerProveedor(Long cuil)throws RemoteException;
	
	public void  modificarProveedor(ProveedorVO p)throws RemoteException;
	
	public void altaProveedor(String razonSocial, Long CUIL, String direccion, String telefono) throws RemoteException;
	
	public void altaRodamiento(String codigoSFK, String codigoPieza, String descripcion, String paisOrigen, String marca, boolean estado) throws RemoteException;
	
}
