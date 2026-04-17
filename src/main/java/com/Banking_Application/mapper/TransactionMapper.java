package com.Banking_Application.mapper;

import org.springframework.stereotype.Component;

import com.Banking_Application.dto.TransactionDTO;
import com.Banking_Application.entity.Transaction;

@Component
public class TransactionMapper {

    public TransactionDTO toDto(Transaction transaction) {
        return new TransactionDTO(transaction);
    }
    
}
