package main.java.rest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import afs.api.restapi.api.Award;
import afs.api.restapi.api.AwardType;
import afs.api.restapi.service.AwardService;

@RestController
@RequestMapping("/award")
public class AwardRestController {

	@Autowired
	AwardService awardService;
	    
	    @RequestMapping(value="{id}" , method = RequestMethod.GET)
	    public Award getAward(@PathParam("id") Long id){
	    	return awardService.getAward(id);
	    }
	    
		@RequestMapping(method = RequestMethod.POST)
	    public ResponseEntity<?> createAward(@RequestBody Award award){
			if(awardService.createAward(award))
			return new ResponseEntity<String>(HttpStatus.CREATED);
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	    	
	    }
	    
	    
	    @RequestMapping(method = RequestMethod.GET)
	    public List<Award> getAllAwards(){
	    	return awardService.getAllAwards();
	    }
	    
	    @RequestMapping(method = RequestMethod.GET)
	    public List<Award> getAwardsByType(@RequestParam(value="awardType") AwardType awardType){
	    	return awardService.getAllAwardsByType(awardType);
	    }
	    
	    @RequestMapping(method = RequestMethod.DELETE)
	    public ResponseEntity<?> deleteAward(@RequestBody Award award){
	    	if(awardService.deleteAward(award))
				return new ResponseEntity<String>(HttpStatus.CREATED);
				return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	    
	    
}
