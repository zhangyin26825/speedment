package com.zhangyin.speedment.speedment.db0.sakila.city.generated;

import com.speedment.Speedment;
import com.speedment.exception.SpeedmentException;
import com.speedment.field.FieldIdentifier;
import com.speedment.field.trait.FieldTrait;
import com.speedment.internal.core.manager.sql.AbstractSqlManager;
import com.speedment.util.tuple.Tuple1;
import com.speedment.util.tuple.Tuples;
import com.zhangyin.speedment.speedment.db0.sakila.city.City;
import com.zhangyin.speedment.speedment.db0.sakila.city.CityImpl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.stream.Stream;
import javax.annotation.Generated;
import static com.speedment.internal.util.sql.ResultSetUtil.*;

/**
 * The generated base manager implementation representing an entity (for
 * example, a row) in the Table speedment.db0.sakila.city.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedCityManagerImpl extends AbstractSqlManager<City> implements GeneratedCityManager {
    
    private final static Tuple1<Class<Short>> PRIMARY_KEY_CLASSES = Tuples.of(Short.class);
    
    protected GeneratedCityManagerImpl(Speedment speedment) {
        super(speedment);
        setEntityMapper(this::newEntityFrom);
    }
    
    protected City newEntityFrom(ResultSet resultSet) throws SpeedmentException, SQLException {
        final City entity = newEmptyEntity();
        try {
            entity.setCityId(resultSet.getShort(1));
            entity.setCity(resultSet.getString(2));
            entity.setCountryId(resultSet.getShort(3));
            entity.setLastUpdate(resultSet.getTimestamp(4));
        }
        catch (SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    @Override
    public City newEmptyEntity() {
        return new CityImpl() {
            @Override
            protected Speedment speedment() {
                return speedment;
            }
        };
    }
    
    @Override
    public Object get(City entity, FieldIdentifier<City> identifier) {
        switch ((City.Identifier) identifier) {
            case CITY_ID : return entity.getCityId();
            case CITY : return entity.getCity();
            case COUNTRY_ID : return entity.getCountryId();
            case LAST_UPDATE : return entity.getLastUpdate();
            default : throw new IllegalArgumentException("Unknown identifier '" + identifier + "'.");
        }
    }
    
    @Override
    public void set(City entity, FieldIdentifier<City> identifier, Object value) {
        switch ((City.Identifier) identifier) {
            case CITY_ID : entity.setCityId((Short) value); break;
            case CITY : entity.setCity((String) value); break;
            case COUNTRY_ID : entity.setCountryId((Short) value); break;
            case LAST_UPDATE : entity.setLastUpdate((Timestamp) value); break;
            default : throw new IllegalArgumentException("Unknown identifier '" + identifier + "'.");
        }
    }
    
    @Override
    public Stream<FieldTrait> fields() {
        return Stream.of(
            City.CITY_ID,
            City.CITY,
            City.COUNTRY_ID,
            City.LAST_UPDATE
        );
    }
    
    @Override
    public Stream<FieldTrait> primaryKeyFields() {
        return Stream.of(
            City.CITY_ID
        );
    }
    
    @Override
    public Tuple1<Class<Short>> getPrimaryKeyClasses() {
        return PRIMARY_KEY_CLASSES;
    }
}