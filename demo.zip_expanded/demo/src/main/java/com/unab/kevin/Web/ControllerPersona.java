package com.unab.kevin.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.unab.kevin.DAO.PersonaDAO;

@Controller

public class ControllerPersona {
	
	@Autowired
	private PersonaDAO personadao;

	
	@GetMapping("/")
	public String inicio() {
		
		var personas = personadao.findAll();
		
		for (var consulta : personas) {
			System.out.println(consulta.getNombre());
		}
		return "index";
	}

}
