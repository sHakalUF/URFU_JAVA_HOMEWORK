package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getInfo() {
        return "main_page";
    }

    @GetMapping("/hr")
    public String getHRInfo() {
        return "hr";
    }

    @GetMapping("/manager")
    public String getManagerInfo() {
        return "manager";
    }
}
