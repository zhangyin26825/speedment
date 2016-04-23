package com.zhangyin.speedment.speedment.db0.sakila.film_category.generated;

import com.speedment.component.ProjectComponent;
import com.speedment.config.db.Table;
import com.speedment.internal.core.manager.sql.SqlManager;
import com.speedment.util.tuple.Tuple2;
import com.zhangyin.speedment.speedment.db0.sakila.film_category.FilmCategory;
import com.zhangyin.speedment.speedment.db0.sakila.film_category.FilmCategoryManager;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;

/**
 * The generated base manager representing an entity (for example, a row) in
 * the Table speedment.db0.sakila.film_category.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface GeneratedFilmCategoryManager extends SqlManager<FilmCategory> {
    
    @Override
    default List<?> primaryKeyFor(FilmCategory entity) {
        return Arrays.asList(entity.getCategoryId(), entity.getFilmId());
    }
    
    @Override
    default Table getTable() {
        return speedment().get(ProjectComponent.class).getProject().findTableByName("db0.sakila.film_category");
    }
    
    @Override
    default Class<FilmCategoryManager> getManagerClass() {
        return FilmCategoryManager.class;
    }
    
    @Override
    default Class<FilmCategory> getEntityClass() {
        return FilmCategory.class;
    }
    
    @Override
    Tuple2<Class<Byte>, Class<Short>> getPrimaryKeyClasses();
}