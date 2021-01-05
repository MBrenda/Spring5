/**
 * 
 */
package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author bmartinez
 *
 */
@Controller
public class InedxController {
	
	@Value("${application.controller.titulo}")
	private String titulo;
	
	//el objeto model permite pasar atributos a la vista
	//peticion GET
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("titulo", this.titulo);
		
		return "index";
	}

}
