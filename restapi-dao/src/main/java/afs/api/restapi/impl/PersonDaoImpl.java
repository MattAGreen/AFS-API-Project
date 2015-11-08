package afs.api.restapi.impl;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import afs.api.restapi.api.Person;
import afs.api.restapi.dao.PersonDao;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao {

private boolean activeDatabase=false;
	
	private HashMap<Long,Person> database;
	
	public PersonDaoImpl(){
		if(!activeDatabase){
			createPersonDatabase();
		}
	}
	
	public void createPersonDatabase() {
		// TODO Auto-generated method stub
		database =  new HashMap<Long,Person>();
		fillInWithData(database);
	}

	private void fillInWithData(HashMap<Long,Person> database){
		
	}
	

	public void erasePersonDatabase() {
		// TODO Auto-generated method stub
		
	}

	public boolean createPerson() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updatePerson() {
		// TODO Auto-generated method stub
		return false;
	}

	public Person getPerson(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Person getPerson(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updatePerson(Person Person) {
		// TODO Auto-generated method stub
		return false;
	}

}
