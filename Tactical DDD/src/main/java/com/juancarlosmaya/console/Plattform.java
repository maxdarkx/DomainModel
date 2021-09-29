package com.juancarlosmaya.console;

import co.com.sofka.domain.generic.Entity;
import com.juancarlosmaya.console.values.Name;
import com.juancarlosmaya.console.values.PlattformId;

import java.util.Objects;

public class Plattform  extends Entity<PlattformId> {
    private Name plattformName;
    public Plattform(PlattformId entityId, Name plattformName) {
        super(entityId);
        this.plattformName = plattformName;
    }
    public void UpdateName(Name name)
    {
        this.plattformName = Objects.requireNonNull(name);
    }
}
