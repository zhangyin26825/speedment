package com.zhangyin.speedment.speedment.db0.sakila.film.generated;

import com.speedment.Speedment;
import com.speedment.exception.SpeedmentException;
import com.speedment.field.FieldIdentifier;
import com.speedment.field.trait.FieldTrait;
import com.speedment.internal.core.manager.sql.AbstractSqlManager;
import com.speedment.util.tuple.Tuple1;
import com.speedment.util.tuple.Tuples;
import com.zhangyin.speedment.speedment.db0.sakila.film.Film;
import com.zhangyin.speedment.speedment.db0.sakila.film.FilmImpl;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.stream.Stream;
import javax.annotation.Generated;
import static com.speedment.internal.util.sql.ResultSetUtil.*;

/**
 * The generated base manager implementation representing an entity (for
 * example, a row) in the Table speedment.db0.sakila.film.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedFilmManagerImpl extends AbstractSqlManager<Film> implements GeneratedFilmManager {
    
    private final static Tuple1<Class<Short>> PRIMARY_KEY_CLASSES = Tuples.of(Short.class);
    
    protected GeneratedFilmManagerImpl(Speedment speedment) {
        super(speedment);
        setEntityMapper(this::newEntityFrom);
    }
    
    protected Film newEntityFrom(ResultSet resultSet) throws SpeedmentException, SQLException {
        final Film entity = newEmptyEntity();
        try {
            entity.setFilmId(resultSet.getShort(1));
            entity.setTitle(resultSet.getString(2));
            entity.setDescription(resultSet.getString(3));
            entity.setReleaseYear(getInt(resultSet, 4));
            entity.setLanguageId(resultSet.getByte(5));
            entity.setOriginalLanguageId(getByte(resultSet, 6));
            entity.setRentalDuration(resultSet.getByte(7));
            entity.setRentalRate(resultSet.getBigDecimal(8));
            entity.setLength(getShort(resultSet, 9));
            entity.setReplacementCost(resultSet.getBigDecimal(10));
            entity.setRating(resultSet.getString(11));
            entity.setSpecialFeatures(resultSet.getString(12));
            entity.setLastUpdate(resultSet.getTimestamp(13));
        }
        catch (SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    @Override
    public Film newEmptyEntity() {
        return new FilmImpl() {
            @Override
            protected Speedment speedment() {
                return speedment;
            }
        };
    }
    
    @Override
    public Object get(Film entity, FieldIdentifier<Film> identifier) {
        switch ((Film.Identifier) identifier) {
            case FILM_ID : return entity.getFilmId();
            case TITLE : return entity.getTitle();
            case DESCRIPTION : return entity.getDescription().orElse(null);
            case RELEASE_YEAR : return entity.getReleaseYear().orElse(null);
            case LANGUAGE_ID : return entity.getLanguageId();
            case ORIGINAL_LANGUAGE_ID : return entity.getOriginalLanguageId().orElse(null);
            case RENTAL_DURATION : return entity.getRentalDuration();
            case RENTAL_RATE : return entity.getRentalRate();
            case LENGTH : return entity.getLength().orElse(null);
            case REPLACEMENT_COST : return entity.getReplacementCost();
            case RATING : return entity.getRating().orElse(null);
            case SPECIAL_FEATURES : return entity.getSpecialFeatures().orElse(null);
            case LAST_UPDATE : return entity.getLastUpdate();
            default : throw new IllegalArgumentException("Unknown identifier '" + identifier + "'.");
        }
    }
    
    @Override
    public void set(Film entity, FieldIdentifier<Film> identifier, Object value) {
        switch ((Film.Identifier) identifier) {
            case FILM_ID : entity.setFilmId((Short) value); break;
            case TITLE : entity.setTitle((String) value); break;
            case DESCRIPTION : entity.setDescription((String) value); break;
            case RELEASE_YEAR : entity.setReleaseYear((Integer) value); break;
            case LANGUAGE_ID : entity.setLanguageId((Byte) value); break;
            case ORIGINAL_LANGUAGE_ID : entity.setOriginalLanguageId((Byte) value); break;
            case RENTAL_DURATION : entity.setRentalDuration((Byte) value); break;
            case RENTAL_RATE : entity.setRentalRate((BigDecimal) value); break;
            case LENGTH : entity.setLength((Short) value); break;
            case REPLACEMENT_COST : entity.setReplacementCost((BigDecimal) value); break;
            case RATING : entity.setRating((String) value); break;
            case SPECIAL_FEATURES : entity.setSpecialFeatures((String) value); break;
            case LAST_UPDATE : entity.setLastUpdate((Timestamp) value); break;
            default : throw new IllegalArgumentException("Unknown identifier '" + identifier + "'.");
        }
    }
    
    @Override
    public Stream<FieldTrait> fields() {
        return Stream.of(
            Film.FILM_ID,
            Film.TITLE,
            Film.DESCRIPTION,
            Film.RELEASE_YEAR,
            Film.LANGUAGE_ID,
            Film.ORIGINAL_LANGUAGE_ID,
            Film.RENTAL_DURATION,
            Film.RENTAL_RATE,
            Film.LENGTH,
            Film.REPLACEMENT_COST,
            Film.RATING,
            Film.SPECIAL_FEATURES,
            Film.LAST_UPDATE
        );
    }
    
    @Override
    public Stream<FieldTrait> primaryKeyFields() {
        return Stream.of(
            Film.FILM_ID
        );
    }
    
    @Override
    public Tuple1<Class<Short>> getPrimaryKeyClasses() {
        return PRIMARY_KEY_CLASSES;
    }
}