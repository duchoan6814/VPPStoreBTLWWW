package com.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.entity.Person;
import com.boot.service.PersonService;

@RestController
@RequestMapping("/api/v1/")
public class PeronRestController {

	@Autowired
	PersonService personService;
	
	@RequestMapping(value = "persons", method = RequestMethod.GET)
	public List<Person> getListPerson(){
		List<Person> listTemp = new ArrayList<Person>();
		personService.findAll().forEach(i -> listTemp.add(i));
		return listTemp;
	}

}
