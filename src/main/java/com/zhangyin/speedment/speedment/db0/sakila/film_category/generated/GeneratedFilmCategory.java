package com.zhangyin.speedment.speedment.db0.sakila.film_category.generated;

import com.speedment.Entity;
import com.speedment.config.db.mapper.identity.ByteIdentityMapper;
import com.speedment.config.db.mapper.identity.ShortIdentityMapper;
import com.speedment.config.db.mapper.identity.TimestampIdentityMapper;
import com.speedment.field.ComparableField;
import com.speedment.field.ComparableForeignKeyField;
import com.speedment.field.FieldIdentifier;
import com.speedment.internal.core.field.ComparableFieldImpl;
import com.speedment.internal.core.field.ComparableForeignKeyFieldImpl;
import com.zhangyin.speedment.speedment.db0.sakila.category.Category;
import com.zhangyin.speedment.speedment.db0.sakila.film.Film;
import com.zhangyin.speedment.speedment.db0.sakila.film_category.FilmCategory;
import java.sql.Timestamp;
import javax.annotation.Generated;

/**
 * The generated base interface representing an entity (for example, a row)
 * in the Table speedment.db0.sakila.film_category.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface GeneratedFilmCategory extends Entity<FilmCategory> {
    
    /**
     * This Field corresponds to the {@link FilmCategory} field that can be
     * obtained using the {@link FilmCategory#getFilmId()} method.
     */
    final ComparableForeignKeyField<FilmCategory, Short, Short, Film> FILM_ID = new ComparableForeignKeyFieldImpl<>(Identifier.FILM_ID, FilmCategory::getFilmId, FilmCategory::setFilmId, FilmCategory::findFilmId, new ShortIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link FilmCategory} field that can be
     * obtained using the {@link FilmCategory#getCategoryId()} method.
     */
    final ComparableForeignKeyField<FilmCategory, Byte, Byte, Category> CATEGORY_ID = new ComparableForeignKeyFieldImpl<>(Identifier.CATEGORY_ID, FilmCategory::getCategoryId, FilmCategory::setCategoryId, FilmCategory::findCategoryId, new ByteIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link FilmCategory} field that can be
     * obtained using the {@link FilmCategory#getLastUpdate()} method.
     */
    final ComparableField<FilmCategory, Timestamp, Timestamp> LAST_UPDATE = new ComparableFieldImpl<>(Identifier.LAST_UPDATE, FilmCategory::getLastUpdate, FilmCategory::setLastUpdate, new TimestampIdentityMapper(), false);
    
    /**
     * Finds and returns the foreign key Entity {@link Category} referenced by
     * the field that can be obtained using {@link FilmCategory#getCategoryId()}.
     * <p>
     * N.B. The current implementation only supports lazy-loading of the
     * referenced Entities. This means that if you traverse N FilmCategory
     * entities and call this method for each one, there will be N SQL-queries
     * executed.
     * 
     * @return the foreign key Entity {@link Category} referenced by the field
     * that can be obtained using {@link FilmCategory#getCategoryId()}
     */
    Category findCategoryId();
    
    /**
     * Finds and returns the foreign key Entity {@link Film} referenced by the
     * field that can be obtained using {@link FilmCategory#getFilmId()}.
     * <p>
     * N.B. The current implementation only supports lazy-loading of the
     * referenced Entities. This means that if you traverse N FilmCategory
     * entities and call this method for each one, there will be N SQL-queries
     * executed.
     * 
     * @return the foreign key Entity {@link Film} referenced by the field that
     * can be obtained using {@link FilmCategory#getFilmId()}
     */
    Film findFilmId();
    
    /**
     * Returns the filmId of this FilmCategory. The filmId field corresponds to
     * the database column db0.sakila.film_category.film_id.
     * 
     * @return the filmId of this FilmCategory
     */
    Short getFilmId();
    
    /**
     * Returns the categoryId of this FilmCategory. The categoryId field
     * corresponds to the database column db0.sakila.film_category.category_id.
     * 
     * @return the categoryId of this FilmCategory
     */
    Byte getCategoryId();
    
    /**
     * Returns the lastUpdate of this FilmCategory. The lastUpdate field
     * corresponds to the database column db0.sakila.film_category.last_update.
     * 
     * @return the lastUpdate of this FilmCategory
     */
    Timestamp getLastUpdate();
    
    /**
     * Sets the filmId of this FilmCategory. The filmId field corresponds to the
     * database column db0.sakila.film_category.film_id.
     * 
     * @param filmId to set of this FilmCategory
     * @return this FilmCategory instance
     */
    FilmCategory setFilmId(Short filmId);
    
    /**
     * Sets the categoryId of this FilmCategory. The categoryId field corresponds
     * to the database column db0.sakila.film_category.category_id.
     * 
     * @param categoryId to set of this FilmCategory
     * @return this FilmCategory instance
     */
    FilmCategory setCategoryId(Byte categoryId);
    
    /**
     * Sets the lastUpdate of this FilmCategory. The lastUpdate field corresponds
     * to the database column db0.sakila.film_category.last_update.
     * 
     * @param lastUpdate to set of this FilmCategory
     * @return this FilmCategory instance
     */
    FilmCategory setLastUpdate(Timestamp lastUpdate);
    
    enum Identifier implements FieldIdentifier<FilmCategory> {
        
        FILM_ID ("film_id"),
        CATEGORY_ID ("category_id"),
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
            return "film_category";
        }
        
        @Override
        public String columnName() {
            return this.columnName;
        }
    }
}