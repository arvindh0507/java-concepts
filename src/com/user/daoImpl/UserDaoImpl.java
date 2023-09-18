package com.user.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.user.dao.UserDao;
import com.user.entity.User;

public class UserDaoImpl implements UserDao<User> {

	private List<User> users = new ArrayList<User>();
	
	//To Add New Users
	public void save(User user) {
		user.setId(users.size());
		users.add(user);
		System.out.println("(" + (users.size() - 1) + "): User Id = " + user.getId() + ", name = " + user.getName() + " & Email = " + user.getEmail());
	}

	//To Update Existing Users
	public void update(User user) {
		user.setName(Objects.requireNonNull(user.getName(), "Name cannot be null"));
		user.setEmail(Objects.requireNonNull(user.getEmail(), "Email cannot be null"));
		users.set(user.getId(), user);
		System.out.println("User name = " + user.getName() + " & Email = " + user.getEmail() + " updated successfully for user Id: "+ user.getId());
	}

	//To Delete Existing Users
	public void delete(User user) {
		users.remove(user);
		System.out.println("User name = " + user.getName() + " & Email = " + user.getEmail() + " deleted successfully");
	}

	//To Get Existing Users
	public User get(int id) {
		return users.get(id);
	}

	//To Get All Users
	public List<User> getAll() {
		return users;
	}
}