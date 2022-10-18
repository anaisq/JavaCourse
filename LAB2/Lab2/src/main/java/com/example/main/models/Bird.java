package com.example.main.models;

import org.springframework.stereotype.Component;

import static com.example.main.constants.ProjectConstants.BIRD_WALK;

@Component
public class Bird implements Pet{

    private String name = "Toto";

//    public Bird(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    @Override
    public String walk() {
        return BIRD_WALK;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                '}';
    }
}
