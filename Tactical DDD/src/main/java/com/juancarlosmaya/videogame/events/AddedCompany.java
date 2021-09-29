package com.juancarlosmaya.videogame.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.videogame.values.CompanyId;
import com.juancarlosmaya.videogame.values.Name;

public class AddedCompany extends DomainEvent {

    private final CompanyId companyId;
    private final Name companyName;

    public AddedCompany(CompanyId entityId, Name companyName) {
        super("com.juancarlosmaya.videogame.company");
        this.companyId = entityId;
        this.companyName = companyName;

    }

    public CompanyId getCompanyId() {
        return companyId;
    }

    public Name getCompanyName() {
        return companyName;
    }
}
