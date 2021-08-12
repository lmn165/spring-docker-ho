package com.practice.app.demo.calculator.service;

import com.practice.app.demo.calculator.entity.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CalculatorServiceImplTest {
    @Mock
    Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator(2, 4);
    }

    @Test
    void test_multi(){
        System.out.println(">>> " + calculator.toString());
    }
}