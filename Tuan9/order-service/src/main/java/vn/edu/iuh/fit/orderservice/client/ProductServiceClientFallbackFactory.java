/*
 * @ (#) ProductServiceClientFallbackFactory.java       1.0     19/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.orderservice.client;
/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 19/04/2025
 * @version:    1.0
 */

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.orderservice.entity.Product;

@Component
public class ProductServiceClientFallbackFactory implements FallbackFactory<ProductServiceClient> {

    @Override
    public ProductServiceClient create(Throwable cause) {
        return new ProductServiceClient() {
            @Override
            public ResponseEntity<Product> getProductById(Long id) {
                // Log lỗi cụ thể
                System.err.println("Error getting product with id " + id + ": " + cause.getMessage());

                Product defaultProduct = new Product();
                defaultProduct.setId(id);
                defaultProduct.setName("Default Product (Error: " + cause.getClass().getSimpleName() + ")");
                defaultProduct.setPrice(0.0);
                return ResponseEntity.ok(defaultProduct);
            }

            @Override
            public ResponseEntity<Product> decrementProduct(Long id, int quantity) {
                // Log lỗi cụ thể
                System.err.println("Error decrementing product with id " + id + ": " + cause.getMessage());

                Product defaultProduct = new Product();
                defaultProduct.setId(id);
                defaultProduct.setName("Default Product (Decrement Failed: " + cause.getClass().getSimpleName() + ")");
                defaultProduct.setPrice(0.0);
                return ResponseEntity.ok(defaultProduct);
            }
        };
    }
}
