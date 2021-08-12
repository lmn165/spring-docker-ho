package com.practice.app.demo.calculator.service;

import com.practice.app.demo.calculator.entity.Item;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ItemService {
    List<Item> findAll();
    List<Item> findAllByName(String itemName);
    Optional<Item> findById(long id);
}
