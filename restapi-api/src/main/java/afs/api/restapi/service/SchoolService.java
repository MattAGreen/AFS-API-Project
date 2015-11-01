package afs.api.restapi.service;

import java.util.List;

import afs.api.restapi.api.School;

public interface SchoolService {

	School getSchool(Long id);
	List<School> getAllSchools();
	List<School> getAllSchoolsByType();
	boolean createSchool(School school);
	boolean updateSchool(School school);
	boolean deleteSchool(School school); 
}
