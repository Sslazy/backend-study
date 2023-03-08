package org.example.vo;

import org.example.entity.User;

import java.util.List;

public class UserVO {
    private List<User> userList;

    public UserVO(List<User> userList) {
        this.userList = userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }
}
