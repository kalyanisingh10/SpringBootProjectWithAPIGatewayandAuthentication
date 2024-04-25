package com.altimetrik.coding.challenge.bankingproductapp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="UserAccountDetails")
public class UserBankAccount {

    @Id
    private Long accountId;
    private String userName;
    private String password;
    private Double balance;
    private String accountType;
    private String city;
}
