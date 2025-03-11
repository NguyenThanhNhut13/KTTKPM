/*
 * @ (#) PaymentDecorator.java       1.0     12/03/2025
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

abstract class PaymentDecorator implements Payment {
    protected Payment decoratedPayment;

    public PaymentDecorator(Payment decoratedPayment) {
        this.decoratedPayment = decoratedPayment;
    }

}
