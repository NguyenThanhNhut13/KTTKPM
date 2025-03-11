/*
 * @ (#) FactoryMethodDemo.java       1.0     08/03/2025
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

public class FactoryMethodDemo {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive(); // Output: Lái xe hơi!

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.drive(); // Output: Lái xe máy!
    }
}
