package com.Banking_Application.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // this maps http://localhost:8080/login to login.html
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // looks for login.html inside templates/
    }


    // this maps http://localhost:8080/dashboard to dashboard.html
    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        // Dummy user
        model.addAttribute("user", Map.of("name", "John Doe"));

        // Dummy account data
        List<Map<String, Object>> accounts = List.of(
            Map.of("type", "Savings Account", "number", "**** **** 1234", "balance", 150432.75, "currency", "₹"),
            Map.of("type", "Fixed Deposit", "number", "**** **** 5678", "balance", 500000.00, "currency", "₹")
        );
        model.addAttribute("accounts", accounts);

        return "dashboard"; // Will load templates/dashboard.html 
    }

    

    
}