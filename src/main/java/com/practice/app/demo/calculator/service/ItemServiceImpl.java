package com.practice.app.demo.calculator.service;

import com.practice.app.demo.calculator.entity.Item;
import com.practice.app.demo.calculator.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
public final class ItemServiceImpl implements ItemService{
    private final ItemRepository itemRepository;

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public List<Item> findAllByName(String itemName) {
        return itemRepository.findAllByItemName(itemName);
    }


    @Override
    public Optional<Item> findById(long id) {
        return itemRepository.findById(id);
    }
}
