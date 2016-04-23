package com.zhangyin.speedment.speedment.db0.sakila.staff.generated;

import com.speedment.Speedment;
import com.speedment.exception.SpeedmentException;
import com.speedment.field.FieldIdentifier;
import com.speedment.field.trait.FieldTrait;
import com.speedment.internal.core.manager.sql.AbstractSqlManager;
import com.speedment.util.tuple.Tuple1;
import com.speedment.util.tuple.Tuples;
import com.zhangyin.speedment.speedment.db0.sakila.staff.Staff;
import com.zhangyin.speedment.speedment.db0.sakila.staff.StaffImpl;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.stream.Stream;
import javax.annotation.Generated;
import static com.speedment.internal.util.sql.ResultSetUtil.*;

/**
 * The generated base manager implementation representing an entity (for
 * example, a row) in the Table speedment.db0.sakila.staff.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedStaffManagerImpl extends AbstractSqlManager<Staff> implements GeneratedStaffManager {
    
    private final static Tuple1<Class<Byte>> PRIMARY_KEY_CLASSES = Tuples.of(Byte.class);
    
    protected GeneratedStaffManagerImpl(Speedment speedment) {
        super(speedment);
        setEntityMapper(this::newEntityFrom);
    }
    
    protected Staff newEntityFrom(ResultSet resultSet) throws SpeedmentException, SQLException {
        final Staff entity = newEmptyEntity();
        try {
            entity.setStaffId(resultSet.getByte(1));
            entity.setFirstName(resultSet.getString(2));
            entity.setLastName(resultSet.getString(3));
            entity.setAddressId(resultSet.getShort(4));
            entity.setPicture(resultSet.getBlob(5));
            entity.setEmail(resultSet.getString(6));
            entity.setStoreId(resultSet.getByte(7));
            entity.setActive(resultSet.getInt(8));
            entity.setUsername(resultSet.getString(9));
            entity.setPassword(resultSet.getString(10));
            entity.setLastUpdate(resultSet.getTimestamp(11));
        }
        catch (SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    @Override
    public Staff newEmptyEntity() {
        return new StaffImpl() {
            @Override
            protected Speedment speedment() {
                return speedment;
            }
        };
    }
    
    @Override
    public Object get(Staff entity, FieldIdentifier<Staff> identifier) {
        switch ((Staff.Identifier) identifier) {
            case STAFF_ID : return entity.getStaffId();
            case FIRST_NAME : return entity.getFirstName();
            case LAST_NAME : return entity.getLastName();
            case ADDRESS_ID : return entity.getAddressId();
            case PICTURE : return entity.getPicture().orElse(null);
            case EMAIL : return entity.getEmail().orElse(null);
            case STORE_ID : return entity.getStoreId();
            case ACTIVE : return entity.getActive();
            case USERNAME : return entity.getUsername();
            case PASSWORD : return entity.getPassword().orElse(null);
            case LAST_UPDATE : return entity.getLastUpdate();
            default : throw new IllegalArgumentException("Unknown identifier '" + identifier + "'.");
        }
    }
    
    @Override
    public void set(Staff entity, FieldIdentifier<Staff> identifier, Object value) {
        switch ((Staff.Identifier) identifier) {
            case STAFF_ID : entity.setStaffId((Byte) value); break;
            case FIRST_NAME : entity.setFirstName((String) value); break;
            case LAST_NAME : entity.setLastName((String) value); break;
            case ADDRESS_ID : entity.setAddressId((Short) value); break;
            case PICTURE : entity.setPicture((Blob) value); break;
            case EMAIL : entity.setEmail((String) value); break;
            case STORE_ID : entity.setStoreId((Byte) value); break;
            case ACTIVE : entity.setActive((Integer) value); break;
            case USERNAME : entity.setUsername((String) value); break;
            case PASSWORD : entity.setPassword((String) value); break;
            case LAST_UPDATE : entity.setLastUpdate((Timestamp) value); break;
            default : throw new IllegalArgumentException("Unknown identifier '" + identifier + "'.");
        }
    }
    
    @Override
    public Stream<FieldTrait> fields() {
        return Stream.of(
            Staff.STAFF_ID,
            Staff.FIRST_NAME,
            Staff.LAST_NAME,
            Staff.ADDRESS_ID,
            Staff.PICTURE,
            Staff.EMAIL,
            Staff.STORE_ID,
            Staff.ACTIVE,
            Staff.USERNAME,
            Staff.PASSWORD,
            Staff.LAST_UPDATE
        );
    }
    
    @Override
    public Stream<FieldTrait> primaryKeyFields() {
        return Stream.of(
            Staff.STAFF_ID
        );
    }
    
    @Override
    public Tuple1<Class<Byte>> getPrimaryKeyClasses() {
        return PRIMARY_KEY_CLASSES;
    }
}