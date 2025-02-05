package org.kata.store.service;

import org.kata.store.domain.Order;

import java.util.List;

public interface IOrderService {
    void create(Long id, Double amount);

    List<Order> findAll();
}
