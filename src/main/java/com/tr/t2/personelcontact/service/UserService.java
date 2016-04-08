package com.tr.t2.personelcontact.service;

import java.util.List;

import com.tr.t2.model.personelcontact.model.User;

public interface UserService
{

	public void addUser(User user);

	public User getUser(String id);

	public List<User> getAllUser();

	public void updateUser(User user, String id);

	public void deleteUser(String id);

}
