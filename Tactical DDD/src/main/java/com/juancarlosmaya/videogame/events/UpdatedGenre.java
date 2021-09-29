package com.juancarlosmaya.videogame.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.videogame.Genre;

public class UpdatedGenre extends DomainEvent {
    private final Genre genre;
    public UpdatedGenre(Genre genre) {
        super("com.juancarlosmaya.videogame.genre");
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }
}
