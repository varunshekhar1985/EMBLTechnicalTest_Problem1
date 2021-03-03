package com.solution.allmethods.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.solution.allmethods.beans.PersonService;

@Controller
public class PersonDeleteControllers {

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/person/{personId}")
	
	@ResponseBody
	public String deletePersonRecord(@PathVariable("personId") String personId) {
		return PersonService.getInstance().deletePersonRecord(personId);
	}
}
