package com.project.bdd.resource;

import com.project.bdd.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.security.krb5.Credentials;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LoginResource {
    List<User> users = new ArrayList<>();

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public Object addUser(@RequestBody User user) {
        users.add(user);
        return new ResponseEntity<Object>(users, HttpStatus.CREATED);
    }
}
