package com.config;

import com.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean("p1")
    public Person getPerson(){
        return new Person("zhangsan","男",20);
    }
}
