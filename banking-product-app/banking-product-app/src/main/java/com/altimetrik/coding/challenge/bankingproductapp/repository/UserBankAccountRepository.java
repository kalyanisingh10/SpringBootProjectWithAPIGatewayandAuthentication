package com.altimetrik.coding.challenge.bankingproductapp.repository;

import com.altimetrik.coding.challenge.bankingproductapp.entity.UserBankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBankAccountRepository extends JpaRepository<UserBankAccount,Long> {
}
