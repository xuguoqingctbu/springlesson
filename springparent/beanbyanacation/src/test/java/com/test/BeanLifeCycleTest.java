package com.test;

import com.config.SpringConfiguration;
import com.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)                //指定junit4使用spring提供的测试环境
@ContextConfiguration("classpath:applicationContext.xml")
public class BeanLifeCycleTest {

     @Test
       public void testBeanLifeCycleTest(){
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Person person = (Person) context.getBean("p1");
        System.out.println(person);
        //关闭容器
        context.close();
    }
}
