package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CityApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        City city = (City) context.getBean("city");
        System.out.println("City Name: " + city.getName());
        System.out.println("State: " + city.getState());
    }
}
