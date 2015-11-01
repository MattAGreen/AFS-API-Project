package afs.api.restapi.service;

import java.util.List;

import afs.api.restapi.api.Person;

public interface PersonService {

	Person getPerson(Long id);
	List<Person> getAllPersons();
	List<Person> getAllPersonsByType();
	boolean createPerson(Person person);
	boolean updatePerson(Person person);
	boolean deletePerson(Person person); 	
	
}
