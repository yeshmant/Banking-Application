package com.Banking_Application.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FundTransferController {

    // Show fund transfer page
    @GetMapping("/fund_transfer")
    public String showFundTransferPage(Model model) {
        model.addAttribute("message", "Transfer funds securely");
        return "fund_transfer"; // this will load fund-transfer.html from templates
    }

    // Handle transfer form submission
    @PostMapping("/fund_transfer")
    public String processFundTransfer(
            @RequestParam("fromAccount") String fromAccount,
            @RequestParam("toAccount") String toAccount,
            @RequestParam("amount") double amount,
            Model model) {

        // 🚩 For now, just mock transfer success (later you connect DB/service here)
        String statusMessage = "Successfully transferred ₹" + amount 
                                + " from " + fromAccount 
                                + " to " + toAccount;

        model.addAttribute("message", statusMessage);
        return "fund_transfer"; // reload same page with message
            }
        
}



