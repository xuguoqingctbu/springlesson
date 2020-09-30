package com.config;

import com.entity.Car;
import com.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages=("com"))
public class SpringConfiguration {

    @Bean(name= "p1",initMethod = "initPerson",destroyMethod = "destoryPerson")
    public Person getPerson(){
        return new Person("zhangsan","男",20,null);
    }

   /* @Bean("car1")
    public Car getCar1(){
        return new Car("BMW","black");
    }

    @Bean("car2")
    public Car getCar2(){
        return new Car("benchi","red");
    }*/
}
