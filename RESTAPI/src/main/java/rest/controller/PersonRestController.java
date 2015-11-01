package main.java.rest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import afs.api.restapi.api.Person;
import afs.api.restapi.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonRestController {

	PersonService personService;
    
    @RequestMapping(value="/{id}" , method = RequestMethod.GET)
    public Person getPerson(@PathParam("id") Long id){
    	return personService.getPerson(id);
    }
    
	@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createPerson(@RequestBody Person person){
		if(personService.createPerson(person))
		return new ResponseEntity<String>(HttpStatus.CREATED);
		return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
    	
    }
    
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Person> getAllPersons(){
    	return personService.getAllPersons();
    }
   
	@RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePerson(@RequestBody Person person){
    	if(personService.deletePerson(person))
			return new ResponseEntity<String>(HttpStatus.CREATED);
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
