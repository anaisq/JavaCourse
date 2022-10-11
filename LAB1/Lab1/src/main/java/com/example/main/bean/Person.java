package com.example.main.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Person {

    private String name;

    @Autowired
    private Car car;

    /*public Person(String name, Car car){
        this.name = name;
        this.car = car;
        System.out.println("A person was initialized");
    }*/
    public Person() {
        this.name = "Ana";
        this.car = car;
        System.out.println("A person was initialized");
    }

    @Override
    public String toString(){
        return "Person: " + this.name + ", car color: " + car.toString();
    }

}
