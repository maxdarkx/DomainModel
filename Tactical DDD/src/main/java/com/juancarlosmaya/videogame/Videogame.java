package com.juancarlosmaya.videogame;

import co.com.sofka.domain.generic.AggregateEvent;
import com.juancarlosmaya.videogame.events.*;
import com.juancarlosmaya.videogame.values.*;

import java.util.Objects;

public class Videogame extends AggregateEvent<VideogameId> {
    protected Language language;
    protected Name videogameName;
    protected Plattform plattform;
    protected Company company;
    protected Genre genre;

    public Videogame(VideogameId entityId, Language language, Name videogameName) {
        super(entityId);
        this.language = language;
        this.videogameName = videogameName;
        appendChange(new CreatedVideogame(entityId, language, videogameName)).apply();
    }
    public void addPlattform(PlattformId entityId, Name plattformName)
    {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(plattformName);
        appendChange(new AddedPlattform(entityId, plattformName)).apply();
    }
    public void updatePlattform(Plattform plattform)
    {
        Objects.requireNonNull(plattform);
        appendChange(new UpdatedPlattform(plattform)).apply();
    }

    public void addCompany(CompanyId entityId, Name companyName)
    {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(companyName);
        appendChange(new AddedCompany(entityId,companyName)).apply();
    }

    public void updateCompany(Company company)
    {
        Objects.requireNonNull(company);
        appendChange(new UpdatedCompany(company)).apply();
    }

    public void addGenre(GenreId genreId, Name genreName)
    {
        Objects.requireNonNull(genreId);
        Objects.requireNonNull(genreName);
        appendChange(new AddedGenre(genreId,genreName)).apply();
    }
    public void updateGenre(Genre genre)
    {
        Objects.requireNonNull(genre);
        appendChange(new UpdatedGenre(genre)).apply();
    }
}
