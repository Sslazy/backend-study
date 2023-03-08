package org.example.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void save() {
        this.userDao.save();
        System.out.println("userService...save...");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
