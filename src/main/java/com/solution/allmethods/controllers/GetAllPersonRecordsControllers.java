package com.solution.allmethods.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

import com.solution.allmethods.beans.*;

@Controller
public class GetAllPersonRecordsControllers {
	
	@RequestMapping(method = RequestMethod.GET, value="person/getallperson")
	
	@ResponseBody
	public List<Person> getAllPerson(){
		return PersonService.getInstance().getPersonRecords();
	}
}
