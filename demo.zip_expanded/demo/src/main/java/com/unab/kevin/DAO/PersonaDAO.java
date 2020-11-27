package com.unab.kevin.DAO;

import org.springframework.data.repository.CrudRepository;

import com.unab.kevin.entidad.Persona;


public interface PersonaDAO extends CrudRepository<Persona, Long> {
	
	

}
