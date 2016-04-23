package com.zhangyin.speedment.speedment.db0.sakila.rental.generated;

import com.speedment.component.ProjectComponent;
import com.speedment.config.db.Table;
import com.speedment.internal.core.manager.sql.SqlManager;
import com.speedment.util.tuple.Tuple1;
import com.zhangyin.speedment.speedment.db0.sakila.rental.Rental;
import com.zhangyin.speedment.speedment.db0.sakila.rental.RentalManager;
import javax.annotation.Generated;

/**
 * The generated base manager representing an entity (for example, a row) in
 * the Table speedment.db0.sakila.rental.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface GeneratedRentalManager extends SqlManager<Rental> {
    
    @Override
    default Integer primaryKeyFor(Rental entity) {
        return entity.getRentalId();
    }
    
    @Override
    default Table getTable() {
        return speedment().get(ProjectComponent.class).getProject().findTableByName("db0.sakila.rental");
    }
    
    @Override
    default Class<RentalManager> getManagerClass() {
        return RentalManager.class;
    }
    
    @Override
    default Class<Rental> getEntityClass() {
        return Rental.class;
    }
    
    @Override
    Tuple1<Class<Integer>> getPrimaryKeyClasses();
}