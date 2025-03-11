/*
 * @ (#) OperationSystemFactory.java       1.0     07/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package com.demo;
/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 07/03/2025
 * @version:    1.0
 */

public class OperationSystemFactory {
    public OS getInstance(String type) {
        if (type.equalsIgnoreCase("Open")) {
            return new Android();
        } else if (type.equalsIgnoreCase("Close")) {
            return new IOS();
        } else {
            return new Window();
        }
    }
}
