package com.practice_spring_mvc_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {


    @GetMapping("/customers")
    public String showList(Model model) {
        model.addAttribute("mess", "day la gia tri cua model");
        return "list";
    }

    @GetMapping("/khachhang")
    public ModelAndView showList1() {
        ModelAndView mv = new ModelAndView("list");
        mv.addObject("mess", "day la gia tri cua model and view");
        return mv;
    }
}
