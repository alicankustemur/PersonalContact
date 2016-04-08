package com.tr.t2.personelcontact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tr.t2.personelcontact.service.PersonService;

@Controller
public class PersonController
{

	@Autowired
	private PersonService service;

	@RequestMapping("/")
	public ModelAndView helloWorld(ModelMap model)
	{
		List persons = service.getAllPersons();

		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("persons", persons);
		return modelAndView;
	}

}
