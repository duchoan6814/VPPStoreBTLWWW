package com.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.boot.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
	Role findByName(String name);
}
