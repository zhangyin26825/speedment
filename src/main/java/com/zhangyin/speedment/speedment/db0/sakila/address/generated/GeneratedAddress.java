package com.zhangyin.speedment.speedment.db0.sakila.address.generated;

import com.speedment.Entity;
import com.speedment.config.db.mapper.identity.ObjectIdentityMapper;
import com.speedment.config.db.mapper.identity.ShortIdentityMapper;
import com.speedment.config.db.mapper.identity.StringIdentityMapper;
import com.speedment.config.db.mapper.identity.TimestampIdentityMapper;
import com.speedment.field.ComparableField;
import com.speedment.field.ComparableForeignKeyField;
import com.speedment.field.FieldIdentifier;
import com.speedment.field.ReferenceField;
import com.speedment.field.StringField;
import com.speedment.internal.core.field.ComparableFieldImpl;
import com.speedment.internal.core.field.ComparableForeignKeyFieldImpl;
import com.speedment.internal.core.field.ReferenceFieldImpl;
import com.speedment.internal.core.field.StringFieldImpl;
import com.zhangyin.speedment.speedment.db0.sakila.address.Address;
import com.zhangyin.speedment.speedment.db0.sakila.city.City;
import com.zhangyin.speedment.speedment.db0.sakila.customer.Customer;
import com.zhangyin.speedment.speedment.db0.sakila.staff.Staff;
import com.zhangyin.speedment.speedment.db0.sakila.store.Store;
import java.sql.Timestamp;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * The generated base interface representing an entity (for example, a row)
 * in the Table speedment.db0.sakila.address.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface GeneratedAddress extends Entity<Address> {
    
    /**
     * This Field corresponds to the {@link Address} field that can be obtained
     * using the {@link Address#getAddressId()} method.
     */
    final ComparableField<Address, Short, Short> ADDRESS_ID = new ComparableFieldImpl<>(Identifier.ADDRESS_ID, Address::getAddressId, Address::setAddressId, new ShortIdentityMapper(), true);
    /**
     * This Field corresponds to the {@link Address} field that can be obtained
     * using the {@link Address#getAddress()} method.
     */
    final StringField<Address, String> ADDRESS = new StringFieldImpl<>(Identifier.ADDRESS, Address::getAddress, Address::setAddress, new StringIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link Address} field that can be obtained
     * using the {@link Address#getAddress2()} method.
     */
    final StringField<Address, String> ADDRESS2 = new StringFieldImpl<>(Identifier.ADDRESS2, o -> o.getAddress2().orElse(null), Address::setAddress2, new StringIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link Address} field that can be obtained
     * using the {@link Address#getDistrict()} method.
     */
    final StringField<Address, String> DISTRICT = new StringFieldImpl<>(Identifier.DISTRICT, Address::getDistrict, Address::setDistrict, new StringIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link Address} field that can be obtained
     * using the {@link Address#getCityId()} method.
     */
    final ComparableForeignKeyField<Address, Short, Short, City> CITY_ID = new ComparableForeignKeyFieldImpl<>(Identifier.CITY_ID, Address::getCityId, Address::setCityId, Address::findCityId, new ShortIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link Address} field that can be obtained
     * using the {@link Address#getPostalCode()} method.
     */
    final StringField<Address, String> POSTAL_CODE = new StringFieldImpl<>(Identifier.POSTAL_CODE, o -> o.getPostalCode().orElse(null), Address::setPostalCode, new StringIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link Address} field that can be obtained
     * using the {@link Address#getPhone()} method.
     */
    final StringField<Address, String> PHONE = new StringFieldImpl<>(Identifier.PHONE, Address::getPhone, Address::setPhone, new StringIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link Address} field that can be obtained
     * using the {@link Address#getLocation()} method.
     */
    final ReferenceField<Address, Object, Object> LOCATION = new ReferenceFieldImpl<>(Identifier.LOCATION, Address::getLocation, Address::setLocation, new ObjectIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link Address} field that can be obtained
     * using the {@link Address#getLastUpdate()} method.
     */
    final ComparableField<Address, Timestamp, Timestamp> LAST_UPDATE = new ComparableFieldImpl<>(Identifier.LAST_UPDATE, Address::getLastUpdate, Address::setLastUpdate, new TimestampIdentityMapper(), false);
    
    /**
     * Finds and returns the foreign key Entity {@link City} referenced by the
     * field that can be obtained using {@link Address#getCityId()}.
     * <p>
     * N.B. The current implementation only supports lazy-loading of the
     * referenced Entities. This means that if you traverse N Address entities
     * and call this method for each one, there will be N SQL-queries executed.
     * 
     * @return the foreign key Entity {@link City} referenced by the field that
     * can be obtained using {@link Address#getCityId()}
     */
    City findCityId();
    
    /**
     * Returns the addressId of this Address. The addressId field corresponds to
     * the database column db0.sakila.address.address_id.
     * 
     * @return the addressId of this Address
     */
    Short getAddressId();
    
    /**
     * Returns the address of this Address. The address field corresponds to the
     * database column db0.sakila.address.address.
     * 
     * @return the address of this Address
     */
    String getAddress();
    
    /**
     * Returns the address2 of this Address. The address2 field corresponds to
     * the database column db0.sakila.address.address2.
     * 
     * @return the address2 of this Address
     */
    Optional<String> getAddress2();
    
    /**
     * Returns the district of this Address. The district field corresponds to
     * the database column db0.sakila.address.district.
     * 
     * @return the district of this Address
     */
    String getDistrict();
    
    /**
     * Returns the cityId of this Address. The cityId field corresponds to the
     * database column db0.sakila.address.city_id.
     * 
     * @return the cityId of this Address
     */
    Short getCityId();
    
    /**
     * Returns the postalCode of this Address. The postalCode field corresponds
     * to the database column db0.sakila.address.postal_code.
     * 
     * @return the postalCode of this Address
     */
    Optional<String> getPostalCode();
    
    /**
     * Returns the phone of this Address. The phone field corresponds to the
     * database column db0.sakila.address.phone.
     * 
     * @return the phone of this Address
     */
    String getPhone();
    
    /**
     * Returns the location of this Address. The location field corresponds to
     * the database column db0.sakila.address.location.
     * 
     * @return the location of this Address
     */
    Object getLocation();
    
    /**
     * Returns the lastUpdate of this Address. The lastUpdate field corresponds
     * to the database column db0.sakila.address.last_update.
     * 
     * @return the lastUpdate of this Address
     */
    Timestamp getLastUpdate();
    
    /**
     * Sets the addressId of this Address. The addressId field corresponds to the
     * database column db0.sakila.address.address_id.
     * 
     * @param addressId to set of this Address
     * @return this Address instance
     */
    Address setAddressId(Short addressId);
    
    /**
     * Sets the address of this Address. The address field corresponds to the
     * database column db0.sakila.address.address.
     * 
     * @param address to set of this Address
     * @return this Address instance
     */
    Address setAddress(String address);
    
    /**
     * Sets the address2 of this Address. The address2 field corresponds to the
     * database column db0.sakila.address.address2.
     * 
     * @param address2 to set of this Address
     * @return this Address instance
     */
    Address setAddress2(String address2);
    
    /**
     * Sets the district of this Address. The district field corresponds to the
     * database column db0.sakila.address.district.
     * 
     * @param district to set of this Address
     * @return this Address instance
     */
    Address setDistrict(String district);
    
    /**
     * Sets the cityId of this Address. The cityId field corresponds to the
     * database column db0.sakila.address.city_id.
     * 
     * @param cityId to set of this Address
     * @return this Address instance
     */
    Address setCityId(Short cityId);
    
    /**
     * Sets the postalCode of this Address. The postalCode field corresponds to
     * the database column db0.sakila.address.postal_code.
     * 
     * @param postalCode to set of this Address
     * @return this Address instance
     */
    Address setPostalCode(String postalCode);
    
    /**
     * Sets the phone of this Address. The phone field corresponds to the
     * database column db0.sakila.address.phone.
     * 
     * @param phone to set of this Address
     * @return this Address instance
     */
    Address setPhone(String phone);
    
    /**
     * Sets the location of this Address. The location field corresponds to the
     * database column db0.sakila.address.location.
     * 
     * @param location to set of this Address
     * @return this Address instance
     */
    Address setLocation(Object location);
    
    /**
     * Sets the lastUpdate of this Address. The lastUpdate field corresponds to
     * the database column db0.sakila.address.last_update.
     * 
     * @param lastUpdate to set of this Address
     * @return this Address instance
     */
    Address setLastUpdate(Timestamp lastUpdate);
    
    /**
     * Creates and returns a {@link Stream} of all {@link Customer} Entities that
     * references this Entity by the foreign key field that can be obtained using
     * {@link Customer#getAddressId()}. The order of the Entities are undefined
     * and may change from time to time.
     * <p>
     * Using this method, you may "walk the graph" and jump directly between
     * referencing Entities without using {@code JOIN}s.<p> N.B. The current
     * implementation supports lazy-loading of the referencing Entities.
     * 
     * @return a {@link Stream} of all {@link Customer} Entities that references
     * this Entity by the foreign key field that can be obtained using {@link
     * Customer#getAddressId()}
     */
    Stream<Customer> findCustomersByAddressId();
    
    /**
     * Creates and returns a {@link Stream} of all {@link Staff} Entities that
     * references this Entity by the foreign key field that can be obtained using
     * {@link Staff#getAddressId()}. The order of the Entities are undefined and
     * may change from time to time.
     * <p>
     * Using this method, you may "walk the graph" and jump directly between
     * referencing Entities without using {@code JOIN}s.<p> N.B. The current
     * implementation supports lazy-loading of the referencing Entities.
     * 
     * @return a {@link Stream} of all {@link Staff} Entities that references
     * this Entity by the foreign key field that can be obtained using {@link
     * Staff#getAddressId()}
     */
    Stream<Staff> findStaffsByAddressId();
    
    /**
     * Creates and returns a {@link Stream} of all {@link Store} Entities that
     * references this Entity by the foreign key field that can be obtained using
     * {@link Store#getAddressId()}. The order of the Entities are undefined and
     * may change from time to time.
     * <p>
     * Using this method, you may "walk the graph" and jump directly between
     * referencing Entities without using {@code JOIN}s.<p> N.B. The current
     * implementation supports lazy-loading of the referencing Entities.
     * 
     * @return a {@link Stream} of all {@link Store} Entities that references
     * this Entity by the foreign key field that can be obtained using {@link
     * Store#getAddressId()}
     */
    Stream<Store> findStoresByAddressId();
    
    /**
     * Creates and returns a <em>distinct</em> {@link Stream} of all {@link
     * Staff} Entities that references this Entity by a foreign key. The order of
     * the Entities are undefined and may change from time to time.
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
     * @return a <em>distinct</em> {@link Stream} of all {@link Staff} Entities
     * that references this Entity by a foreign key
     */
    Stream<Staff> findStaffs();
    
    /**
     * Creates and returns a <em>distinct</em> {@link Stream} of all {@link
     * Customer} Entities that references this Entity by a foreign key. The order
     * of the Entities are undefined and may change from time to time.
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
     * @return a <em>distinct</em> {@link Stream} of all {@link Customer}
     * Entities that references this Entity by a foreign key
     */
    Stream<Customer> findCustomers();
    
    /**
     * Creates and returns a <em>distinct</em> {@link Stream} of all {@link
     * Store} Entities that references this Entity by a foreign key. The order of
     * the Entities are undefined and may change from time to time.
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
     * @return a <em>distinct</em> {@link Stream} of all {@link Store} Entities
     * that references this Entity by a foreign key
     */
    Stream<Store> findStores();
    
    enum Identifier implements FieldIdentifier<Address> {
        
        ADDRESS_ID ("address_id"),
        ADDRESS ("address"),
        ADDRESS2 ("address2"),
        DISTRICT ("district"),
        CITY_ID ("city_id"),
        POSTAL_CODE ("postal_code"),
        PHONE ("phone"),
        LOCATION ("location"),
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
            return "address";
        }
        
        @Override
        public String columnName() {
            return this.columnName;
        }
    }
}