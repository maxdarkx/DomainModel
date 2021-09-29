package com.juancarlosmaya.sale;

import co.com.sofka.domain.generic.AggregateEvent;
import com.juancarlosmaya.sale.values.SaleId;

public class Sale extends AggregateEvent<SaleId> {

    public Sale(SaleId entityId) {
        super(entityId);
    }
}
