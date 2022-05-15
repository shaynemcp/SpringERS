package com.revature.SpringERS.service;

import com.revature.SpringERS.dao.UserRepo;
import com.revature.SpringERS.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private UserRepo userRepo;

    public User login(String username, String password){
        User user = userRepo.findByUsernameandPassword(username.trim(), password.trim());
        return  user;
    }
}
