package com.user.service;
import java.util.List;

import com.user.entities.*;
import com.user.exception.UserNotFoundException;

public interface UserService {

	public User addUser(User user);

	public User getUser(int id) throws UserNotFoundException;

	public List<User> sortUsers();
}
