package main.java.rest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import afs.api.restapi.api.School;
import afs.api.restapi.service.SchoolService;

@RestController
@RequestMapping("/school")
public class SchoolRestController {

	SchoolService schoolService;
    
    @RequestMapping(value="{id}" , method = RequestMethod.GET)
    public School getSchool(@PathParam("id") Long id){
    	return schoolService.getSchool(id);
    }
    
	@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createSchool(@RequestBody School school){
		if(schoolService.createSchool(school))
		return new ResponseEntity<String>(HttpStatus.CREATED);
		return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
    	
    }
    
    
    @RequestMapping(method = RequestMethod.GET)
    public List<School> getAllSchools(){
    	return schoolService.getAllSchools();
    }

    
    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteSchool(@RequestBody School school){
    	if(schoolService.deleteSchool(school))
			return new ResponseEntity<String>(HttpStatus.CREATED);
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    
}
