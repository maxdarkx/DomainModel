package com.juancarlosmaya.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.sale.Salesman;

public class UpdatedSalesman extends DomainEvent {
    private final Salesman salesman;
    public UpdatedSalesman(Salesman salesman) {
        super("com.juancarlosmaya.sale.salesman");
        this.salesman = salesman;
    }

    public Salesman getSalesman() {
        return salesman;
    }
}
