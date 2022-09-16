package me.hellonayeon.orderservice.service;

import me.hellonayeon.orderservice.dto.OrderDto;
import me.hellonayeon.orderservice.jpa.OrderEntity;

public interface OrderService {

    OrderDto createOrder(OrderDto orderDetails);
    OrderDto getOrderByOrderId(String orderId);
    Iterable<OrderEntity> getOrderByUserId(String userId);
    Iterable<OrderEntity> getAllOrders();

}
