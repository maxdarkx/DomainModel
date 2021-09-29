package com.juancarlosmaya.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.sale.values.CustomerId;
import com.juancarlosmaya.sale.values.Email;
import com.juancarlosmaya.sale.values.Name;

public class CreatedCustomer extends DomainEvent {
    private final CustomerId customerId;
    private final Name customerName;
    private final Email customerEmail;

    public CreatedCustomer(CustomerId customerId, Name customerName, Email customerEmail) {
        super("com.juancarlosmaya.sale.customer");
        this.customerEmail = customerEmail;
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public Name getCustomerName() {
        return customerName;
    }

    public Email getCustomerEmail() {
        return customerEmail;
    }
}
