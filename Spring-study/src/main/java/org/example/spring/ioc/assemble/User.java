package org.example.spring.ioc.assemble;

import java.util.List;

public class User {
    private String username;
    private Integer password;
    private List<String> list;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Integer getPassword() {
        return password;
    }

    public List<String> getList() {
        return list;
    }

    public User(String username, Integer password, List<String> list){
        this.username = username;
        this.list = list;
        this.password = password;

    }
    public User(){}
    public String getUsername(){
        return username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", list=" + list +
                '}';
    }
}
