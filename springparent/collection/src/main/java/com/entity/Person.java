package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Lazy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Lazy(true)
public class Person {

    private String name;

    private String gender;

    private int age;

    @Resource(name="cars")
    private List<Car> cars;
     @Resource
    private Set<String> address;
      @Resource
    private Map account;
    @Resource
    private Properties phoneZone;

    //bean的初始化方法
    @PostConstruct
    public void initPerson(){
        System.out.println("initPerson()...");
    }

    //bean的销毁方法
    @PreDestroy
    public void destroyPerson(){
        System.out.println("destroyPerson()...");
    }
}
