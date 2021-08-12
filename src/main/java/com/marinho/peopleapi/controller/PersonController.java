package com.marinho.peopleapi.controller;

import com.marinho.peopleapi.entity.Person;
import com.marinho.peopleapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        Person personResponse = personService.create(person);
        return ResponseEntity.ok(personResponse);
    }
}
