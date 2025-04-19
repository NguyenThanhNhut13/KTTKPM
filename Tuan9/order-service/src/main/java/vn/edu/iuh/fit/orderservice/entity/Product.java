/*
 * @ (#) Product.java       1.0     12/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.orderservice.entity;
/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 12/04/2025
 * @version:    1.0
 */

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    private Long id;

    private String name;

    private String description;

    private double price;

    private int stockQuantity;

    private String imageUrl;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
