package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorldBean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(helloWorldBean1.getMessage());

        HelloWorld helloWorldBean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(helloWorldBean2.getMessage());

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat1.getName());

        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat2.getName());

        System.out.println(helloWorldBean1 == helloWorldBean2);
        System.out.println(helloWorldBean1 + " = " + helloWorldBean2);
        System.out.println(cat1 == cat2);
        System.out.println(cat1 + " != " + cat2);
    }
}