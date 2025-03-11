/*
 * @ (#) Product.java       1.0     11/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.entity;
/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 11/03/2025
 * @version:    1.0
 */

import vn.edu.iuh.fit.strategy.TaxStrategy;

public class Product {
    private final String name;
    private final double price;
    private final TaxStrategy taxStrategy;

    public Product(String name, double price, TaxStrategy taxStrategy) {
        this.name = name;
        this.price = price;
        this.taxStrategy = taxStrategy;
    }

    public double getTotalPrice() {
        return price + taxStrategy.calculateTax(price);
    }

    public void displayInfo() {
        System.out.println(name + " - Giá gốc: " + price + " - Giá sau thuế: " + getTotalPrice());
    }
}
