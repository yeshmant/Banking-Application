package com.Banking_Application.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class BillPayController {

    @GetMapping("/bill_pay")
    public String getMethodName() {
        return "bill_pay";
    }
    

    
}
