package com.Banking_Application.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class CardsController {
    
    @GetMapping("/cards")
    public String cardspageString() {
        return "cards";
    }
    
}