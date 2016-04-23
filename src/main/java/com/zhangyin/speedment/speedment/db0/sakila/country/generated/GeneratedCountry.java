package com.zhangyin.speedment.speedment.db0.sakila.country.generated;

import com.speedment.Entity;
import com.speedment.config.db.mapper.identity.ShortIdentityMapper;
import com.speedment.config.db.mapper.identity.StringIdentityMapper;
import com.speedment.config.db.mapper.identity.TimestampIdentityMapper;
import com.speedment.field.ComparableField;
import com.speedment.field.FieldIdentifier;
import com.speedment.field.StringField;
import com.speedment.internal.core.field.ComparableFieldImpl;
import com.speedment.internal.core.field.StringFieldImpl;
import com.zhangyin.speedment.speedment.db0.sakila.city.City;
import com.zhangyin.speedment.speedment.db0.sakila.country.Country;
import java.sql.Timestamp;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * The generated base interface representing an entity (for example, a row)
 * in the Table speedment.db0.sakila.country.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface GeneratedCountry extends Entity<Country> {
    
    /**
     * This Field corresponds to the {@link Country} field that can be obtained
     * using the {@link Country#getCountryId()} method.
     */
    final ComparableField<Country, Short, Short> COUNTRY_ID = new ComparableFieldImpl<>(Identifier.COUNTRY_ID, Country::getCountryId, Country::setCountryId, new ShortIdentityMapper(), true);
    /**
     * This Field corresponds to the {@link Country} field that can be obtained
     * using the {@link Country#getCountry()} method.
     */
    final StringField<Country, String> COUNTRY = new StringFieldImpl<>(Identifier.COUNTRY, Country::getCountry, Country::setCountry, new StringIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link Country} field that can be obtained
     * using the {@link Country#getLastUpdate()} method.
     */
    final ComparableField<Country, Timestamp, Timestamp> LAST_UPDATE = new ComparableFieldImpl<>(Identifier.LAST_UPDATE, Country::getLastUpdate, Country::setLastUpdate, new TimestampIdentityMapper(), false);
    
    /**
     * Returns the countryId of this Country. The countryId field corresponds to
     * the database column db0.sakila.country.country_id.
     * 
     * @return the countryId of this Country
     */
    Short getCountryId();
    
    /**
     * Returns the country of this Country. The country field corresponds to the
     * database column db0.sakila.country.country.
     * 
     * @return the country of this Country
     */
    String getCountry();
    
    /**
     * Returns the lastUpdate of this Country. The lastUpdate field corresponds
     * to the database column db0.sakila.country.last_update.
     * 
     * @return the lastUpdate of this Country
     */
    Timestamp getLastUpdate();
    
    /**
     * Sets the countryId of this Country. The countryId field corresponds to the
     * database column db0.sakila.country.country_id.
     * 
     * @param countryId to set of this Country
     * @return this Country instance
     */
    Country setCountryId(Short countryId);
    
    /**
     * Sets the country of this Country. The country field corresponds to the
     * database column db0.sakila.country.country.
     * 
     * @param country to set of this Country
     * @return this Country instance
     */
    Country setCountry(String country);
    
    /**
     * Sets the lastUpdate of this Country. The lastUpdate field corresponds to
     * the database column db0.sakila.country.last_update.
     * 
     * @param lastUpdate to set of this Country
     * @return this Country instance
     */
    Country setLastUpdate(Timestamp lastUpdate);
    
    /**
     * Creates and returns a {@link Stream} of all {@link City} Entities that
     * references this Entity by the foreign key field that can be obtained using
     * {@link City#getCountryId()}. The order of the Entities are undefined and
     * may change from time to time.
     * <p>
     * Using this method, you may "walk the graph" and jump directly between
     * referencing Entities without using {@code JOIN}s.<p> N.B. The current
     * implementation supports lazy-loading of the referencing Entities.
     * 
     * @return a {@link Stream} of all {@link City} Entities that references this
     * Entity by the foreign key field that can be obtained using {@link
     * City#getCountryId()}
     */
    Stream<City> findCitiesByCountryId();
    
    /**
     * Creates and returns a <em>distinct</em> {@link Stream} of all {@link City}
     * Entities that references this Entity by a foreign key. The order of the
     * Entities are undefined and may change from time to time.
     * <p>
     * Note that the Stream is <em>distinct</em>, meaning that referencing
     * Entities will only appear once in the Stream, even though they may
     * reference this Entity by several columns.
     * <p>
     * Using this method, you may "walk the graph" and jump directly between
     * referencing Entities without using {@code JOIN}s.
     * <p>
     * N.B. The current implementation supports lazy-loading of the referencing
     * Entities.
     * 
     * @return a <em>distinct</em> {@link Stream} of all {@link City} Entities
     * that references this Entity by a foreign key
     */
    Stream<City> findCities();
    
    enum Identifier implements FieldIdentifier<Country> {
        
        COUNTRY_ID ("country_id"),
        COUNTRY ("country"),
        LAST_UPDATE ("last_update");
        
        private final String columnName;
        
        Identifier(String columnName) {
            this.columnName = columnName;
        }
        
        @Override
        public String dbmsName() {
            return "db0";
        }
        
        @Override
        public String schemaName() {
            return "sakila";
        }
        
        @Override
        public String tableName() {
            return "country";
        }
        
        @Override
        public String columnName() {
            return this.columnName;
        }
    }
}