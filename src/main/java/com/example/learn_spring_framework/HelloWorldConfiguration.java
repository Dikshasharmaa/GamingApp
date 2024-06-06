package com.example.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};
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
        return new Person("Akash",24, new Address("Orange St", "Wilmington"));
        // return person;
    }

    // Creating a new Person object with a relationship to existing beans (name and age)
    @Bean
    public Person person2(String name, int age){
        return new Person(name(),age(), address()); //One way is through Method call
    }

    @Bean
    public Address address(){
        return new Address("Oracle Rd", "Wilmington");
    }


}
