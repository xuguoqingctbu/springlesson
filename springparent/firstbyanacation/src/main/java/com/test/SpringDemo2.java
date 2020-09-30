package com.test;

import com.config.SpringConfiguration2;
import com.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration2.class);
        Person person = (Person) context.getBean("p2");
        System.out.println(person);
    }
}
