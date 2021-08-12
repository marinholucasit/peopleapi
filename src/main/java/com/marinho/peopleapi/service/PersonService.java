package com.marinho.peopleapi.service;

import com.marinho.peopleapi.entity.Person;
import com.marinho.peopleapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public Person create(Person person){
        Person personResponse = personRepository.save(person);
        return personResponse;
    }
}
