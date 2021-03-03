package com.solution.allmethods.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.solution.allmethods.beans.*;

@Controller
public class CreatePersonControllers {

	@RequestMapping(method = RequestMethod.POST, value="/add/person")
	
	@ResponseBody
	public PersonServiceResponse addPerson(@RequestBody Person person) {
		PersonServiceResponse perAddRes = new PersonServiceResponse();
		PersonService.getInstance().addPerson(person);
		perAddRes.setPersonId(person.getPersonId());
		perAddRes.setFirst_name(person.getFirst_name());
		perAddRes.setLast_name(person.getLast_name());
		perAddRes.setAge(person.getAge());
		perAddRes.setFavourite_colour(person.getFavourite_colour());
		
		return perAddRes;
	}
}
