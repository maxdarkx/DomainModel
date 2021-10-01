package com.juancarlosmaya.console;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.console.events.*;
import com.juancarlosmaya.console.values.*;


import java.util.List;
import java.util.Objects;

public class Console extends AggregateEvent<ConsoleId>{

    protected ConsoleId entityId;
    protected Name name;
    protected Accesory accesory;
    protected Plattform plattform;

    public Console(ConsoleId entityId, Name name) {
        super(entityId);
        this.entityId = entityId;
        this.setName(name);
        appendChange(new CreatedConsole(entityId,name)).apply();
    }

    private Console (ConsoleId consoleId)
    {
        super(consoleId);
        //subscribe(new ConsoleChange(this));
    }
    public static Console from(ConsoleId consoleId, List<DomainEvent> events)
    {
        var console = new Console(consoleId);
        events.forEach(console::applyEvent);
        return console;
    }

    public void addAccesory(AccesoryId accesoryId, Name name, AccesoryType accesoryType)
    {
        Objects.requireNonNull(accesoryId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(accesoryType);
        appendChange(new AddedAccesory(accesoryId,name, accesoryType)).apply();
    }

    public void addPlattform(PlattformId entityId, Name name)
    {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        appendChange(new AddedPlattform(entityId,name)).apply();
    }

    public void updatePlattform(Plattform plattform)
    {
        Objects.requireNonNull(plattform);
        appendChange(new UpdatedPlattform(plattform)).apply();
    }

    public void updateAccesory(Accesory accesory)
    {
        Objects.requireNonNull(accesory);
        appendChange(new UpdatedAccesory(accesory)).apply();
    }

    public Name name() {
        return name;
    }

    public Accesory accesory() {
        return accesory;
    }

    public Plattform plattform() {
        return plattform;
    }





}

