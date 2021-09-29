package com.juancarlosmaya.console.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.console.Accesory;

public class UpdatedAccesory extends DomainEvent {
    private final Accesory accesory;
    public UpdatedAccesory(Accesory accesory) {
        super("com.juancarlosmaya.console.accesory");
        this.accesory = accesory;
    }

    public Accesory getAccesory() {
        return accesory;
    }
}
