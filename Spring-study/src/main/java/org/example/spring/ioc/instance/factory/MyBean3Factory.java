package org.example.spring.ioc.instance.factory;

import org.example.spring.ioc.instance.static_factory.Bean2;

public class MyBean3Factory {

    public MyBean3Factory(){
        System.out.println("Bean3工厂实例化中");
    }
    public Bean3 createBean(){
        return new Bean3();
    }
}
