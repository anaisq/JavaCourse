package ex1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static ex1.constants.Constants.*;

@Component
public class Person {

    @Autowired
    @Lazy(value = true)
    private Pet pet;

    @PostConstruct
    private void postConstructMethod(){
        System.out.println(POST_CONSTRUCT_MESSAGE + this.getClass().getName());
        System.out.println(this.pet.talk());
    }


    @PreDestroy
    private void preDestroyMethod(){
        System.out.println(PRE_DESTROY_MESSAGE);
    }

}