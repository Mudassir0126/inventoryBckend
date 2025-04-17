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

    @PutMapping("/{itemCode}")
    public Item updateItem(@PathVariable String itemCode, @RequestBody Item item) {
        item.setItemCode(itemCode);
        return itemRepo.save(item);
    }

    @DeleteMapping("/{itemCode}")
    public void deleteItem(@PathVariable String itemCode) {
        itemRepo.deleteById(itemCode);
    }
}
