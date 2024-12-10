package com.example.homework5CRUD.service;

import com.example.homework5CRUD.exception.PersonNotFoundException;
import com.example.homework5CRUD.model.Person;
import com.example.homework5CRUD.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public Optional<Person> getPerson(Long id) {
        return personRepository.findById(id);
    }

    public Iterable<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public List<Person> findPersonByName(String name){
        return personRepository.findPersonByName(name);
    }

    public Person updatePerson(Long id, Person personDetails) {
        Person person = personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException());
        person.setName(personDetails.getName());
        person.setEmail(personDetails.getEmail());
        return personRepository.save(person);
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

}
