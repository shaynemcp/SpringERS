package com.revature.SpringERS.service;

import com.revature.SpringERS.dao.UserRepo;
import com.revature.SpringERS.model.User;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.login.FailedLoginException;

@Service
@Logger
public class AuthenticationService {

    @Autowired
    private UserRepo userRepo;

    public User login(String username, String password) throws FailedLoginException {
        try {
//            if (username.equals("") || password.equals(""))

//                System.out.println("Please enter some username and password");
        }
        catch (IllegalArgumentException e) {
            if (userRepo.findUserByUsernameAndPassword(username, password) == null) {
                throw new FailedLoginException("You must provide credentials for login including a username and password");
            }
        }
        User user = userRepo.findUserByUsernameAndPassword(username, password);

        return user;
    }
}
