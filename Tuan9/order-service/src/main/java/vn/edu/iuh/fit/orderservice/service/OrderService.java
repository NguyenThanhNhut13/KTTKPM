/*
 * @ (#) OrderService.java       1.0     12/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.orderservice.service;
/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 12/04/2025
 * @version:    1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.orderservice.client.ProductServiceClient;
import vn.edu.iuh.fit.orderservice.entity.Order;
import vn.edu.iuh.fit.orderservice.entity.Product;
import vn.edu.iuh.fit.orderservice.repositoty.OrderRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductServiceClient productServiceClient;

    public Order createOrder(Order order) throws Exception {
        try {
            // Kiểm tra tồn tại của khách hàng
//            Customer customer = customerServiceClient.getCustomerById(order.getCustomerId()).getBody();

            // Kiểm tra tồn tại của sản phẩm
            Order finalOrder = order;
            order.getItems().forEach(orderDetail -> {
                orderDetail.setOrder(finalOrder);
                Product product = productServiceClient.getProductById(orderDetail.getProductId()).getBody();
                // Kiểm tra tồn kho
                if(product.getStockQuantity() < orderDetail.getQuantity()) {
                    throw new RuntimeException("Sản phẩm không đủ số lượng trong kho");
                }
            });

            order.setStatus("PENDING");
            order.setOrderDate(LocalDateTime.now());

            order = orderRepository.save(order);

            // Cập nhật số lượng sản phẩm trong kho
            order.getItems().forEach(orderDetail -> {
                productServiceClient.decrementProduct(orderDetail.getProductId(), orderDetail.getQuantity());
            });

            return order;
        } catch (Exception e) {
            throw new Exception("Lỗi khi tạo đơn hàng: " + e.getMessage());
        }
    }

    public void deleteOrder(Long orderId) {
        // Check if the order exists
        orderRepository.findById(orderId).ifPresent(order -> orderRepository.delete(order));
    }

    public Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
