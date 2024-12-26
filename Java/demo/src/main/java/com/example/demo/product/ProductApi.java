package com.example.demo.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductApi {
    List<Product> products = new ArrayList<>();
    private Long id = 0L;

    {
        products.add(new Product(++id, "초기 상품명", 1000));
    }

    @GetMapping("/products/create")
    public Product createProduct() {
        Product product = new Product(++id, "상품명", 1500);
        products.add(product);

        return product;
    }

    @GetMapping("/products")
    public List<Product> readProducts() {
        return products;
    }

    @GetMapping("/products/{id}")
    public Product readProductById(@PathVariable Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @GetMapping("/products/{id}/update")
    public Product updateProduct(@PathVariable Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                product.setName("수정된 상품명");
                product.setPrice(2000);
                return product;
            }
        }
        return null;
    }

    @GetMapping("/products/{id}/delete")
    public void deleteProduct(@PathVariable Long id) {
        Product removedProduct = null;
        for (Product product : products) {
            if (product.getId().equals(id)) {
                removedProduct = product;
                break;
            }
        }
        products.remove(removedProduct);
    }
}
