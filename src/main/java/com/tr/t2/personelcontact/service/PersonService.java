package com.tr.t2.personelcontact.service;

import java.util.List;

import com.tr.t2.personelcontact.model.Person;

public interface PersonService
{

	public void addPerson(Person person);

	public Person getPerson(String id);

	public List<Person> getAllPersons();

	public void updatePerson(Person person, String id);

	public void deletePerson(String id);

}
