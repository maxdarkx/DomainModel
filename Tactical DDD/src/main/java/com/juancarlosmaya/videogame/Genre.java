package com.juancarlosmaya.videogame;

import co.com.sofka.domain.generic.Entity;
import com.juancarlosmaya.videogame.values.GenreId;
import com.juancarlosmaya.videogame.values.Name;

import java.util.Objects;

public class Genre extends Entity<GenreId> {
    private Name name;

    public Genre(GenreId entityId, Name genreName) {
        super(entityId);
        this.name = genreName;
    }

    public void updateName(Name genreName){
        this.name =Objects.requireNonNull(genreName);
    }
}
