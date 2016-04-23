package com.zhangyin.speedment.speedment.db0.sakila.customer.generated;

import com.speedment.Speedment;
import com.speedment.exception.SpeedmentException;
import com.speedment.field.FieldIdentifier;
import com.speedment.field.trait.FieldTrait;
import com.speedment.internal.core.manager.sql.AbstractSqlManager;
import com.speedment.util.tuple.Tuple1;
import com.speedment.util.tuple.Tuples;
import com.zhangyin.speedment.speedment.db0.sakila.customer.Customer;
import com.zhangyin.speedment.speedment.db0.sakila.customer.CustomerImpl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.stream.Stream;
import javax.annotation.Generated;
import static com.speedment.internal.util.sql.ResultSetUtil.*;

/**
 * The generated base manager implementation representing an entity (for
 * example, a row) in the Table speedment.db0.sakila.customer.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedCustomerManagerImpl extends AbstractSqlManager<Customer> implements GeneratedCustomerManager {
    
    private final static Tuple1<Class<Short>> PRIMARY_KEY_CLASSES = Tuples.of(Short.class);
    
    protected GeneratedCustomerManagerImpl(Speedment speedment) {
        super(speedment);
        setEntityMapper(this::newEntityFrom);
    }
    
    protected Customer newEntityFrom(ResultSet resultSet) throws SpeedmentException, SQLException {
        final Customer entity = newEmptyEntity();
        try {
            entity.setCustomerId(resultSet.getShort(1));
            entity.setStoreId(resultSet.getByte(2));
            entity.setFirstName(resultSet.getString(3));
            entity.setLastName(resultSet.getString(4));
            entity.setEmail(resultSet.getString(5));
            entity.setAddressId(resultSet.getShort(6));
            entity.setActive(resultSet.getInt(7));
            entity.setCreateDate(resultSet.getTimestamp(8));
            entity.setLastUpdate(resultSet.getTimestamp(9));
        }
        catch (SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    @Override
    public Customer newEmptyEntity() {
        return new CustomerImpl() {
            @Override
            protected Speedment speedment() {
                return speedment;
            }
        };
    }
    
    @Override
    public Object get(Customer entity, FieldIdentifier<Customer> identifier) {
        switch ((Customer.Identifier) identifier) {
            case CUSTOMER_ID : return entity.getCustomerId();
            case STORE_ID : return entity.getStoreId();
            case FIRST_NAME : return entity.getFirstName();
            case LAST_NAME : return entity.getLastName();
            case EMAIL : return entity.getEmail().orElse(null);
            case ADDRESS_ID : return entity.getAddressId();
            case ACTIVE : return entity.getActive();
            case CREATE_DATE : return entity.getCreateDate();
            case LAST_UPDATE : return entity.getLastUpdate();
            default : throw new IllegalArgumentException("Unknown identifier '" + identifier + "'.");
        }
    }
    
    @Override
    public void set(Customer entity, FieldIdentifier<Customer> identifier, Object value) {
        switch ((Customer.Identifier) identifier) {
            case CUSTOMER_ID : entity.setCustomerId((Short) value); break;
            case STORE_ID : entity.setStoreId((Byte) value); break;
            case FIRST_NAME : entity.setFirstName((String) value); break;
            case LAST_NAME : entity.setLastName((String) value); break;
            case EMAIL : entity.setEmail((String) value); break;
            case ADDRESS_ID : entity.setAddressId((Short) value); break;
            case ACTIVE : entity.setActive((Integer) value); break;
            case CREATE_DATE : entity.setCreateDate((Timestamp) value); break;
            case LAST_UPDATE : entity.setLastUpdate((Timestamp) value); break;
            default : throw new IllegalArgumentException("Unknown identifier '" + identifier + "'.");
        }
    }
    
    @Override
    public Stream<FieldTrait> fields() {
        return Stream.of(
            Customer.CUSTOMER_ID,
            Customer.STORE_ID,
            Customer.FIRST_NAME,
            Customer.LAST_NAME,
            Customer.EMAIL,
            Customer.ADDRESS_ID,
            Customer.ACTIVE,
            Customer.CREATE_DATE,
            Customer.LAST_UPDATE
        );
    }
    
    @Override
    public Stream<FieldTrait> primaryKeyFields() {
        return Stream.of(
            Customer.CUSTOMER_ID
        );
    }
    
    @Override
    public Tuple1<Class<Short>> getPrimaryKeyClasses() {
        return PRIMARY_KEY_CLASSES;
    }
}