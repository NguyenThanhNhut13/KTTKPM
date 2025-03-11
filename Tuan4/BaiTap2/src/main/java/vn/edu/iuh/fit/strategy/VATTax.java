/*
 * @ (#) VATTax.java       1.0     11/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.strategy;
/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 11/03/2025
 * @version:    1.0
 */

public class VATTax implements TaxStrategy {

    @Override
    public double calculateTax(double price) {
        return price * 0.08;
    }
}
