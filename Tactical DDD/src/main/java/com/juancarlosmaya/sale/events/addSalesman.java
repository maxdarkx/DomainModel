package com.juancarlosmaya.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.sale.values.Email;
import com.juancarlosmaya.sale.values.Name;
import com.juancarlosmaya.sale.values.SalesmanId;

public class addSalesman extends DomainEvent {

    private final SalesmanId salesmanId;
    private final Name salesmanName;
    private final Email salesmanEmail;
    public addSalesman(SalesmanId salesmanId, Name salesmanName, Email salesmanEmail) {
        super("com.juancarlosmaya.sale.salesman");
        this.salesmanId = salesmanId;
        this.salesmanName = salesmanName;
        this.salesmanEmail = salesmanEmail;
    }

    public SalesmanId getSalesmanId() {
        return salesmanId;
    }

    public Name getSalesmanName() {
        return salesmanName;
    }

    public Email getSalesmanEmail() {
        return salesmanEmail;
    }
}
