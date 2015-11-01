package afs.api.restapi.dao;

import afs.api.restapi.api.School;

public interface SchoolDao {

	
	void createSchoolDatabase();
	void eraseSchoolDatabase();
	boolean createSchool();
	boolean updateSchool();
	School getSchool(Long id);
	School getSchool(String name);
	boolean updateSchool(School School);
}
