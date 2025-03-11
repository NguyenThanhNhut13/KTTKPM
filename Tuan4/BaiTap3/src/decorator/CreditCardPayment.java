/*
 * @ (#) CreditCardPayment.java       1.0     12/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package decorator;
/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 12/03/2025
 * @version:    1.0
 */

public class CreditCardPayment implements Payment {
    private final double amount;

    public CreditCardPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double getCost() {
        return amount;
    }

    @Override
    public String getDescription() {
        return "Credit Card Payment";
    }
}
