package com.example.homework5CRUD.model;


import org.springframework.data.annotation.Id;

public class Person {

    @Id
    private Long id;
    private String name;
    private String email;

    // Конструкторы, геттеры и сеттеры
    public Person() {}

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
