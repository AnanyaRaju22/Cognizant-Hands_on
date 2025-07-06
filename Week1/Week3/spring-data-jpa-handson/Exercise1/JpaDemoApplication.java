package com.example.jpa_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    @Autowired
    StudentRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Student(1, "Ananya"));
        repo.save(new Student(2, "Ravi"));

        repo.findAll().forEach(s -> System.out.println(s.getId() + ": " + s.getName()));
    }
}
