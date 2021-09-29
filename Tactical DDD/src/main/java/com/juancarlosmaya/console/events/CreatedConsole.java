package com.juancarlosmaya.console.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.console.values.Name;

public class CreatedConsole extends DomainEvent {

    private final Name name;

    public CreatedConsole(Name name) {
        super("com.juancarlosmaya.Console");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
