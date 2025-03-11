/*
 * @ (#) NewOrderState.java       1.0     11/03/2025
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

public class NewOrderState implements OrderState {

    @Override
    public void processOrder(Order order) {
        order.setState(new ProcessingOrderState());
        System.out.println("Đơn hàng #" + order.getId() + " đã được kiểm tra và chuyển sang trạng thái đang xử lý");
    }

    @Override
    public String getStateName() {
        return "Mới tạo";
    }
}
