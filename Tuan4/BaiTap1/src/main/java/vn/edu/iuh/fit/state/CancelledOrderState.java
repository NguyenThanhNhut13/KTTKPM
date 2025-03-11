/*
 * @ (#) CancelledOrderState.java       1.0     11/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.state;
/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 11/03/2025
 * @version:    1.0
 */

import vn.edu.iuh.fit.entity.Order;

public class CancelledOrderState implements OrderState {

    @Override
    public void processOrder(Order order) {
        System.out.println("Đơn hàng #" + order.getId() + " đã được hủy và hoàn tiền thành công");
    }

    @Override
    public String getStateName() {
        return "Hủy";
    }
}
