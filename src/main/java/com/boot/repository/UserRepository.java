package com.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.boot.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	User findByEmail(String userName);
}
