package com.juancarlosmaya.videogame.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.videogame.Plattform;

public class UpdatedPlattform extends DomainEvent {

    private final Plattform plattform;

    public UpdatedPlattform(Plattform plattform) {

        super("com.juancarlosmaya.videogame.plattform");
        this.plattform = plattform;
    }

    public Plattform getPlattform() {
        return plattform;
    }
}
