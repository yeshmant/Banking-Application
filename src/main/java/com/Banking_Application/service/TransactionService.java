package com.Banking_Application.service;

import java.util.List;

import com.Banking_Application.dto.TransactionDTO;

public interface TransactionService {

	List<TransactionDTO> getAllTransactionsByAccountNumber(String accountNumber);
	void sendBankStatementByEmail(String accountNumber);

}
