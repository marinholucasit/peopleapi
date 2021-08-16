package com.marinho.peopleapi.service;

import com.marinho.peopleapi.dto.request.PersonDTO;
import com.marinho.peopleapi.entity.Person;
import com.marinho.peopleapi.mapper.PersonMapper;
import com.marinho.peopleapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public Person create(PersonDTO personDTO){
        Person person = personMapper.toModel(personDTO);

        Person personResponse = personRepository.save(person);
        return personResponse;
    }

    public List<PersonDTO> listAll() {
        List<Person> allPeople = personRepository.findAll();
        return allPeople.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }
}
