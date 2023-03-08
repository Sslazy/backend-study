package org.example.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class FirstController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 创建视图对象
        ModelAndView view = new ModelAndView();
        // 向模型中添加数据
        view.addObject("msg","我的第一个 Spring MVC 应用");
        view.addObject("My","first Spring MVC Application");
        // 设置视图名称
        view.setViewName("/WEB-INF/jsp/first.jsp");
        return view;
    }
}
