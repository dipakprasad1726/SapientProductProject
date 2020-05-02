package com.interview.sapient.model;

import java.util.Objects;

public class Product {
    private String category;
    private String brand;
    private int sku;
    private String color;
    private String price;
    private String seller;
    private String compareBy;

    public Product(String category, String brand, int sku, String color, String price, String seller, String compareBy) {
        this.category = category;
        this.brand = brand;
        this.sku = sku;
        this.color = color;
        this.price = price;
        this.seller = seller;
        this.compareBy = compareBy;
    }

    public Product(){
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public void setCompareBy(String compareBy){
        this.compareBy = compareBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        switch (product.compareBy){
            case "category":
                return Objects.equals(category, product.category);
            case "brand":
                return Objects.equals(brand, product.brand);
            case "sku":
                return Objects.equals(sku, product.sku);
            case "color":
                return Objects.equals(color, product.color);
            case "price":
                return Objects.equals(price, product.price);
            case "seller":
                return Objects.equals(seller, product.seller);
            default:
                return false;
        }
    }

    @Override
    public int hashCode() {
        return this.sku;
    }
}
