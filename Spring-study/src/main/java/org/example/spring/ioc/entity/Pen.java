package org.example.spring.ioc.entity;

public class Pen {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                '}';
    }
}
