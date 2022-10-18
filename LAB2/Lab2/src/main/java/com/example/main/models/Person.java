package com.example.main.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Value("${person.name}")
    private String name;

    @Autowired
    @Qualifier("cat")
    private Pet pet;

    public String getName() {
        return name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {

        if (pet == null)
            return "Person{" +
                    "name='" + name + '\'' +
                    "pet= " + //pet.toString() +
                    '}';
        else
            return "Person{" +
                    "name='" + name + '\'' +
                    "pet= " + pet.toString() +
                    '}';
    }
}
