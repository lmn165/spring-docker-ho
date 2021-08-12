package com.practice.app.demo.calculator.controller;

import com.practice.app.demo.calculator.entity.Item;
import com.practice.app.demo.calculator.service.ItemServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController @RequiredArgsConstructor
@RequestMapping("/items")
public class ItemController {
    private final ItemServiceImpl itemService;

    @GetMapping("/all")
    public List<Item> findAll(){
        return itemService.findAll();
    }

    @GetMapping("/name/{name}")
    public List<Item> findAllByName(@PathVariable String name){
        return itemService.findAllByName(name);
    }

    @GetMapping("/id/{id}")
    public Optional<Item> some(@PathVariable long id){
        return itemService.findById(id);
    }
}
