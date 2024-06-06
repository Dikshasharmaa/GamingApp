package com.example.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String street, String city) {};

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
        return new Person("Akash",24);
        // return person;
    }

    @Bean
    public Address address(){
        return new Address("Oracle Rd", "Wilmington");
    }


}
