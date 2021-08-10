package com.practice.app.demo.calculator.repository;

import com.practice.app.demo.calculator.entity.Calculator;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculatorRepository extends MongoRepository<Calculator, Long> {
}
