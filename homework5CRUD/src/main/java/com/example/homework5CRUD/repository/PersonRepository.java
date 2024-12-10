package com.example.homework5CRUD.repository;

import com.example.homework5CRUD.model.Person;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {
    @Query("SELECT * FROM person WHERE name =:name")
    List<Person> findPersonByName(String name);
}
