package org.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

public class LoginController {
    @PostMapping("login")
    public ModelAndView login(String username, String password) {
        ModelAndView view = new ModelAndView("result");
        System.out.println(username);
        System.out.println(password);
        if (!"".equals(username.trim()) && !"".equals(password.trim())) {
            view.addObject("code", 0);
            view.addObject("username", username);
            view.addObject("password", password);
            view.addObject("msg", "登录成功");
        } else {
            view.addObject("code", 1);
            view.addObject("msg", "登录失败");
        }
        return view;
    }
}
