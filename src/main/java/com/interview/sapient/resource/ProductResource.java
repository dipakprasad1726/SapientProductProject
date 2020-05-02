package com.interview.sapient.resource;

import com.interview.sapient.database.ProductTable;
import com.interview.sapient.model.GetProductRequest;
import com.interview.sapient.model.Product;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.ext.Provider;
import java.util.List;

@RequestMapping("product")
@RestController
@Provider
public class ProductResource {

    @GetMapping("/search_product")
    public List<Product> getAnyProduct(GetProductRequest productRequest){
        if(productRequest.getSearchBy()==null || productRequest.getSearchFor()==null) return null;
        switch (productRequest.getSearchBy()){
                case "category":
                    return ProductTable.getInstance().getProductByCategory(productRequest.getSearchFor());
                case "brand":
                    return ProductTable.getInstance().getProductByBrand(productRequest.getSearchFor());
                case "sku":
                    return ProductTable.getInstance().getProductBySku(Integer.parseInt(productRequest.getSearchFor()));
                case "color":
                    return ProductTable.getInstance().getProductByColor(productRequest.getSearchFor());
                case "price":
                    return ProductTable.getInstance().getProductByPrice(productRequest.getSearchFor());
                case "seller":
                    return ProductTable.getInstance().getProductBySeller(productRequest.getSearchFor());
                default:
                    return null;
        }
    }

    @PostMapping("/add_product")
    public void addProduct(Product product){
        ProductTable.getInstance().addProduct(product);
    }

    @DeleteMapping("/delete_product_by_brand")
    public void deleteProduct(String brand){
        ProductTable.getInstance().deleteProductByBrand(brand);
    }

}
