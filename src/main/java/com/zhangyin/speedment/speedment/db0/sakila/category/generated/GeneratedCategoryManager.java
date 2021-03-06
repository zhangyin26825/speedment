package com.zhangyin.speedment.speedment.db0.sakila.category.generated;

import com.speedment.component.ProjectComponent;
import com.speedment.config.db.Table;
import com.speedment.internal.core.manager.sql.SqlManager;
import com.speedment.util.tuple.Tuple1;
import com.zhangyin.speedment.speedment.db0.sakila.category.Category;
import com.zhangyin.speedment.speedment.db0.sakila.category.CategoryManager;
import javax.annotation.Generated;

/**
 * The generated base manager representing an entity (for example, a row) in
 * the Table speedment.db0.sakila.category.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface GeneratedCategoryManager extends SqlManager<Category> {
    
    @Override
    default Byte primaryKeyFor(Category entity) {
        return entity.getCategoryId();
    }
    
    @Override
    default Table getTable() {
        return speedment().get(ProjectComponent.class).getProject().findTableByName("db0.sakila.category");
    }
    
    @Override
    default Class<CategoryManager> getManagerClass() {
        return CategoryManager.class;
    }
    
    @Override
    default Class<Category> getEntityClass() {
        return Category.class;
    }
    
    @Override
    Tuple1<Class<Byte>> getPrimaryKeyClasses();
}