package com.ts.soofy.web.service;

import java.math.BigInteger;
import java.util.Collection;

import com.ts.soofy.model.User;

public interface UserService {
	Collection<User> findAll();
	User findOne(Long	id);
	User create(User user);
	User update(User user);
	void delete(Long id);
}
