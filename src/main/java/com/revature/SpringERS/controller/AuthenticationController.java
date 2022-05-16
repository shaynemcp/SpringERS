package com.revature.SpringERS.controller;

import com.revature.SpringERS.model.User;
import com.revature.SpringERS.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.FailedLoginException;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody String username, String password) throws FailedLoginException {
        try {
//            if (username.equals("") || password.equals(""))
//                System.out.println(username);
//                System.out.println(password);
//                System.out.println("Please enter some username and password");
        }
        catch (IllegalArgumentException e) {
            if (authenticationService.login(username, password) == null) {
                throw new FailedLoginException("You must provide credentials for login including a username and password");
            }
        }
        User user = authenticationService.login(username, password);

        return ResponseEntity.ok().body(user);
    }
}
