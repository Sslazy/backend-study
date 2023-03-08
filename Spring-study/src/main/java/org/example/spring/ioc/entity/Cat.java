package org.example.spring.ioc.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cat {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    private String age;
    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
