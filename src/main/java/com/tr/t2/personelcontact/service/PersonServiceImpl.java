package com.tr.t2.personelcontact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tr.t2.personelcontact.dao.PersonRepository;
import com.tr.t2.personelcontact.model.Person;

@Service
public class PersonServiceImpl implements PersonService
{

	@Autowired
	private PersonRepository repository;

	public PersonRepository getRepository()
	{
		return repository;
	}

	public void setRepository(PersonRepository repository)
	{
		this.repository = repository;
	}

	@Override
	public void addPerson(Person person)
	{
		repository.save(person);
	}

	@Override
	public Person getPerson(String id)
	{
		Person person = repository.findOne(id);
		return person;
	}

	@Override
	public List<Person> getAllPersons()
	{
		List<Person> persons = repository.findAll();
		return persons;
	}

	@Override
	public void deletePerson(String id)
	{
		repository.delete(id);
	}

}
