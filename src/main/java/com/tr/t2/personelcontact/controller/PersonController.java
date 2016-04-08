package com.tr.t2.personelcontact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tr.t2.personelcontact.model.Person;
import com.tr.t2.personelcontact.service.PersonService;

@Controller
@RequestMapping("/")
public class PersonController
{

	@Autowired
	private PersonService service;

	@RequestMapping
	public ModelAndView helloWorld(ModelMap model)
	{
		List persons = service.getAllPersons();
		ModelAndView modelAndView = new ModelAndView("index", "person", new Person());
		modelAndView.addObject("persons", persons);
		return modelAndView;
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute Person person)
	{
		service.addPerson(person);
		return "redirect:/";
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
	public String deleteUser(@ModelAttribute Person person)
	{

		return "redirect:/";
	}

}
