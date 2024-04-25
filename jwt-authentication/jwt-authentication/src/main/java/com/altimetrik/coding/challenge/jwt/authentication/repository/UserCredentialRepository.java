package com.altimetrik.coding.challenge.jwt.authentication.repository;


import com.altimetrik.coding.challenge.jwt.authentication.entity.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserCredentialRepository extends JpaRepository<UserCredential,Integer> {
    Optional<UserCredential> findByName(String username);
}
