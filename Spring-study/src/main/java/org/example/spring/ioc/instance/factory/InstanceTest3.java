package org.example.spring.ioc.instance.factory;

import org.example.spring.ioc.instance.static_factory.Bean2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans3.xml");
        Bean3 bean3 = context.getBean("bean3",Bean3.class);
        System.out.println(bean3);
    }
}
