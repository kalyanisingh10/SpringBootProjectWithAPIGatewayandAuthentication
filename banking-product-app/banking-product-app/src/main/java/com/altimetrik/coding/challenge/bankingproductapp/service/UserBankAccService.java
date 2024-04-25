package com.altimetrik.coding.challenge.bankingproductapp.service;

import com.altimetrik.coding.challenge.bankingproductapp.entity.UserBankAccount;
import com.altimetrik.coding.challenge.bankingproductapp.repository.UserBankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserBankAccService {

    @Autowired
    UserBankAccountRepository userBankAccountRepository;

    //CRUD operations of bank account

    public List<UserBankAccount> getAccount(){
       return userBankAccountRepository.findAll();
    }

    //Read user account
    public Optional<UserBankAccount> getUserAccount(Long accountId){
        return userBankAccountRepository.findById(accountId);

    }
    //create an account
    public UserBankAccount createBankAccount(UserBankAccount userBankAccount){
        UserBankAccount newAccountUser= new UserBankAccount();
        newAccountUser.setAccountId(UUID.randomUUID().getMostSignificantBits());
        newAccountUser.setAccountType(userBankAccount.getAccountType());
        newAccountUser.setUserName(userBankAccount.getUserName());
        newAccountUser.setCity(userBankAccount.getCity());
        newAccountUser.setBalance(userBankAccount.getBalance());
        newAccountUser.setPassword(userBankAccount.getPassword());
        return userBankAccountRepository.save(newAccountUser);


    }

    //Delete an account

    public String deleteBankAccount(long accountId){
        userBankAccountRepository.deleteById(accountId);
        return "Account deleted successfully";
    }

    //Update an account

    public UserBankAccount updateAccountDetails(UserBankAccount userBankAccount){

        UserBankAccount updateAccDetails= new UserBankAccount();
        //updateAccDetails.setAccountId(UUID.randomUUID().getMostSignificantBits());
        updateAccDetails.setAccountType(userBankAccount.getAccountType());
        updateAccDetails.setUserName(userBankAccount.getUserName());
        updateAccDetails.setCity(userBankAccount.getCity());
        updateAccDetails.setBalance(userBankAccount.getBalance());
        updateAccDetails.setPassword(userBankAccount.getPassword());
        return userBankAccountRepository.save(updateAccDetails);
    }
}
