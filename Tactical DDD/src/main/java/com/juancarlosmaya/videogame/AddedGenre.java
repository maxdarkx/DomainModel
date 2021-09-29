package com.juancarlosmaya.videogame;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.videogame.values.GenreId;
import com.juancarlosmaya.videogame.values.Name;

public class AddedGenre extends DomainEvent {
    private final GenreId genreId;
    private final Name genreName;

    public AddedGenre(GenreId genreId, Name genreName) {
        super("com.juancarlosmaya.videogame.genre");
        this.genreId = genreId;
        this.genreName = genreName;
    }

    public GenreId getGenreId() {
        return genreId;
    }

    public Name getGenreName() {
        return genreName;
    }
}
