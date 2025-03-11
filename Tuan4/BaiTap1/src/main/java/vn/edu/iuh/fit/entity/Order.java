/*
 * @ (#) Order.java       1.0     11/03/2025
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

import vn.edu.iuh.fit.state.CancelledOrderState;
import vn.edu.iuh.fit.state.NewOrderState;
import vn.edu.iuh.fit.state.OrderState;
import vn.edu.iuh.fit.state.ProcessingOrderState;

public class Order {
    private final int id;
    private OrderState state;

    public Order(int id) {
        this.id = id;
        this.state = new NewOrderState();
    }

    public void processOrder() {
        if (state instanceof CancelledOrderState) {
            System.out.println("⛔ Đơn hàng đã bị hủy. Không thể tiếp tục xử lý!");
        } else {
            state.processOrder(this);
        }
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void cancel() {
        if (state instanceof ProcessingOrderState) {
            this.state = new CancelledOrderState();
            this.state.processOrder(this);
        } else {
            System.out.println("❌ Không thể hủy đơn hàng ở trạng thái hiện tại!");
        }
    }

    public int getId() {
        return id;
    }

    public String getStateName() {
        return state.getStateName();
    }

}
