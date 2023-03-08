package org.example.spring.ioc;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    private String msg;
    public void  setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    public UserServiceImpl(String msg){
        this.msg = msg;
    }

    @Override
    public void say() {
        this.userDao.say();
        System.out.println("userDao say hello world!");
    }
}
