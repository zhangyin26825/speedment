package com.zhangyin.speedment.speedment.db0.sakila.film_actor.generated;

import com.speedment.Speedment;
import com.speedment.exception.SpeedmentException;
import com.speedment.internal.core.code.AbstractBaseEntity;
import com.zhangyin.speedment.speedment.db0.sakila.actor.Actor;
import com.zhangyin.speedment.speedment.db0.sakila.film.Film;
import com.zhangyin.speedment.speedment.db0.sakila.film_actor.FilmActor;
import com.zhangyin.speedment.speedment.db0.sakila.film_actor.FilmActorImpl;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;
import javax.annotation.Generated;

/**
 * The generated base implementation representing an entity (for example, a
 * row) in the Table speedment.db0.sakila.film_actor.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedFilmActorImpl extends AbstractBaseEntity<FilmActor> implements FilmActor {
    
    private Short actorId;
    private Short filmId;
    private Timestamp lastUpdate;
    
    protected GeneratedFilmActorImpl() {
        
    }
    
    @Override
    public Actor findActorId() {
        return managerOf_(Actor.class).findAny(Actor.ACTOR_ID, getActorId())
            .orElseThrow(() -> new SpeedmentException(
                "Foreign key constraint error. Actor is set to " + getActorId()
                ));
            
    }
    
    @Override
    public Film findFilmId() {
        return managerOf_(Film.class).findAny(Film.FILM_ID, getFilmId())
            .orElseThrow(() -> new SpeedmentException(
                "Foreign key constraint error. Film is set to " + getFilmId()
                ));
            
    }
    
    @Override
    public Short getActorId() {
        return actorId;
    }
    
    @Override
    public Short getFilmId() {
        return filmId;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public final FilmActor setActorId(Short actorId) {
        this.actorId = actorId;
        return this;
    }
    
    @Override
    public final FilmActor setFilmId(Short filmId) {
        this.filmId = filmId;
        return this;
    }
    
    @Override
    public final FilmActor setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public FilmActor copy() {
        final FilmActor filmActor = new FilmActorImpl() {
            @Override
            protected final Speedment speedment() {
                return GeneratedFilmActorImpl.this.speedment();
            }
        };
        
        setActorId(filmActor.getActorId());
        setFilmId(filmActor.getFilmId());
        setLastUpdate(filmActor.getLastUpdate());
        
        return filmActor;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("actorId = "+Objects.toString(getActorId()));
        sj.add("filmId = "+Objects.toString(getFilmId()));
        sj.add("lastUpdate = "+Objects.toString(getLastUpdate()));
        return "FilmActorImpl "+sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof FilmActor)) { return false; }
        final FilmActor thatFilmActor = (FilmActor)that;
        if (!Objects.equals(this.getActorId(), thatFilmActor.getActorId())) {return false; }
        if (!Objects.equals(this.getFilmId(), thatFilmActor.getFilmId())) {return false; }
        if (!Objects.equals(this.getLastUpdate(), thatFilmActor.getLastUpdate())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(getActorId());
        hash = 31 * hash + Objects.hashCode(getFilmId());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
    
    @Override
    public Class<FilmActor> entityClass() {
        return FilmActor.class;
    }
}