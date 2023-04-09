package com.mk.gateway.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebAction {


    @RequestMapping("/error")
    public String error(){
        return "gateway===error!!!";
    }
}
