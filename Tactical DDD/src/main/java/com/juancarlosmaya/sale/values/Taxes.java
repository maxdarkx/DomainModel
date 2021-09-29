package com.juancarlosmaya.sale.values;

import co.com.sofka.domain.generic.ValueObject;

public class Taxes implements ValueObject<Integer> {
    @Override
    public Integer value() {
        return 0;
    }
}
