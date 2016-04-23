package com.zhangyin.speedment.speedment.db0.sakila.language.generated;

import com.speedment.Entity;
import com.speedment.config.db.mapper.identity.ByteIdentityMapper;
import com.speedment.config.db.mapper.identity.StringIdentityMapper;
import com.speedment.config.db.mapper.identity.TimestampIdentityMapper;
import com.speedment.field.ComparableField;
import com.speedment.field.FieldIdentifier;
import com.speedment.field.StringField;
import com.speedment.internal.core.field.ComparableFieldImpl;
import com.speedment.internal.core.field.StringFieldImpl;
import com.zhangyin.speedment.speedment.db0.sakila.film.Film;
import com.zhangyin.speedment.speedment.db0.sakila.language.Language;
import java.sql.Timestamp;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * The generated base interface representing an entity (for example, a row)
 * in the Table speedment.db0.sakila.language.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface GeneratedLanguage extends Entity<Language> {
    
    /**
     * This Field corresponds to the {@link Language} field that can be obtained
     * using the {@link Language#getLanguageId()} method.
     */
    final ComparableField<Language, Byte, Byte> LANGUAGE_ID = new ComparableFieldImpl<>(Identifier.LANGUAGE_ID, Language::getLanguageId, Language::setLanguageId, new ByteIdentityMapper(), true);
    /**
     * This Field corresponds to the {@link Language} field that can be obtained
     * using the {@link Language#getName()} method.
     */
    final StringField<Language, String> NAME = new StringFieldImpl<>(Identifier.NAME, Language::getName, Language::setName, new StringIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link Language} field that can be obtained
     * using the {@link Language#getLastUpdate()} method.
     */
    final ComparableField<Language, Timestamp, Timestamp> LAST_UPDATE = new ComparableFieldImpl<>(Identifier.LAST_UPDATE, Language::getLastUpdate, Language::setLastUpdate, new TimestampIdentityMapper(), false);
    
    /**
     * Returns the languageId of this Language. The languageId field corresponds
     * to the database column db0.sakila.language.language_id.
     * 
     * @return the languageId of this Language
     */
    Byte getLanguageId();
    
    /**
     * Returns the name of this Language. The name field corresponds to the
     * database column db0.sakila.language.name.
     * 
     * @return the name of this Language
     */
    String getName();
    
    /**
     * Returns the lastUpdate of this Language. The lastUpdate field corresponds
     * to the database column db0.sakila.language.last_update.
     * 
     * @return the lastUpdate of this Language
     */
    Timestamp getLastUpdate();
    
    /**
     * Sets the languageId of this Language. The languageId field corresponds to
     * the database column db0.sakila.language.language_id.
     * 
     * @param languageId to set of this Language
     * @return this Language instance
     */
    Language setLanguageId(Byte languageId);
    
    /**
     * Sets the name of this Language. The name field corresponds to the database
     * column db0.sakila.language.name.
     * 
     * @param name to set of this Language
     * @return this Language instance
     */
    Language setName(String name);
    
    /**
     * Sets the lastUpdate of this Language. The lastUpdate field corresponds to
     * the database column db0.sakila.language.last_update.
     * 
     * @param lastUpdate to set of this Language
     * @return this Language instance
     */
    Language setLastUpdate(Timestamp lastUpdate);
    
    /**
     * Creates and returns a {@link Stream} of all {@link Film} Entities that
     * references this Entity by the foreign key field that can be obtained using
     * {@link Film#getLanguageId()}. The order of the Entities are undefined and
     * may change from time to time.
     * <p>
     * Using this method, you may "walk the graph" and jump directly between
     * referencing Entities without using {@code JOIN}s.<p> N.B. The current
     * implementation supports lazy-loading of the referencing Entities.
     * 
     * @return a {@link Stream} of all {@link Film} Entities that references this
     * Entity by the foreign key field that can be obtained using {@link
     * Film#getLanguageId()}
     */
    Stream<Film> findFilmsByLanguageId();
    
    /**
     * Creates and returns a {@link Stream} of all {@link Film} Entities that
     * references this Entity by the foreign key field that can be obtained using
     * {@link Film#getOriginalLanguageId()}. The order of the Entities are
     * undefined and may change from time to time.
     * <p>
     * Using this method, you may "walk the graph" and jump directly between
     * referencing Entities without using {@code JOIN}s.<p> N.B. The current
     * implementation supports lazy-loading of the referencing Entities.
     * 
     * @return a {@link Stream} of all {@link Film} Entities that references this
     * Entity by the foreign key field that can be obtained using {@link
     * Film#getOriginalLanguageId()}
     */
    Stream<Film> findFilmsByOriginalLanguageId();
    
    /**
     * Creates and returns a <em>distinct</em> {@link Stream} of all {@link Film}
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
     * @return a <em>distinct</em> {@link Stream} of all {@link Film} Entities
     * that references this Entity by a foreign key
     */
    Stream<Film> findFilms();
    
    enum Identifier implements FieldIdentifier<Language> {
        
        LANGUAGE_ID ("language_id"),
        NAME ("name"),
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
            return "language";
        }
        
        @Override
        public String columnName() {
            return this.columnName;
        }
    }
}