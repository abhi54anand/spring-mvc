package com.abhinav.thymeleafdemo.controllers;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld-process";
    }


    @RequestMapping("/processFormv2")
    public String letsShout(HttpServletRequest request, Model model){

        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = " Hey there !! " + theName;
        model.addAttribute("message",result);

        return "helloworld-shout";
    }

    @RequestMapping("/processFormv3")
    public String processFormv3(@RequestParam("studentName") String theName, Model model){

        theName = theName.toUpperCase();
        String result = " Yo there !! from v3 " + theName;
        model.addAttribute("message",result);

        return "helloworld-shout";
    }






}
