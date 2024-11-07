package ru.at0m1cc.lic_monitor_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RootController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
}