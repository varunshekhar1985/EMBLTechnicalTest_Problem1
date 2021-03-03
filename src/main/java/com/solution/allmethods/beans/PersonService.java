package com.solution.allmethods.beans;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
  
	private List<Person> personRecords;
	private static PersonService perReg = null;
	
	private PersonService() {
		personRecords = new ArrayList<Person>();
	}
	public static PersonService getInstance() {
		if(perReg == null) {
			perReg = new PersonService();
			return perReg;
		}else {
			return perReg;
		}
	}
	public void addPerson(Person person) {
		personRecords.add(person);
	}
	public String updatePersonRecord(Person person) {
		
		for(int i=0; i<personRecords.size(); i++) {
			Person per = personRecords.get(i);
			if(per.getPersonId().equals(person.getPersonId())) {
				personRecords.set(i, person);
				return "Update successful";
			}
		}
		return "Update un-successful";
	}
	public String deletePersonRecord(String personId) {
		
		for(int i=0; i<personRecords.size(); i++) {
			Person per = personRecords.get(i);
			if(per.getPersonId().equals(personId)) {
				personRecords.remove(i);
				return "Delete successful";
			}
		}
		return "Delete un-successful";
	}
	public List<Person> getPersonRecords(){
		return personRecords;
	}
}
