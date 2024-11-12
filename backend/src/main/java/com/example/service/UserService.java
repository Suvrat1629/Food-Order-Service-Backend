package com.example.service;

import com.example.model.User;
import jdk.jshell.spi.ExecutionControl;

public interface UserService {

    public User findUserByJwtToken(String jwt) throws Exception;

    public User findUserByEmail(String email) throws Exception;
}
