package com.juancarlosmaya.sale;

import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedCustomer extends DomainEvent {
    private final Customer customer;
    public UpdatedCustomer(Customer customer) {
        super("com.juancarlosmaya.sale.customer");
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
