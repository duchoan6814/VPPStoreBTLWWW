package com.boot.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.boot.entity.Person;

@Service
public interface PersonService extends JpaRepository<Person, Long> {

}
