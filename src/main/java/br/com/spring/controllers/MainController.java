package br.com.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.spring.entities.Person;
import br.com.spring.logic.Logic;

@Controller
public class MainController {
	
	@Autowired
	Logic service;
	
	@RequestMapping(value="/")
	public ModelAndView inicializa(){
		ModelAndView model = new ModelAndView("/names");
		return model;
	}
	
	@RequestMapping(value="/getPersons", method =RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Person>getPersons(){
		return service.getListPersons();
	}

}
