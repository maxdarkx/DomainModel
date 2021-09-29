package com.juancarlosmaya.console.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.console.Plattform;

public class UpdatedPlattform extends DomainEvent {
    private  final Plattform plattform;
    public UpdatedPlattform(Plattform plattform) {
        super("com.juancarlosmaya.console.plattform");
        this.plattform = plattform;
    }

    public Plattform getPlattform() {
        return plattform;
    }
}
