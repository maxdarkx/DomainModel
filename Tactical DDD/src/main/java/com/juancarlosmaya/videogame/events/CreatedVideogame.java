package com.juancarlosmaya.videogame.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.videogame.values.Language;
import com.juancarlosmaya.videogame.values.Name;
import com.juancarlosmaya.videogame.values.VideogameId;

public class CreatedVideogame extends DomainEvent {
    private final VideogameId videogameId;
    private final Language language;
    private final Name videogameName;

    public CreatedVideogame(VideogameId entityId, Language language, Name videogameName) {
        super("com.juancarlosmaya.videogame");
        this.videogameId = entityId;
        this.language = language;
        this.videogameName = videogameName;
    }

    public VideogameId getVideogameId() {
        return videogameId;
    }

    public Language getLanguage() {
        return language;
    }

    public Name getVideogameName() {
        return videogameName;
    }
}
