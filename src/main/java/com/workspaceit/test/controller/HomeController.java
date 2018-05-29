package com.workspaceit.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("shuvro");
        modelAndView.addObject("name", "Shuvro");
        return modelAndView;
    }
}
