/*
 * @ (#) DiscountCode.java       1.0     12/03/2025
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

public class DiscountCode extends PaymentDecorator{

    public DiscountCode(Payment decoratedPayment) {
        super(decoratedPayment);
    }

    @Override
    public double getCost() {
        return decoratedPayment.getCost() * 0.9; // Giảm giá 10%
    }

    @Override
    public String getDescription() {
        return decoratedPayment.getDescription() + " + Discount Code";
    }
}
