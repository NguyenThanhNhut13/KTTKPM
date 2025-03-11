/*
 * @ (#) DatabaseConnection.java       1.0     08/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 08/03/2025
 * @version:    1.0
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private final Connection connection;
    private final String URL = "jdbc:mariadb://localhost:3306/singleton";
    private final String USER = "root";
    private final String PASSWORD = "sapassword";

    // Constructor private để ngăn tạo đối tượng từ bên ngoài
    private DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Kết nối cơ sở dữ liệu thành công!");
        } catch (SQLException e) {
            throw new RuntimeException("Lỗi khi kết nối cơ sở dữ liệu!", e);
        }
    }

    // Phương thức public để lấy thể hiện duy nhất của lớp
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) { // Đảm bảo thread-safe
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    // Phương thức lấy Connection để sử dụng trong ứng dụng
    public Connection getConnection() {
        return connection;
    }
}
