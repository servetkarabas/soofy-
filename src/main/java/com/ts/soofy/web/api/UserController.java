package com.ts.soofy.web.api;

import java.awt.TrayIcon.MessageType;
import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ts.soofy.model.User;
import com.ts.soofy.web.service.UserService;
import com.ts.soofy.web.service.UserServiceBean;

@RestController
public class UserController {
	
	@Autowired
	private	UserService	userService;
	
	@RequestMapping(value = "api/users", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<User>> getUsers() {
		Collection<User> users = userService.findAll();
		return new ResponseEntity<Collection<User>>(users, HttpStatus.OK);
	}

	@RequestMapping(value = "api/users/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
		User user = userService.findOne(id);
		if (user == null) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@RequestMapping(value = "api/users", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> createUser(@RequestBody User user) {

		User savedUser = userService.create(user);

		return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/api/users/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		User updatedUser = userService.update(user);
		if (updatedUser == null) {
			return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<User>(updatedUser, HttpStatus.OK);

	}

	@RequestMapping(value="api/users/{id}", 
			method=RequestMethod.DELETE, 
			consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public	ResponseEntity<User> deleteUser(@RequestBody User user){
		userService.delete(user.getId());
		return	new ResponseEntity<User>(HttpStatus.NO_CONTENT);
		
		/*
		if(delete){
			return	new ResponseEntity<User>(HttpStatus.NO_CONTENT);
		}
		return	new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
		*/
		
	}
}
