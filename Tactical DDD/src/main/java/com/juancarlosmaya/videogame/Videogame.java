package com.juancarlosmaya.videogame;

import co.com.sofka.domain.generic.AggregateEvent;
import com.juancarlosmaya.videogame.values.Language;
import com.juancarlosmaya.videogame.values.Name;
import com.juancarlosmaya.videogame.values.VideogameId;

import java.util.Set;

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
    }
}
