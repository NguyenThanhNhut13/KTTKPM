/*
 * @ (#) ProductServiceClient.java       1.0     12/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.orderservice.client;
/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 12/04/2025
 * @version:    1.0
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.orderservice.entity.Product;

@FeignClient(name = "product-service", path = "/api/v1/products", fallback = ProductServiceClientFallbackFactory.class)
public interface ProductServiceClient {
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id);
    @PutMapping("/{id}/decrement/")
    public ResponseEntity<Product> decrementProduct(@PathVariable Long id, @RequestParam int quantity);

}
