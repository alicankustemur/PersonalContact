package com.tr.t2.personelcontact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tr.t2.personelcontact.model.Person;
import com.tr.t2.personelcontact.service.PersonService;

@Controller
public class PersonController
{

	@Autowired
	private PersonService service;

	@RequestMapping("/")
	public String personList(ModelMap model)
	{
		List<Person> persons = service.getAllPersons();

		model.addAttribute("persons", persons);
		model.addAttribute("person", new Person());
		return "index";
	}

	@RequestMapping(value = "/addPerson", method = RequestMethod.POST)
	public String addUser(@ModelAttribute Person person)
	{
		service.addPerson(person);
		return "redirect:/";
	}

	@RequestMapping("/deletePerson")
	public String deleteUser(@RequestParam String id)

	{
		service.deletePerson(id);
		return "redirect:/";
	}

	@RequestMapping("/updatePerson")
	public String updatePerson(ModelMap model, @RequestParam String id)
	{
		List persons = service.getAllPersons();
		model.addAttribute("persons", persons);
		model.addAttribute("person", service.getPerson(id));
		return "index";
	}

}
