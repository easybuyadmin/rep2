package com.easybuy.manager.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/login")
public class LoginController {
 /*   @RequestMapping("/name")
    public Map login(){
        String name=SecurityContextHolder.getContext() .getAuthentication().getName();
        Map map=new HashMap();
        System.out.println(name);
        map.put("loginName", name);
        return map ;
    }*/
}