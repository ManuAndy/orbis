package com.example.orbis;

import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

@Controller
public class OrbisController {
    @GetMapping("/showStats/{country}/{username}")
    @ResponseBody
    public String showStats(@PathVariable String country, @PathVariable String username) {
        return "Name: " + country + ", Username: " + username;
    }

    @GetMapping("/")
    public String home() {
        return "orbis";
    }

    @GetMapping("/orbis")
    public String info()
    {
        return "orbisFirstPage";
    }

    @GetMapping("/nastya")
    @ResponseBody
    public String sendResponseBody()
    {
        return "This is an example for Nastya how Spring Boot and Thymeleaf work";
    }
}