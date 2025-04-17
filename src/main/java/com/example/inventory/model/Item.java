package com.example.inventory.model;

import jakarta.persistence.*;

@Entity
public class Item {

    @Id
    @Column(unique = true, nullable = false)
    private String itemCode;

    private String name;
    private String category;
    private String unit;
    private int length;
    private int quantity;
    private String description;

    // Constructors
    public Item() {}

    public Item(String itemCode, String name, String category, int length, int quantity, String unit, String description) {
        this.itemCode = itemCode;
        this.name = name;
        this.category = category;
        this.unit = unit;
        this.length = length;
        this.quantity = quantity;
        this.description = description;
    }

    // Getters & Setters
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
