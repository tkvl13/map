package com.example.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FController {

    @GetMapping("/hi")
    public String aa(Model model){
        model.addAttribute("username","감자");
        return "greetings";
    }

    @GetMapping("/ppp")
    public String bb(){
        return "00";
    }

    @GetMapping("/pp")
    public String cc(){
        return "001";
    }

    @GetMapping("/pppp")
    public String dd(){
        return "카카오지도";
    }


}
