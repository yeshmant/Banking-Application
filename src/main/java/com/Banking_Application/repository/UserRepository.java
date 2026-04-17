package com.Banking_Application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Banking_Application.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByPhoneNumber(String phoneNumber);

    Optional<User> findByAccountAccountNumber(String accountNumber);

    @Query("SELECT u FROM User u WHERE u.account.accountNumber = :accountNumber")
    Optional<User> findByAccountNumber(@Param("accountNumber") String accountNumber);
}
