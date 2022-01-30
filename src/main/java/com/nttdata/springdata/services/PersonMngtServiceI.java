/**
 * 
 */
package com.nttdata.springdata.services;

import java.util.List;

import com.nttdata.springdata.entities.Persona;

/**
 * Interfaz que solo tiene los métodos necesarios que serán implementados por la clase
 * PersonMngtServiceImpl.
 * 
 * @author Daniel
 */
public interface PersonMngtServiceI {
	
	/**
	 * Método que devuelve una lista con todos los registros de la tabla persona.
	 * 
	 * @return Person
	 */
	public List<Persona> listPersona();
	/**
	 * Método para insertar un registro y que lleva un objeto de tipo persona como parámetro.
	 * 
	 * @param persona
	 */
	public void creaPersona(Persona persona);
	
	/**
	 * Busca un registro por su id, devileve un objeto del tipo Persona.
	 * 
	 * @param id
	 * @return Persona
	 */
	public Persona buscaPersonaPorId(int id);
	/**
	 * Método para actualizar un registro, su parámetro es un objeto del tipo Persona.
	 * 
	 * @param persona
	 */
	public void editaPersona(Persona persona);
	
	/**
	 * Método al que se le pasa un id y elimina su registro en la base de datos.
	 * 
	 * @param id
	 */
	public void eliminaPersona(int id);
		
	
}
