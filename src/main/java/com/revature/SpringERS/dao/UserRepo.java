package com.revature.SpringERS.dao;

import com.revature.SpringERS.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    List<User> findAll();

    public abstract User findUserByUsernameAndPassword(String username, String password);

    Iterable<User> findUserById(int id);
}