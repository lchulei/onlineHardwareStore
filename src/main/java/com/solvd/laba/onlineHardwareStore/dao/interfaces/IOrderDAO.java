package com.solvd.laba.onlineHardwareStore.dao.interfaces;

import com.solvd.laba.onlineHardwareStore.model.Order;

import java.util.List;

public interface IOrderDAO {

    List<Order> getAllOrders();

    void deleteOrder(int id);

    void insertIntoOrder(Order order);

    void updateOrder(Order order);
}
