package com.practice.app.demo.calculator.service;

import com.practice.app.demo.calculator.entity.User;
import com.practice.app.demo.calculator.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public final class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public List<User> findAllByName(String name){
        return userRepository.findAllByName(name);
    }
}
