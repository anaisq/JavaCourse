package com.example.main.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Car {
    private String color;

    /*public Car(String color){
        this.color = color;
    }*/

    public Car(){
        this.color = "white";
    }

    @Override
    public String toString(){
        return color + ".";
    }
}
