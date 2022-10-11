package com.example.main;

import com.example.main.bean.Person;
import com.example.main.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Lab1Application {

	public static void main(String[] args) {

		/*Person persoana  = new Person("Claudia");
		System.out.println(persoana.toString());*/

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Person persoana1 = context.getBean(Person.class);
		System.out.println(persoana1.toString());
	}

}
