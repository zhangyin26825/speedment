package com.zhangyin.speedment.speedment.db0.sakila.category.generated;

import com.speedment.Speedment;
import com.speedment.internal.core.code.AbstractBaseEntity;
import com.zhangyin.speedment.speedment.db0.sakila.category.Category;
import com.zhangyin.speedment.speedment.db0.sakila.category.CategoryImpl;
import com.zhangyin.speedment.speedment.db0.sakila.film_category.FilmCategory;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * The generated base implementation representing an entity (for example, a
 * row) in the Table speedment.db0.sakila.category.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedCategoryImpl extends AbstractBaseEntity<Category> implements Category {
    
    private Byte categoryId;
    private String name;
    private Timestamp lastUpdate;
    
    protected GeneratedCategoryImpl() {
        
    }
    
    @Override
    public Byte getCategoryId() {
        return categoryId;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public final Category setCategoryId(Byte categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    
    @Override
    public final Category setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public final Category setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Stream<FilmCategory> findFilmCategoriesByCategoryId() {
        return managerOf_(FilmCategory.class)
                .stream().filter(FilmCategory.CATEGORY_ID.equal(this.getCategoryId()));
    }
    
    @Override
    public Stream<FilmCategory> findFilmCategories() {
        return findFilmCategoriesByCategoryId();
    }
    
    @Override
    public Category copy() {
        final Category category = new CategoryImpl() {
            @Override
            protected final Speedment speedment() {
                return GeneratedCategoryImpl.this.speedment();
            }
        };
        
        setCategoryId(category.getCategoryId());
        setName(category.getName());
        setLastUpdate(category.getLastUpdate());
        
        return category;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("categoryId = "+Objects.toString(getCategoryId()));
        sj.add("name = "+Objects.toString(getName()));
        sj.add("lastUpdate = "+Objects.toString(getLastUpdate()));
        return "CategoryImpl "+sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Category)) { return false; }
        final Category thatCategory = (Category)that;
        if (!Objects.equals(this.getCategoryId(), thatCategory.getCategoryId())) {return false; }
        if (!Objects.equals(this.getName(), thatCategory.getName())) {return false; }
        if (!Objects.equals(this.getLastUpdate(), thatCategory.getLastUpdate())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(getCategoryId());
        hash = 31 * hash + Objects.hashCode(getName());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
    
    @Override
    public Class<Category> entityClass() {
        return Category.class;
    }
}