package com.juancarlosmaya.videogame.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.videogame.values.PlattformId;
import com.juancarlosmaya.videogame.values.Name;

public class AddedPlattform extends DomainEvent {

    private final Name plattformName;
    private final PlattformId plattformId;

    public AddedPlattform(PlattformId entityId, Name plattformName) {
        super("com.juancarlosmaya.videogame.plattform");
        this.plattformId = entityId;
        this.plattformName = plattformName;
    }

    public Name getPlattformName() {
        return plattformName;
    }

    public PlattformId getPlattformId() {
        return plattformId;
    }
}
