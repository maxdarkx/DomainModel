package com.juancarlosmaya.sale;


import co.com.sofka.domain.generic.Entity;
import com.juancarlosmaya.sale.values.CustomerId;
import com.juancarlosmaya.sale.values.Email;
import com.juancarlosmaya.sale.values.Name;

import java.util.Objects;

public class Customer  extends Entity <CustomerId> {
    private Name customerName;
    private Email customerEmail;


    public Customer(CustomerId entityId, Name customerName, Email email) {
        super(entityId);
        this.customerName = customerName;
        this.customerEmail = email;
    }

    public void updateName(Name customerName)
    {
        this.customerName = Objects.requireNonNull(customerName);
    }

    public void updateEmail(Email customerEmail)
    {
        this.customerEmail = Objects.requireNonNull(customerEmail);

    }

    public Name getCustomerName() {
        return customerName;
    }

    public Email getCustomerEmail() {
        return customerEmail;
    }
}
