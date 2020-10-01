package com.test;


import com.config.SpringConfiguration;
import com.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CollectionTest {

    @Test
    public  void testCollectionTestByanacation(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Person person = (Person) context.getBean("p1");
        Person person2 = (Person) context.getBean("p2");

        System.out.println(person);
        System.out.println(person2);
        //关闭容器
        context.close();
    }

    @Test
    public  void testCollectionTestByxml(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("p1");
        Person person2 = (Person) context.getBean("p2");

        System.out.println(person);
        System.out.println(person2);
        //关闭容器
    }


}
