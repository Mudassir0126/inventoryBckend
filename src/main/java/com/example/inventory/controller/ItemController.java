package com.example.inventory.controller;

import com.example.inventory.model.Item;
import com.example.inventory.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@CrossOrigin(origins = "*") // Allow React to access this
public class ItemController {

    @Autowired
    private ItemRepository itemRepo;

    @GetMapping
    public List<Item> getAllItems() {
        return itemRepo.findAll();
    }

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return itemRepo.save(item);
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item item) {
        item.setId(id);
        return itemRepo.save(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemRepo.deleteById(id);
    }
}
