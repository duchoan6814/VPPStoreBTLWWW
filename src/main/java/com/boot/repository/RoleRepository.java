package com.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.boot.entity.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
	Role findByName(String name);
}
