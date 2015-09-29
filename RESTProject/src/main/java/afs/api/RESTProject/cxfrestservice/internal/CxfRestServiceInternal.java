package afs.api.RESTProject.cxfrestservice.internal;

import java.util.ArrayList;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import afs.api.RESTProject.cxfrestservice.CxfRestService;
import afs.api.RESTProject.cxfrestservice.dao.AwardDao;
import afs.api.RESTProject.cxfrestservice.model.Award;

public class CxfRestServiceInternal implements CxfRestService {

	@Autowired
	private AwardDao awardDao;
	
	@Override
	public ArrayList<Award> getAllAwards() {
		// TODO Auto-generated method stub
		return awardDao.getAllAwards();
	}

	@Override
	public Award getAward(Long awardId) {
		// TODO Auto-generated method stub
		return awardDao.getAward(awardId);
	}

	@Override
	public Response updateAward(Long awardId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response deleteAward(Long awardId) {
		// TODO Auto-generated method stub
		return null;
	}

}
