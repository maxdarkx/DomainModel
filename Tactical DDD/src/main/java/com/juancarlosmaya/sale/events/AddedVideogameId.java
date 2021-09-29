package com.juancarlosmaya.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.videogame.values.VideogameId;

public class AddedVideogameId extends DomainEvent {
    private final VideogameId videogameId;
    public AddedVideogameId(VideogameId videogameId) {
        super("com.juancarlosmaya.videogame.values.videogameid");
        this.videogameId = videogameId;
    }

    public VideogameId getVideogameId() {
        return videogameId;
    }
}
