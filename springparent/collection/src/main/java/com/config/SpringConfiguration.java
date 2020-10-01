package com.config;

import com.entity.Car;
import com.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.*;

@Configuration
@ComponentScan(basePackages=("com"))
public class SpringConfiguration {
    @Bean(name = {"p1","person"})
    @Scope("singleton" ) // 等同于@Scope，默认是singleton
    public Person getPerson(){
        return new Person("zhangsan","男",20,null,null,null,null);
    }

    @Bean(name={"p2","person2"})
    @Scope("prototype")
    public Person getPerson1(){
        return new Person("李四","男",20,null,null,null,null);
    }

    @Bean("cars")
    public List<Car> getCars(){
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("大汽","black"));
        cars.add(new Car("奥迪","red"));
        cars.add(new Car("宝马","white"));
        return cars;
    }

    @Bean("address")
    public Set<String> getAddress(){
        Set address = new HashSet();
        address.add("西安市大学东路");
        address.add("西安市雁塔路");
        address.add("西安市咸宁西路");
        return address;
    }

    @Bean("account")
    public Map getAccount(){
        Map account = new HashMap();
        account.put("10000000","建设银行");
        account.put("10000001","工商银行");
        account.put("10000002","农业银行");
        account.put("10000003","中国银行");
        return account;
    }

    @Bean("phoneZone")
    public Properties getPoneZone(){
        Properties phoneZone = new Properties();
        phoneZone.put("010","北京");
        phoneZone.put("020","广州");
        phoneZone.put("021","上海");
        return phoneZone;
    }
}
