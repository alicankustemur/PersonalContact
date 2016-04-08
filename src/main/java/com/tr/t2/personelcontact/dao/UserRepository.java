package com.tr.t2.personelcontact.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tr.t2.model.personelcontact.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>
{

}
