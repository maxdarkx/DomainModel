package com.juancarlosmaya.console;

import co.com.sofka.domain.generic.AggregateEvent;
import com.juancarlosmaya.console.events.AddedAccesory;
import com.juancarlosmaya.console.events.AddedPlattform;
import com.juancarlosmaya.console.events.CreatedConsole;
import com.juancarlosmaya.console.events.UpdatedAccesory;
import com.juancarlosmaya.console.values.*;


import java.util.Objects;

public class Console extends AggregateEvent<ConsoleId>{

    protected ConsoleId entityId;
    protected Name name;
    protected Accesory accesory;
    protected Plattform plattform;

    public Console(ConsoleId entityId, Name name) {
        super(entityId);
        this.entityId = entityId;
        this.name = name;
        appendChange(new CreatedConsole(entityId,name)).apply();
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

}

