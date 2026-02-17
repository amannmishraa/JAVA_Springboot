package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/cricket")
public class CricketerController {

    @RequestMapping("/show")
    public String showCricketerPage() {
        return "cricketers";   // must be inside templates folder
    }

    @RequestMapping("/showCric")
    public ModelAndView showCricketerData() {

        ModelAndView mv = new ModelAndView("cricketers");

        String name = "uppu";
        Date dt = new Date();

        mv.addObject("myname", name);
        mv.addObject("mydate", dt);

        return mv;
    }

}
