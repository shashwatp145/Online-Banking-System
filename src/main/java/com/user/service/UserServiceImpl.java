package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.user.entities.User;
import com.user.exception.UserNotFoundException;
import com.user.dao.UserDao;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserDao ud;
	
	@Override
	public User getUser(int id) throws UserNotFoundException {
		User user=ud.findById(id).get();	
		if(user==null)
			throw new UserNotFoundException("Error 404");
		return user;
		
	}

	@Override
	public User addUser(User user) {
		ud.save(user);
		return user;
	}


	@Override
	public List<User> sortUsers() {
		return ud.findAll(Sort.by("email").ascending());
	}
	

}
