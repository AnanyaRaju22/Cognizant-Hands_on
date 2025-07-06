package com.zoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("animal-beans.xml");
        Animal a = (Animal) context.getBean("animal");
        a.speak();
    }
}
