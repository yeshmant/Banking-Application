package com.Banking_Application.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@Data
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(unique = true)
    private String token;

    @NotNull
    private Date createdAt = new Date();

    @NotNull
    private Date expiryAt;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Token(Long id, String token, Date createdAt, Date expiryAt, Account account) {
        this.id = id;
        this.token = token;
        this.createdAt = createdAt;
        this.expiryAt = expiryAt;
        this.account = account;
    }
}
