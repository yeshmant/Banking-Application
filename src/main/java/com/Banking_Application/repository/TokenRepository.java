package com.Banking_Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Banking_Application.entity.Account;
import com.Banking_Application.entity.Token;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {

    Token findByToken(String token);

    Token[] findAllByAccount(Account account);

    void deleteByToken(String token);
}
