/*
 * @ (#) ProcessingFee.java       1.0     12/03/2025
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

public class ProcessingFee extends PaymentDecorator {

    public ProcessingFee(Payment decoratedPayment) {
        super(decoratedPayment);
    }

    @Override
    public double getCost() {
        return decoratedPayment.getCost() + 5.0; // Phí xử lý 5$
    }

    @Override
    public String getDescription() {
        return decoratedPayment.getDescription() + " + Processing Fee";
    }
}
