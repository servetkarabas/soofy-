package com.ts.soofy.web.service;

import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.soofy.model.User;
import com.ts.soofy.repository.UserRepository;

@Service
public class UserServiceBean implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Collection<User> findAll() {
		Collection<User> users = userRepository.findAll();
		return users;
	}

	@Override
	public User findOne(Long id) {
		User user = userRepository.findOne(id);
		return user;
	}

	@Override
	public User create(User user) {
		if(user.getId() != null){
			// id ile create olmaz
			return null;
		}
		
		User savedUser = userRepository.save(user);
		return savedUser;
	}

	@Override
	public User update(User user) {
		
		User userPersisted  = findOne(user.getId());
		if(userPersisted == null){
			return null;
		}
		User upgradedUser = userRepository.save(user);
		return upgradedUser;
	}

	@Override
	public void delete(Long id) {
		userRepository.delete(id);
	}

}
