package com.interview.sapient;

import com.interview.sapient.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SapientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SapientApplication.class, args);
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Shirt", "Nike", 10001, "red", "5000", "Amazon", "sku"));
		productList.add(new Product("Jeans", "Adidas", 10002, "blue", "4000", "Amazon", "sku"));
		productList.add(new Product("Shirt", "Nike", 10003, "red", "5000", "Flipkart", "sku"));;
		for (Product p:productList) {
			if(p.equals(new Product("Shirt", "Adidas", 10003, "red", "5000", "Flipkart", "brand"))){
				System.out.println(true + " : "+p.getSku());
			}
		}
		System.out.println("done checking");
		System.out.println(productList.contains(new Product("Shorts", "Nike", 10003, "red", "5000", "Flipkart", "category")));
	}

}
