package com.juancarlosmaya.Sale;

import co.com.sofka.domain.generic.AggregateEvent;
import com.juancarlosmaya.Sale.Values.SaleId;

public class Sale extends AggregateEvent<SaleId> {

    public Sale(SaleId entityId) {
        super(entityId);
    }
}
