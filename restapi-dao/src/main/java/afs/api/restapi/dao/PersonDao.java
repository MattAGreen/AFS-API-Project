package afs.api.restapi.dao;

import afs.api.restapi.api.Person;

public interface PersonDao {

	void createPersonDatabase();
	void erasePersonDatabase();
	boolean createPerson();
	boolean updatePerson();
	Person getPerson(Long id);
	Person getPerson(String name);
	boolean updatePerson(Person Person);
}
