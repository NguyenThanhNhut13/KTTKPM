/*
 * @ (#) OrderState.java       1.0     11/03/2025
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

public interface OrderState {
    void processOrder(Order order);
    String getStateName();
}
