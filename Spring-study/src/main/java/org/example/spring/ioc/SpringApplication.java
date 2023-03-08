package org.example.spring.ioc;

import org.example.spring.ioc.entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        SpringApplication.cat(context);
        SpringApplication.dog(context);
        SpringApplication.book(context);
        SpringApplication.clothes(context);
        SpringApplication.clothes1(context);
        SpringApplication.schoolBagBean(context);
    }
    private static void cat(ApplicationContext context){
        Cat cat = context.getBean("Cat", Cat.class);
        System.out.println(cat);
    }
    private static void dog(ApplicationContext context){
        Dog dog = context.getBean("Dog", Dog.class);
        System.out.println(dog);
    }

    private static void book(ApplicationContext context){
        Book book = context.getBean("bookExample1",Book.class);
        Book book1 = context.getBean("bookExample", Book.class);
        System.out.println(book);
        System.out.println(book1);
    }

    private static void clothes(ApplicationContext context){
        Clothes clothes = context.getBean("clothes",Clothes.class);
        Person person = context.getBean("person",Person.class);
        System.out.println(person.dress() + clothes);

    }
    private static void clothes1(ApplicationContext context){
        Clothes clothes1 = context.getBean("clothes1",Clothes.class);
        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1.dress() + clothes1);
    }

    private static void schoolBagBean(ApplicationContext context){
        SchoolBag schoolBag = context.getBean("schoolBag",SchoolBag.class);
        System.out.println(schoolBag.getColor());
        System.out.println(schoolBag.getPencilCase());
    }

}
