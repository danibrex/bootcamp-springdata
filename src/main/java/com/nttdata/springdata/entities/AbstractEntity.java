package com.nttdata.springdata.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

	/** SERIAL VERSION  */
	private static final long serialVersionUID = 1L;
	
	/** Auditoría | Usuario que actualiza */
	private String actualizacionUsuario;
	
	/** Auditoría | Día actualizado*/
	private Date fechaActualizacion;

	/**
	 * @return the fechaActualizacionUsuario
	 */
	@Column(name = "AUDIT_UPDATED_USER", nullable = false)
	public String getActualizacionUsuario() {
		return actualizacionUsuario;
	}

	/**
	 * @param fechaActualizacionUsuario the fechaActualizacionUsuario to set
	 */
	public void setActualizacionUsuario(String actualizacionUsuario) {
		this.actualizacionUsuario = actualizacionUsuario;
	}

	/**
	 * @return the fechaActualizacion
	 */
	@Column(name = "AUDIT_UPDATED_DATE", nullable = false)
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	/**
	 * @param fechaActualizacion the fechaActualizacion to set
	 */
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	
	
	
}
