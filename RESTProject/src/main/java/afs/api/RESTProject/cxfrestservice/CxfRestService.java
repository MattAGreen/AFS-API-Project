package afs.api.RESTProject.cxfrestservice;

import java.util.ArrayList;

import javax.jws.WebService;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.http.MediaType;

import afs.api.RESTProject.cxfrestservice.model.Award;


@Path("/")
@WebService(name="awardService")
public interface CxfRestService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	@Path("/")
	public ArrayList<Award> getAllAwards();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	@Path("/{awardId}")
	public Award getAward(Long awardId);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	@Path("/{awardId}")
	public Response updateAward(Long awardId);
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	@Path("/{awardId}")
	public Response deleteAward(Long awardId);
}
