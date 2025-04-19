/*
 * @ (#) ProductService.java       1.0     12/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.productservice.service;
/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 12/04/2025
 * @version:    1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.productservice.entity.Product;
import vn.edu.iuh.fit.productservice.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product saveProduct(Product productSave) {
        Product product = new Product();
        System.out.println("Save: "+ productSave);
        if (productSave.getId() == null) {
            product = productSave;
        } else {
            product = productRepository.findById(productSave.getId()).orElse(null);
            if(product == null) {
                return null;
            }
            if (productSave.getName() != null) {
                product.setName(productSave.getName());
            }
            if (productSave.getDescription() != null) {
                product.setDescription(productSave.getDescription());
            }
            if (productSave.getPrice() != null) {
                product.setPrice(productSave.getPrice());
            }
            if (productSave.getStockQuantity() != null) {
                product.setStockQuantity(productSave.getStockQuantity());
            }
            if (productSave.getStatus() != null) {
                product.setStatus(productSave.getStatus());
            }
        }
        System.out.println(product);
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product decrement(Long id, int quantity) {
        Product product = productRepository.findById(id).orElse(null);
        if (product != null) {
            product.setStockQuantity(product.getStockQuantity() - quantity);
            return productRepository.save(product);
        }
        return null;
    }
}
