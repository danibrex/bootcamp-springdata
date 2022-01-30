/**
 * 
 */
package com.nttdata.springdata.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.springdata.entities.Persona;
import com.nttdata.springdata.repository.PersonaRepositoryI;

/**
 * @author Daniel
 *
 */

//anotación de servicio
@Service
public class PersonMngtServiceImpl implements PersonMngtServiceI {
	
	/** Repositorio: personas */
	@Autowired
	private PersonaRepositoryI personaRepositoryI;
	
	@Override
	public List<Persona> listPersona() {			
		return personaRepositoryI.findAll();
	}

	@Override
	public void creaPersona(Persona persona) {
		personaRepositoryI.save(persona);		
	}

	@Override
	public Persona buscaPersonaPorId(int id) {
		// TODO Auto-generated method stub
		return personaRepositoryI.findById(id).orElse(new Persona());
	}
		
	@Override
	public void editaPersona(Persona persona) {
		personaRepositoryI.save(persona);	
	}

	@Override
	public void eliminaPersona(int id) {
		personaRepositoryI.deleteById(id);		
	}
	

}
