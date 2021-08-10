package com.practice.app.demo.calculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class CalculatorServiceImplTest {

    @MockBean
    CalculatorServiceImpl calculatorService;

    @Test
    void createRandoms() {
        given(calculatorService.createRandomNumber()).willReturn(30);
        assertThat(calculatorService.createRandomNumber()).isEqualTo(30);
    }
}