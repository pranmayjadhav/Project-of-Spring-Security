package com.self.Spring.Security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return ("Welcome to Spring Security Project");
    }

    @GetMapping("/user")
    public String user() {
        return ("Welcome USER Spring Security Project");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome ADMIN Spring Security Project<h1>");
    }

}
