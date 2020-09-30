package com.config;

import com.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages=("com"))
public class SpringConfiguration2 {
    @Bean("p2")
    public Person getPerson(){
        return new Person("zhangsan","男",20);
    }
}
