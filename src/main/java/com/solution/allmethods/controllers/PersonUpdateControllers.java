package com.solution.allmethods.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.solution.allmethods.beans.Person;
import com.solution.allmethods.beans.PersonService;

@Controller
public class PersonUpdateControllers {

	@RequestMapping(method = RequestMethod.PUT, value="/update/person")
	
	@ResponseBody
	public String updatePersonRecord(@RequestBody Person person) {
		return PersonService.getInstance().updatePersonRecord(person);
	}
	
}
