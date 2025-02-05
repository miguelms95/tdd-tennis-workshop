package org.kata.store.domain;

public class Order {
    private Long id;
    private Double price;

    public Order(Long id, Double price) {
        this.id = id;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

}
