package com.interview.sapient.database;

import com.interview.sapient.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductTable {
    private static ProductTable instance;
    private List<Product> productList = new ArrayList<>();

    private ProductTable(){}
    synchronized public static ProductTable getInstance(){
        if(instance == null)instance=new ProductTable();
        return instance;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void deleteProductByBrand(String brand){
        List<Product> t = new ArrayList<>();
        t.addAll(productList);
        for (Product p:t) {
            Product tmp = new Product();
            tmp.setCompareBy("brand");
            tmp.setBrand(brand);
            if(p.equals(tmp)){
                productList.remove(p);
            }
        }
    }

    public List<Product> getProductByCategory(String category){
        List<Product> sol = new ArrayList<>();
        for (Product p:productList) {
            Product tmp = new Product();
            tmp.setCompareBy("category");
            tmp.setCategory(category);
            if(p.equals(tmp)){
                sol.add(p);
            }
        }
        return sol;
    }

    public List<Product> getProductByBrand(String brand){
        List<Product> sol = new ArrayList<>();
        for (Product p:productList) {
            Product tmp = new Product();
            tmp.setCompareBy("brand");
            tmp.setBrand(brand);
            if(p.equals(tmp)){
                sol.add(p);
            }
        }
        return sol;
    }

    public List<Product> getProductBySku(int sku){
        List<Product> sol = new ArrayList<>();
        for (Product p:productList) {
            Product tmp = new Product();
            tmp.setCompareBy("sku");
            tmp.setSku(sku);
            if(p.equals(tmp)){
                sol.add(p);
            }
        }
        return sol;
    }

    public List<Product> getProductByColor(String color){
        List<Product> sol = new ArrayList<>();
        for (Product p:productList) {
            Product tmp = new Product();
            tmp.setCompareBy("color");
            tmp.setColor(color);
            if(p.equals(tmp)){
                sol.add(p);
            }
        }
        return sol;
    }

    public List<Product> getProductByPrice(String price){
        List<Product> sol = new ArrayList<>();
        for (Product p:productList) {
            Product tmp = new Product();
            tmp.setCompareBy("price");
            tmp.setPrice(price);
            if(p.equals(tmp)){
                sol.add(p);
            }
        }
        return sol;
    }

    public List<Product> getProductBySeller(String seller){
        List<Product> sol = new ArrayList<>();
        for (Product p:productList) {
            Product tmp = new Product();
            tmp.setCompareBy("seller");
            tmp.setSeller(seller);
            if(p.equals(tmp)){
                sol.add(p);
            }
        }
        return sol;
    }

    public int getProductAvailableNumberForSeller(String seller){
        int count = 0;
        for (Product p:productList) {
            Product tmp = new Product();
            tmp.setCompareBy("seller");
            tmp.setSeller(seller);
            if(p.equals(tmp)){
                count+=1;
            }
        }
        return count;
    }
}
