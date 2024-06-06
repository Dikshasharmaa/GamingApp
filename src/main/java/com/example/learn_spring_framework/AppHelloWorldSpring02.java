package com.example.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring02 {

	public static void main(String[] args) {
		//1. Launch a Spring Context
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//2.Configure the thing we want spring framework to manage - @Configuration
		// Hello World Configuration
		// name - @Bean

		//3. Retrieves the bean from the context
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));

	}

}
