package afs.api.restapi.impl;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import afs.api.restapi.api.School;
import afs.api.restapi.dao.SchoolDao;

@Repository("schoolDao")
public class SchoolDaoImpl implements SchoolDao {
 
	private boolean activeDatabase=false;
	
	private HashMap<Long,School> database;
	
	public SchoolDaoImpl(){
		if(!activeDatabase){
			createSchoolDatabase();
		}
	}
	
	public void createSchoolDatabase() {
		// TODO Auto-generated method stub
		database =  new HashMap<Long,School>();
		fillInWithData(database);
	}

	private void fillInWithData(HashMap<Long,School> database){
		
	}
	
	public void eraseSchoolDatabase() {
		// TODO Auto-generated method stub
		
	}

	public boolean createSchool() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateSchool() {
		// TODO Auto-generated method stub
		return false;
	}

	public School getSchool(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public School getSchool(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateSchool(School School) {
		// TODO Auto-generated method stub
		return false;
	}

}
