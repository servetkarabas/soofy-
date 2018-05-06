package com.ts.soofy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ts.soofy.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByLastnameStartsWithIgnoreCase(String lastname);
}
