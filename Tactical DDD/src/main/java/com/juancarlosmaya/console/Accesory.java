package com.juancarlosmaya.console;

import co.com.sofka.domain.generic.Entity;
import com.juancarlosmaya.console.values.AccesoryId;
import com.juancarlosmaya.console.values.AccesoryType;
import com.juancarlosmaya.console.values.Name;

import java.util.Objects;

public class Accesory extends Entity<AccesoryId> {
    private Name name;
    private AccesoryType accesoryType;

    public Accesory(AccesoryId accesoryId, Name name,AccesoryType accesoryType) {
        super(accesoryId);
        this.name = name;
        this.accesoryType=accesoryType;
    }

    public void UpdateType (AccesoryType accesoryType)
    {
        this.accesoryType = Objects.requireNonNull(accesoryType);
    }

    public void UpdateName(Name name)
    {
        this.name = Objects.requireNonNull(name);
    }

    public Name name() {
        return name;
    }

    public AccesoryType accesoryType()
    {
        return accesoryType;
    }
}
