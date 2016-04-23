package com.zhangyin.speedment.speedment.db0.sakila.film_text.generated;

import com.speedment.Speedment;
import com.speedment.exception.SpeedmentException;
import com.speedment.field.FieldIdentifier;
import com.speedment.field.trait.FieldTrait;
import com.speedment.internal.core.manager.sql.AbstractSqlManager;
import com.speedment.util.tuple.Tuple1;
import com.speedment.util.tuple.Tuples;
import com.zhangyin.speedment.speedment.db0.sakila.film_text.FilmText;
import com.zhangyin.speedment.speedment.db0.sakila.film_text.FilmTextImpl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.stream.Stream;
import javax.annotation.Generated;
import static com.speedment.internal.util.sql.ResultSetUtil.*;

/**
 * The generated base manager implementation representing an entity (for
 * example, a row) in the Table speedment.db0.sakila.film_text.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedFilmTextManagerImpl extends AbstractSqlManager<FilmText> implements GeneratedFilmTextManager {
    
    private final static Tuple1<Class<Short>> PRIMARY_KEY_CLASSES = Tuples.of(Short.class);
    
    protected GeneratedFilmTextManagerImpl(Speedment speedment) {
        super(speedment);
        setEntityMapper(this::newEntityFrom);
    }
    
    protected FilmText newEntityFrom(ResultSet resultSet) throws SpeedmentException, SQLException {
        final FilmText entity = newEmptyEntity();
        try {
            entity.setFilmId(resultSet.getShort(1));
            entity.setTitle(resultSet.getString(2));
            entity.setDescription(resultSet.getString(3));
        }
        catch (SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    @Override
    public FilmText newEmptyEntity() {
        return new FilmTextImpl() {
            @Override
            protected Speedment speedment() {
                return speedment;
            }
        };
    }
    
    @Override
    public Object get(FilmText entity, FieldIdentifier<FilmText> identifier) {
        switch ((FilmText.Identifier) identifier) {
            case FILM_ID : return entity.getFilmId();
            case TITLE : return entity.getTitle();
            case DESCRIPTION : return entity.getDescription().orElse(null);
            default : throw new IllegalArgumentException("Unknown identifier '" + identifier + "'.");
        }
    }
    
    @Override
    public void set(FilmText entity, FieldIdentifier<FilmText> identifier, Object value) {
        switch ((FilmText.Identifier) identifier) {
            case FILM_ID : entity.setFilmId((Short) value); break;
            case TITLE : entity.setTitle((String) value); break;
            case DESCRIPTION : entity.setDescription((String) value); break;
            default : throw new IllegalArgumentException("Unknown identifier '" + identifier + "'.");
        }
    }
    
    @Override
    public Stream<FieldTrait> fields() {
        return Stream.of(
            FilmText.FILM_ID,
            FilmText.TITLE,
            FilmText.DESCRIPTION
        );
    }
    
    @Override
    public Stream<FieldTrait> primaryKeyFields() {
        return Stream.of(
            FilmText.FILM_ID
        );
    }
    
    @Override
    public Tuple1<Class<Short>> getPrimaryKeyClasses() {
        return PRIMARY_KEY_CLASSES;
    }
}