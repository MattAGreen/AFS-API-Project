package afs.api.restapi.impl;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import afs.api.restapi.api.Award;
import afs.api.restapi.dao.AwardDao;

@Repository("awardDao")
public class AwardDaoImpl implements AwardDao {

private boolean activeDatabase=false;
	
	private HashMap<Long,Award> database;
	
	public AwardDaoImpl(){
		if(!activeDatabase){
			createAwardDatabase();
		}
	}
	
	public void createAwardDatabase() {
		// TODO Auto-generated method stub
		database =  new HashMap<Long,Award>();
		fillInWithData(database);
	}

	private void fillInWithData(HashMap<Long,Award> database){
		
	}
	

	public void eraseAwardDatabase() {
		// TODO Auto-generated method stub
		
	}

	public boolean createAward() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateAward() {
		// TODO Auto-generated method stub
		return false;
	}

	public Award getAward(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Award getAward(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateAward(Award award) {
		// TODO Auto-generated method stub
		return false;
	}

}
