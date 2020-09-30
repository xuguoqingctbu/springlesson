package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sun.font.TrueTypeFont;

//注意，这个组件默认是类名，字母首字母小写，也就是car
@Component("car1")
@Lazy()
public class Car {
    @Value("大众")
    private String brand; //汽车品牌
    @Value("黑色")
    private String color; //汽车颜色

    public Car() {

    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
