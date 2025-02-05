package org.kata.store;

import org.kata.store.service.IOrderService;
import org.kata.store.service.OrderService;

public class AmazonStore implements IStore {
    private final IOrderService service;

    public AmazonStore(IOrderService service) {
        this.service = service;
    }
    public AmazonStore() {
        this.service = new OrderService();
    }

    @Override
    public int getNumberOfOrders() {
        return service.findAll().size();
    }

    @Override
    public void createOrder(long l, double v) {
        service.create(l, v);
    }
}
