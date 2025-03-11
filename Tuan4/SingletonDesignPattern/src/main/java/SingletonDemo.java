/*
 * @ (#) SingletonDemo.java       1.0     08/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 08/03/2025
 * @version:    1.0
 */

public class SingletonDemo {
    public static void main(String[] args) {
        // Lấy thể hiện duy nhất của kết nối database
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        System.out.println(db1.getConnection());

        // Thử lấy thêm một kết nối nữa
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println(db2.getConnection());

        // Kiểm tra xem cả hai có trỏ đến cùng một đối tượng không
        System.out.println(db1 == db2); // Output: true
    }
}

