package com.usertest;

import com.user.entities.User;
import com.user.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class UserTests {
	@Autowired
	UserDao ud;
        
        @Test
	public void addUser(){
		User u = new User();
		u.setId(101);
		u.setFirstName("Shashwat");
		u.setLastName("Pandey");
		u.setEmail("shashwatp145@gmail.com");
		ud.save(u);
		assertNotNull(ud.findById(007).get());
	}
        
        @Test
	public void getUser(){
		User u = ud.findById(007).get();
		assertEquals("Shashwat",u.getFirstName());
	}

	@Test
	public void getUsers(){
		List list = ud.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void sortUser(){
		List list = ud.findAll(Sort.by("email").ascending());
		assertThat(list).size().isGreaterThan(0);
	}
}
