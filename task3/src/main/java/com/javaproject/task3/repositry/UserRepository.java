package com.javaproject.task3.repositry;

import org.springframework.data.repository.CrudRepository;

import com.javaproject.task3.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public User findByUsernameAndPassword(String username, String password);
	public User findById(int id);

}
