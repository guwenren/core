package com.guwr.core.service.impl;

import com.guwr.core.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void print() {
        System.out.println("print");
    }
}
