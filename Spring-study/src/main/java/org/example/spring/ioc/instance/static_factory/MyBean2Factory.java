package org.example.spring.ioc.instance.static_factory;

import java.io.PipedOutputStream;

public class MyBean2Factory {
    public static Bean2 createBean(){
        return new Bean2();
    }
}
