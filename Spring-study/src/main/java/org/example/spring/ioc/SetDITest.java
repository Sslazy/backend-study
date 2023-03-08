package org.example.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetDITest {
    public static void main(String[] args) {
        String xmlPath = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) ac.getBean ("userService");
        userService.say();
    }
}
