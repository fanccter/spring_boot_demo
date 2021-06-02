package com.fanciter.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.fanciter.bean.User;
import com.fanciter.service.UserService;

@Controller
public class LoginApi {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        List<User> list = userService.loginIn(name,password);
        if(!list.isEmpty()){
            return "success";
        }else {
            return "error";
        }
    }



}
