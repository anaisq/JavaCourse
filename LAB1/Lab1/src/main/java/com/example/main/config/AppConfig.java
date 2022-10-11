package com.example.main.config;

import com.example.main.bean.Car;
import com.example.main.bean.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.main.bean")
public class AppConfig {

   /* @Bean
    public Person person(){
        return new Person("Cristina", car());
    }


    @Bean //(name = "ioana")
    public Person persoana2(){
        return new Person("Ioana");
    }

    @Bean
    public Car car() {
        return new Car("red");
    }

    @Bean(name = "whiteCar")
    public Car car1(){
        return new Car("white");
    }

    @Bean
    @Primary
    public Person person(@Qualifier("whiteCar") Car car){
        return new Person("Maria", car);
    }*/


}
