/*
 * @ (#) CarFactory.java       1.0     08/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package demo;
/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 08/03/2025
 * @version:    1.0
 */

class CarFactory extends VehicleFactory {
    public Vehicle createVehicle() {
        return new Car();
    }
}
