package com.example.messenger.repository;

import com.example.messenger.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    Optional<UserModel> findByUsername(String username);

    Optional<UserModel> findByEmail(String email);

    void deleteByUsername(String username);
}
