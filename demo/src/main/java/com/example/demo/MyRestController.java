package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/web")
public class MyRestController {

    @GetMapping()
    public String index(){
    return "index";
    }
}
