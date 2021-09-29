package com.juancarlosmaya.videogame;

import co.com.sofka.domain.generic.Entity;
import com.juancarlosmaya.videogame.values.CompanyId;
import com.juancarlosmaya.videogame.values.Name;

import java.util.Objects;

public class Company extends Entity<CompanyId> {
    private Name companyName;

    public Company(CompanyId entityId, Name companyName) {
        super(entityId);
        this.companyName = companyName;
    }

    public void updateName(Name companyName)
    {
        this.companyName = Objects.requireNonNull(companyName);
    }
}
