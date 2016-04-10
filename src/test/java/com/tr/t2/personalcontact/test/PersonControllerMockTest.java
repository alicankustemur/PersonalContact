package com.tr.t2.personalcontact.test;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.tr.t2.personalcontact.controller.PersonController;
import com.tr.t2.personalcontact.model.Person;
import com.tr.t2.personalcontact.service.PersonService;

public class PersonControllerMockTest
{

	@Mock
	private PersonService		service;

	@InjectMocks
	private PersonController	controller;

	private MockMvc				mockMvc;

	@Before
	public void setup()
	{
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}

	@Test
	public void TestGetAllPersonsWhenPageLoad() throws Exception
	{
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person());
		persons.add(new Person());

		Mockito.when(service.getAllPersons()).thenReturn(persons);

		mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("index"))
				.andExpect(model().attribute("persons", hasSize(2)));
	}

}
