package com.zhangyin.speedment.speedment.db0.sakila.address.generated;

import com.speedment.component.ProjectComponent;
import com.speedment.config.db.Table;
import com.speedment.internal.core.manager.sql.SqlManager;
import com.speedment.util.tuple.Tuple1;
import com.zhangyin.speedment.speedment.db0.sakila.address.Address;
import com.zhangyin.speedment.speedment.db0.sakila.address.AddressManager;
import javax.annotation.Generated;

/**
 * The generated base manager representing an entity (for example, a row) in
 * the Table speedment.db0.sakila.address.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface GeneratedAddressManager extends SqlManager<Address> {
    
    @Override
    default Short primaryKeyFor(Address entity) {
        return entity.getAddressId();
    }
    
    @Override
    default Table getTable() {
        return speedment().get(ProjectComponent.class).getProject().findTableByName("db0.sakila.address");
    }
    
    @Override
    default Class<AddressManager> getManagerClass() {
        return AddressManager.class;
    }
    
    @Override
    default Class<Address> getEntityClass() {
        return Address.class;
    }
    
    @Override
    Tuple1<Class<Short>> getPrimaryKeyClasses();
}