package org.kata.store.repository;

import org.kata.store.domain.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository implements IOrderRepository {

    List<Order> db = new ArrayList<>();

    @Override
    public void save(Order order) {
        db.add(order);
    }

    @Override
    public List<Order> findAll() {
        return db;
    }
}
