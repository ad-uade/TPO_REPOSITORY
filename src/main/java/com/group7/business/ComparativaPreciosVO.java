package com.group7.business;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ComparativaPreciosVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2448806767959414578L;
	private int idComparativa;
	private Date fechaActualizacion;
	private List<ItemsComparativaPreciosVO> items;
	
	public ComparativaPreciosVO(){
		
	}

	public int getIdComparativa() {
		return idComparativa;
	}

	public void setIdComparativa(int idComparativa) {
		this.idComparativa = idComparativa;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public List<ItemsComparativaPreciosVO> getItems() {
		return items;
	}

	public void setItems(List<ItemsComparativaPreciosVO> items) {
		this.items = items;
	}

}
