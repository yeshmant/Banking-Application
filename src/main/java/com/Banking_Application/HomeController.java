package com.Banking_Application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // this maps http://localhost:8080/login to login.html
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // looks for login.html inside templates/
    }
}
