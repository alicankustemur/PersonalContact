package com.tr.t2.personalcontact;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.tr.t2.personalcontact.model.Person;
import com.tr.t2.personalcontact.service.PersonService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath:test-service-config.xml"})
public class PersonServiceTest
{
	@Autowired
	private PersonService service;

	@Test
	public void testGetPerson()
	{
		Person person = getSimplePerson();
		Person dbPerson = service.addPerson(person);
		assertEquals(person.getId(), service.getPerson(person.getId()).getId());
		assertEquals(person.getName(), service.getPerson(person.getId()).getName());
		assertEquals(person.getSurname(), service.getPerson(person.getId()).getSurname());
	}

	@Test
	public void testAddPerson()
	{
		Person person = getSimplePerson();
		Person result = service.addPerson(person);
		assertThat(service.getPerson(person.getId()), is(notNullValue()));
	}

	@Test
	public void testDeletePerson() throws Exception
	{
		Person person = getSimplePerson();
		service.addPerson(person);
		service.deletePerson(person.getId());
		assertThat(service.getPerson(person.getId()), is(nullValue()));
	}

	@Test
	public void testGetAllPersonsForThreeUser() throws Exception
	{
		Person person = getSimplePerson();
		Person person2 = new Person("2", "Özcan", "Kuştemur");
		Person person3 = new Person("3", "Ela", "Kuştemur");
		service.addPerson(person);
		service.addPerson(person2);
		service.addPerson(person3);
		List<Person> persons = service.getAllPersons();
		assertThat(persons.size(), is(equalTo(3)));
	}

	private Person getSimplePerson()
	{
		Person person = new Person();
		person.setId("1");
		person.setName("Ali Can");
		person.setSurname("Kuştemur");
		return person;
	}

}
