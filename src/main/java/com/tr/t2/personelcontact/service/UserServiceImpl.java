package com.tr.t2.personelcontact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tr.t2.personelcontact.dao.UserRepository;
import com.tr.t2.personelcontact.model.User;

@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	private UserRepository repository;

	public UserRepository getRepository()
	{
		return repository;
	}

	public void setRepository(UserRepository repository)
	{
		this.repository = repository;
	}

	@Override
	public void addUser(User user)
	{
		repository.save(user);
	}

	@Override
	public User getUser(String id)
	{
		User user = repository.findOne(id);
		return user;
	}

	@Override
	public List<User> getAllUser()
	{
		List<User> users = repository.findAll();
		return users;
	}

	@Override
	public void updateUser(User user, String id)
	{
		User dbUser = getUser(id);
		dbUser.setName(user.getName());
		dbUser.setSurname(user.getSurname());
		repository.save(dbUser);
	}

	@Override
	public void deleteUser(String id)
	{
		repository.delete(id);
	}

}
