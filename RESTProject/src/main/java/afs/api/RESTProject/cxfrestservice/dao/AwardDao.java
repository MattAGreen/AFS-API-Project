package afs.api.RESTProject.cxfrestservice.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.jetty.http.HttpStatus;

import afs.api.RESTProject.cxfrestservice.model.Award;

public class AwardDao {

	private HashMap<Long,Award> awards;
	
	
	public int createAward(Award award){
		return HttpStatus.OK_200;
	}
	
	public Award getAward(Long id){
		if(awards.isEmpty())
			createAwardDatabase();
		if(id==null)
			return null;
		return awards.get(id);
	}
	
	public int updateAward(Long id){
		return HttpStatus.OK_200;
	}
	
	public ArrayList<Award> getAllAwards(){
		if(awards.isEmpty())
			createAwardDatabase();
		return (ArrayList<Award>) awards.values();
	}
	
	private void createAwardDatabase(){
		awards = new HashMap<Long,Award>();
		Award award1 = new Award();
		award1.setId(1L);
		award1.setAwardName("Pell");
		award1.setAwardAmount(2222222222L);
		award1.setAwardOwner(1L);
		awards.put(award1.getId(), award1);
		Award award2 = new Award();
		award2.setId(2L);
		award2.setAwardName("President Scholarship");
		award2.setAwardAmount(2222222222L);
		award2.setAwardOwner(1L);
		awards.put(award2.getId(), award2);
		Award award3 = new Award();
		award3.setId(3L);
		award3.setAwardName("Rhodes");
		award3.setAwardAmount(2222222222L);
		award3.setAwardOwner(1L);
		awards.put(award3.getId(), award3);
		Award award4 = new Award();
		award4.setId(4L);
		award4.setAwardName("Bell");
		award4.setAwardAmount(2222222222L);
		award4.setAwardOwner(1L);
		awards.put(award4.getId(), award4);

	}
	
	
}
