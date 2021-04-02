package com.upgrad.technicalblogpost.repository;

import com.upgrad.technicalblogpost.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    public List<User> findByUserName(String userName);

//    @Query("select u from User u where u.userName like %:keyword%")
//    public List<User> searchByUserName(String keyword);

    public List<User> findByUserNameIgnoreCaseContaining(String keyword);

}