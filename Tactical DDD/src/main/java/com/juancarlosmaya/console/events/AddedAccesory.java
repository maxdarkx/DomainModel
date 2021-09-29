package com.juancarlosmaya.console.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.console.values.AccesoryId;
import com.juancarlosmaya.console.values.AccesoryType;
import com.juancarlosmaya.console.values.Name;

public class AddedAccesory extends DomainEvent {
    private final AccesoryId accesoryId;
    private final Name accesoryName;
    private final AccesoryType accesoryType;
    public AddedAccesory(AccesoryId accesoryId, Name name, AccesoryType accesoryType) {
        super("com.juancarlosmaya.console.accesory");
        this.accesoryId = accesoryId;
        this.accesoryName = name;
        this.accesoryType = accesoryType;
    }

    public AccesoryId getAccesoryId() {
        return accesoryId;
    }

    public Name getAccesoryName() {
        return accesoryName;
    }

    public AccesoryType getAccesoryType() {
        return accesoryType;
    }
}

