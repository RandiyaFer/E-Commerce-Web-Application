package org.example.service;

import org.example.dto.order;
import org.example.entity.orderEntity;

import java.util.List;

public interface orderService {
    void addOrder(order Order);
    List<orderEntity> getOrders();
    boolean deleteOrder(Long id);
    order getOrderById(Long id);
}
