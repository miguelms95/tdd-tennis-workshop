package org.kata.store.service;

import org.kata.store.domain.Order;
import org.kata.store.repository.IOrderRepository;
import org.kata.store.repository.OrderRepository;

import java.util.List;

public class OrderService implements IOrderService {
    IOrderRepository repository = new OrderRepository();

    @Override
    public void create(Long id, Double amount) {
        repository.save(new Order(id, amount));
    }

    @Override
    public List<Order> findAll() {
        return repository.findAll();
    }
}
