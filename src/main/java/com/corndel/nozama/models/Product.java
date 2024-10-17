package com.corndel.nozama.models;

public class Product {
    private String id;
    private String name;
    private String description;
    private float price;
    private int stockQuantity;
    private String imageURL;

    public Product(String name, String id, String description, int stockQuantity, float price, String imageURL) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.stockQuantity = stockQuantity;
        this.price = price;
        this.imageURL = imageURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
