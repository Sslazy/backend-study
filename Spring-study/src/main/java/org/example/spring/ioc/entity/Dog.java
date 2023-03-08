package org.example.spring.ioc.entity;

public class Dog {
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
