package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;
    private String gender;
    private int age;
    //根据类型自动注入
  // @Autowired
//    @Qualifier("car2")
    @Autowired
    private Car car;
    @PostConstruct
    public static void initPerson(){
        System.out.println("initPerson()");
    }
    @PreDestroy
    public static void destoryPerson(){
        System.out.println("destoryPerson()");
    }
   /* public Person() {
        System.out.println("执行Person()>>>>>>>>>>");
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("执行Person(String name, String gender, int age)》》》》》》》》");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

   @Resource(name="car1")
    public void setCar(Car car) {
        this.car = car;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }*/

}
