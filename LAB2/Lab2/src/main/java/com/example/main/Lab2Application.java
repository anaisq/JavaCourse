package com.example.main;

import com.example.main.configuration.ProjectConfig;
import com.example.main.models.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Lab2Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//		Person person1 = context.getBean(Person.class);
//		System.out.println(person1.toString());
//
//		Person person2 = context.getBean("pers2", Person.class);
//		System.out.println(person2.toString());

		Person person3 = context.getBean(Person.class);
		System.out.println(person3.toString());
		System.out.println(person3.getPet().walk());

	}

}
