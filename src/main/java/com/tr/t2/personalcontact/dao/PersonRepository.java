package com.tr.t2.personalcontact.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tr.t2.personalcontact.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String>
{

}
