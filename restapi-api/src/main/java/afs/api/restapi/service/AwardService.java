package afs.api.restapi.service;

import java.util.List;

import afs.api.restapi.api.Award;
import afs.api.restapi.api.AwardType;

public interface AwardService {

	Award getAward(Long id);
	List<Award> getAllAwards();
	List<Award> getAllAwardsByType(AwardType awardType);
	List<AwardType> getAwardType();
	boolean createAward(Award award);
	boolean updateAward(Award award);
	boolean deleteAward(Award award); 
}
