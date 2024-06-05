package com.example.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Diksha Sharma";
    }

    @Bean
    public int age() {
        return 22;
    }

    @Bean
    public Person person(){
        var person = new Person("Akash",24);
        return person;
    }


}
