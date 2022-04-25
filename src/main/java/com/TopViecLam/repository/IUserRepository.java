package com.TopViecLam.repository;

import com.TopViecLam.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByUserName(String userName);

    Optional<User> findUserByPhoneNumber(String phoneNumber);

    Optional<User> findById(Long id);


    Boolean existsByUserName(String username);






}
