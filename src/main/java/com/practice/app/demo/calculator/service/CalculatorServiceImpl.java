package com.practice.app.demo.calculator.service;

import com.practice.app.demo.calculator.entity.Calculator;
import com.practice.app.demo.calculator.repository.CalculatorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public final class CalculatorServiceImpl implements CalculatorService{
    private final CalculatorRepository calculatorRepository;

    @Override
    public int createRandomNumber() {
        return (int)(Math.random()*100)+1;
    }
}
