package org.kata.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kata.store.IStore;
import org.kata.store.AmazonStore;
import org.kata.store.service.OrderService;

import static org.mockito.Mockito.*;

public class StoreTest {

    @Test
    void shouldBeEmptyOnStart() {
        IStore store = new AmazonStore();
        int result = store.getNumberOfOrders();
        Assertions.assertEquals(0, result);
    }

    @Test
    void shouldCreateOrder() {
        IStore store = new AmazonStore();

        store.createOrder(1L, 50.00);

        Assertions.assertEquals(1, store.getNumberOfOrders());
    }

    @Test
    void shouldCreate3Order() {
        IStore store = new AmazonStore();

        store.createOrder(1L, 50.00);
        store.createOrder(2L, 50.00);
        store.createOrder(3L, 50.00);

        Assertions.assertEquals(3, store.getNumberOfOrders());
    }


    @Test
    void shouldCallRepositoryOnCreate3OrderMock() {
        OrderService orderService = mock(OrderService.class);
        IStore store = new AmazonStore(orderService);

        store.createOrder(1L, 50.00);
        store.createOrder(2L, 50.00);
        store.createOrder(3L, 50.00);
        verify(orderService).create(1L, 50.00); // verifico que se llamó al order-service
        verify(orderService).create(2L, 50.00);
        verify(orderService).create(3L, 50.00);
        Assertions.assertEquals(0, store.getNumberOfOrders()); // getNumberOfOrders == 0, porque el mock altera el comportamiento
    }

    @Test
    void shouldCallRepositoryOnCreate3OrderSpy() {
        OrderService orderService = spy(OrderService.class);
        IStore store = new AmazonStore(orderService);

        store.createOrder(1L, 50.00);
        store.createOrder(2L, 50.00);
        store.createOrder(3L, 50.00);
        verify(orderService).create(1L, 50.00); // verifico que se llamó al order-service
        verify(orderService).create(2L, 50.00);
        verify(orderService).create(3L, 50.00);
        Assertions.assertEquals(3, store.getNumberOfOrders()); // el funcionamiento es real
    }

}
