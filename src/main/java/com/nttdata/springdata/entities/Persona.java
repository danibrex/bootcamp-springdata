/**
 * 
 */
package com.nttdata.springdata.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad sin relaciones de lo más simple
 * 
 * @author Daniel
 *
 */
//anotaciones de entidad y tabla
@Entity
@Table(name="persona")
public class Persona extends AbstractEntity implements Serializable {
	
	/** SERIALIZABLE*/
	private static final long serialVersionUID = 1L;
	
    /** 
     * Anotaciones del campo id, la estrategia AUTO crea una tabla automáticamente en la base de datos	
     * llamada hibernate-secuence. Este campo id es clave primaria y es auto incremental en la BD.
     */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	/** Id persona (PK) */
	private int id;
	
	/** NOMBRE PERSONA | pruebo a deshabilitar las anotación de columna */
	//@Column(name = "persona" , unique = true, nullable = false)
	private String nombre;
	
	/** APELLIDOS PERSONA | pruebo a deshabilitar anotación de columna */
	//@Column(name = "apellidos" , unique = true, nullable = false)	
	private String apellidos;
	
	
	/**
	 *Constructor vacío 
	 */
	public Persona() {
		super();
	}


	/** Constructor */
	public Persona(int id, String nombre, String apellidos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	

}
