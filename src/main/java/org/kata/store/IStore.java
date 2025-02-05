package org.kata.store;

public interface IStore {

    int getNumberOfOrders();

    void createOrder(long l, double v);
}
