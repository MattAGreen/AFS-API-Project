package afs.api.restapi.dao;

import afs.api.restapi.api.Award;

public interface AwardDao {

	void createAwardDatabase();
	void eraseAwardDatabase();
	boolean createAward();
	boolean updateAward();
	Award getAward(Long id);
	Award getAward(String name);
	boolean updateAward(Award award);
	
}
