/**
 * 
 */
package com.nttdata.springdata.controllers;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.nttdata.springdata.entities.Persona;
import com.nttdata.springdata.services.PersonMngtServiceI;

/**
 * @author Daniel
 * 
 * Proyecto simple Spring Data que integra una base de datos MySq, y un par de vistas simples HTML que consumen
 * el servicio a modo de experimento. AbstracEntity y un repositorio compartido serán añadidos próximamente.
 * Este proyecto es cliente de Eureka aunque está deshabilitado en sus propiedades. También integra actuator.
 * 
 * A tener en cuenta que este proyecto está desarrollado como banco de pruebas, no cuenta con validaciones de ningún tipo ni seguridad. 
 * 
 * @version 0.1 SNAPSHOT 32/1/2022
 *
 */

@RestController("api")
@CrossOrigin(origins = {"*"})
public class PersonController {
	
	/** inyección*/
	@Autowired
	private PersonMngtServiceI personaService;
	
	/**
	 * Método que devuelve una lista con todas las personas de la base de datos
	 * el la URL http://localhost:8093/personas
	 * 
	 * @return List<Persona>
	 */
	@GetMapping(value="/personas")
	public List<Persona> getPersonas(){
		return personaService.listPersona();
		
	}
	
	/**
	 * Método que recibe por parámetros el nombre y los apellidos que llegan vía GET, instancia
	 * un objeto del tipo persona con esos datos y lo guarda en la base de datos.
	 * 
	 * @param fnombre
	 * @param fapellidos
	 * @throws IOException
	 */
	
	@GetMapping(value="/personas/crear{fnombre}{fapellidos}")
	public void crearPersona(@RequestParam String fnombre, @RequestParam String fapellidos) throws IOException {
		Persona persona = new Persona(0, fnombre, fapellidos);
		personaService.creaPersona(persona);
	}
	
	/**
	 * Método que recibe un id como parámetro y devuelve el registro hacia esa URL.
	 * Es utilizado en la vista editar.html y sirve para cargar el formulario con los valores obtenidos.
	 * 
	 * @param id
	 * @return Persona
	 * @throws IOException
	 */
	@GetMapping(value="/buscar{id}")
	public Persona buscaPersona(@RequestParam int id) throws IOException {
		return personaService.buscaPersonaPorId(id);
	}
	
	/**
	 * Método que recibe por parámetros vía GET todos los valores necesarios para instanciar un objeto del tipo persona,
	 * al insertar un mismo registro con el mismo id, hibernate ya sabe que lo que queremos es actualizar el registro
	 * y no crear uno nuevo. 
	 *	
	 * @param id
	 * @param fnombre
	 * @param fapellidos
	 * @throws IOException
	 */
	@GetMapping(value="/personas/editar{id}{fnombre}{fapellidos}")
	public void editarPersona(@RequestParam int id, @RequestParam String fnombre, @RequestParam String fapellidos) throws IOException {
		Persona persona = new Persona(id, fnombre, fapellidos);
		personaService.editaPersona(persona);
	}
	
	/**
	 * Método que recibe un id como parámetro y elimina ese registro de la base de datos.
	 * 
	 * @param id
	 * @throws IOException
	 */
	
	@GetMapping(value="/persona/eliminar{id}")
	public void eliminaPersona(@RequestParam int id) throws IOException {
		personaService.eliminaPersona(id);
	}	

	
	
}
