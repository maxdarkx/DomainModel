package com.juancarlosmaya.videogame.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.videogame.Company;

public class UpdatedCompany extends DomainEvent {
    private final Company company;

    public UpdatedCompany(Company company) {
        super("com.juancarlosmaya.videogame.company");
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }
}
