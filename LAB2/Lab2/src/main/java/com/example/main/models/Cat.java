package com.example.main.models;

import org.springframework.stereotype.Component;

import javax.swing.*;

import static com.example.main.constants.ProjectConstants.CAT_WALK;

@Component
public class Cat implements Pet{
    private String name = "Tom";

    private  int age = 3;

//    public Cat(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String walk() {
        return CAT_WALK;
    }
}
