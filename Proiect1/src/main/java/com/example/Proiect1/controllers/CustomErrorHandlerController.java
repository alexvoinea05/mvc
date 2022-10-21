package com.example.Proiect1.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomErrorHandlerController implements ErrorController {

    @RequestMapping("/error")
    @ResponseBody
    public ModelAndView handlerError(Exception exception){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModel().put("exception", exception);
        modelAndView.setViewName("error_default");
        return modelAndView;
    }
}
