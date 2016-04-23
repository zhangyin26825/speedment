package com.zhangyin.speedment.speedment.db0.sakila.actor.generated;

import com.speedment.Speedment;
import com.speedment.internal.core.code.AbstractBaseEntity;
import com.zhangyin.speedment.speedment.db0.sakila.actor.Actor;
import com.zhangyin.speedment.speedment.db0.sakila.actor.ActorImpl;
import com.zhangyin.speedment.speedment.db0.sakila.film_actor.FilmActor;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * The generated base implementation representing an entity (for example, a
 * row) in the Table speedment.db0.sakila.actor.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedActorImpl extends AbstractBaseEntity<Actor> implements Actor {
    
    private Short actorId;
    private String firstName;
    private String lastName;
    private Timestamp lastUpdate;
    
    protected GeneratedActorImpl() {
        
    }
    
    @Override
    public Short getActorId() {
        return actorId;
    }
    
    @Override
    public String getFirstName() {
        return firstName;
    }
    
    @Override
    public String getLastName() {
        return lastName;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public final Actor setActorId(Short actorId) {
        this.actorId = actorId;
        return this;
    }
    
    @Override
    public final Actor setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    @Override
    public final Actor setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    
    @Override
    public final Actor setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Stream<FilmActor> findFilmActorsByActorId() {
        return managerOf_(FilmActor.class)
                .stream().filter(FilmActor.ACTOR_ID.equal(this.getActorId()));
    }
    
    @Override
    public Stream<FilmActor> findFilmActors() {
        return findFilmActorsByActorId();
    }
    
    @Override
    public Actor copy() {
        final Actor actor = new ActorImpl() {
            @Override
            protected final Speedment speedment() {
                return GeneratedActorImpl.this.speedment();
            }
        };
        
        setActorId(actor.getActorId());
        setFirstName(actor.getFirstName());
        setLastName(actor.getLastName());
        setLastUpdate(actor.getLastUpdate());
        
        return actor;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("actorId = "+Objects.toString(getActorId()));
        sj.add("firstName = "+Objects.toString(getFirstName()));
        sj.add("lastName = "+Objects.toString(getLastName()));
        sj.add("lastUpdate = "+Objects.toString(getLastUpdate()));
        return "ActorImpl "+sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Actor)) { return false; }
        final Actor thatActor = (Actor)that;
        if (!Objects.equals(this.getActorId(), thatActor.getActorId())) {return false; }
        if (!Objects.equals(this.getFirstName(), thatActor.getFirstName())) {return false; }
        if (!Objects.equals(this.getLastName(), thatActor.getLastName())) {return false; }
        if (!Objects.equals(this.getLastUpdate(), thatActor.getLastUpdate())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(getActorId());
        hash = 31 * hash + Objects.hashCode(getFirstName());
        hash = 31 * hash + Objects.hashCode(getLastName());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
    
    @Override
    public Class<Actor> entityClass() {
        return Actor.class;
    }
}