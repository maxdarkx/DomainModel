package com.juancarlosmaya.console.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.console.values.Name;
import com.juancarlosmaya.console.values.PlattformId;

public class AddedPlattform extends DomainEvent {
    private final PlattformId plattformId;
    private final Name plattformName;

    public AddedPlattform(PlattformId entityId, Name name) {
        super("com.juancarlosmaya.console.plattform");
        this.plattformId = entityId;
        this.plattformName = name;
    }

    public PlattformId getPlattformId() {
        return plattformId;
    }

    public Name getPlattformName() {
        return plattformName;
    }
}
