package org.example.spring.ioc.entity;

import java.util.List;

public class SchoolBag {
    private String color;

    private List<Pen> pencilCase;

    public List<Pen> getPencilCase(){
        return pencilCase;
    }

    public void setPencilCase(List<Pen> pencilCase) {
        this.pencilCase = pencilCase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "SchoolBag{" +
                "color='" + color + '\'' +
                ", pencilCase=" + pencilCase +
                '}';
    }
}
