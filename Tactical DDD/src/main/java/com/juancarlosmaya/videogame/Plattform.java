package com.juancarlosmaya.videogame;

import co.com.sofka.domain.generic.Entity;
import com.juancarlosmaya.videogame.values.Name;
import com.juancarlosmaya.videogame.values.PlattformId;

import java.util.Objects;

public class Plattform extends Entity<PlattformId> {
    private Name plattformName;
    public Plattform(PlattformId entityId, Name plattformName) {
        super(entityId);
        this.plattformName = plattformName;
    }
    public void updateName(Name name)
    {
        this.plattformName = Objects.requireNonNull(name);
    }

    public Name getPlattformName() {
        return plattformName;
    }
}
