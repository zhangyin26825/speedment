package com.zhangyin.speedment.speedment.db0.sakila.country.generated;

import com.speedment.component.ProjectComponent;
import com.speedment.config.db.Table;
import com.speedment.internal.core.manager.sql.SqlManager;
import com.speedment.util.tuple.Tuple1;
import com.zhangyin.speedment.speedment.db0.sakila.country.Country;
import com.zhangyin.speedment.speedment.db0.sakila.country.CountryManager;
import javax.annotation.Generated;

/**
 * The generated base manager representing an entity (for example, a row) in
 * the Table speedment.db0.sakila.country.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface GeneratedCountryManager extends SqlManager<Country> {
    
    @Override
    default Short primaryKeyFor(Country entity) {
        return entity.getCountryId();
    }
    
    @Override
    default Table getTable() {
        return speedment().get(ProjectComponent.class).getProject().findTableByName("db0.sakila.country");
    }
    
    @Override
    default Class<CountryManager> getManagerClass() {
        return CountryManager.class;
    }
    
    @Override
    default Class<Country> getEntityClass() {
        return Country.class;
    }
    
    @Override
    Tuple1<Class<Short>> getPrimaryKeyClasses();
}