package com.test;

import com.config.SpringConfiguration;
import com.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Person person = (Person) context.getBean("p1");
        System.out.println(person);
    }
}
