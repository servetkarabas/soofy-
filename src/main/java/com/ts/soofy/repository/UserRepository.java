package com.ts.soofy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.soofy.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
