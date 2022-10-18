package com.example.main.configuration;

import com.example.main.models.Bird;
import com.example.main.models.Cat;
import com.example.main.models.Person;
import com.example.main.models.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.main.models")
@PropertySource("classpath:application.properties")
public class ProjectConfig {

//    @Bean
//    public Person pers(){
//        Person pers = new Person();
//        pers.setName("Andrei");
//        return pers;
//    }
//
//    @Bean
//    public Pet pet(){
//        Pet pet = new Pet();
//        pet.setName("Tom");
//        pet.setAge(3);
//        return pet;
//    }
//
//    @Bean
//    public Person pers2(){
//        Person pers2 = new Person();
//        pers2.setName("Maria");
//        pers2.setPet(pet());
//        return pers2;
//    }

//    @Bean
//    public Person pers3(){
//        Person pers3 = new Person();
//        pers3.setName("Alina");
//        pers3.setPet(petB());
//        return pers3;
//    }
//
//    @Bean
//    public Pet petB(){
//        Pet petB = new Bird("Toto");
//        return petB;
//    }
//
//    @Bean
//    public Pet petC(){
//        Pet petC = new Cat("Tom", 4);
//        return petC;
//    }

    @Bean
    public String getName(){
        return "Mihai";
    }

}
