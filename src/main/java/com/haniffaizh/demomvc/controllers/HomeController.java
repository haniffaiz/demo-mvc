package com.haniffaizh.demomvc.controllers;

import com.haniffaizh.demomvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String welcome(Model model){
        // doing something
        String messages = "Welcome to Spring MVC with kelaskoding";
        model.addAttribute("msg", messages);
        model.addAttribute("products", productService.findAll());
        return "index";
    }

}
