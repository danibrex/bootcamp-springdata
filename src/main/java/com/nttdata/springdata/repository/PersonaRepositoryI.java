/**
 * 
 */
package com.nttdata.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.springdata.entities.Persona;

/**
 * Interfaz que extiende de la clase JpaRepository que contiene todo lo necesario
 * para realizar las tareas más comunes contra la BD.
 * 
 * @author Daniel
 *
 */

//Anotación de respositorio
@Repository
public interface PersonaRepositoryI extends JpaRepository<Persona, Integer> {

}
