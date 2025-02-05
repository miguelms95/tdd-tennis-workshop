package org.kata.store.repository;

import org.kata.store.domain.Order;

import java.util.List;

public interface IOrderRepository {
    void save(Order order);
    List<Order> findAll();
}
