package com.altimetrik.coding.challenge.bankingproductapp.controller;


import com.altimetrik.coding.challenge.bankingproductapp.entity.UserBankAccount;
import com.altimetrik.coding.challenge.bankingproductapp.service.UserBankAccService;
import org.apache.catalina.User;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user-account")
public class BankAccountController {

    @Autowired
    UserBankAccService userBankAccService;

    @GetMapping("/{accountId}")
    public ResponseEntity<Optional<UserBankAccount>> getUserAccount(@PathVariable Long accountId){
        return  ResponseEntity.ok(userBankAccService.getUserAccount(accountId));
    }

    @PostMapping
    public ResponseEntity<UserBankAccount> createUserAccount(@RequestBody UserBankAccount bankAccountRequest){
        return ResponseEntity.ok(userBankAccService.createBankAccount(bankAccountRequest));
    }

    @DeleteMapping("/delete-account/{accountId}")
    public ResponseEntity<String> deleteUserAccount(@PathVariable Long accountId){
        if(accountId!=null){
            userBankAccService.deleteBankAccount(accountId);
            return ResponseEntity.ok("Account Deleted Successfully");
        }else{
            return ResponseEntity.ok("Account deletion failed");
        }
    }

    @PutMapping("/update-account/{accountId}")
    public ResponseEntity<UserBankAccount> updateUserAccount(@RequestBody UserBankAccount updateRequest, @PathVariable Long accountId){
        return ResponseEntity.ok(userBankAccService.updateAccountDetails(updateRequest));
    }
}
