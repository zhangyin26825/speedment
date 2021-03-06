package com.zhangyin.speedment.speedment.db0.sakila.address.generated;

import com.speedment.Speedment;
import com.speedment.exception.SpeedmentException;
import com.speedment.internal.core.code.AbstractBaseEntity;
import com.zhangyin.speedment.speedment.db0.sakila.address.Address;
import com.zhangyin.speedment.speedment.db0.sakila.address.AddressImpl;
import com.zhangyin.speedment.speedment.db0.sakila.city.City;
import com.zhangyin.speedment.speedment.db0.sakila.customer.Customer;
import com.zhangyin.speedment.speedment.db0.sakila.staff.Staff;
import com.zhangyin.speedment.speedment.db0.sakila.store.Store;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * The generated base implementation representing an entity (for example, a
 * row) in the Table speedment.db0.sakila.address.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made
 * to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedAddressImpl extends AbstractBaseEntity<Address> implements Address {
    
    private Short addressId;
    private String address;
    private String address2;
    private String district;
    private Short cityId;
    private String postalCode;
    private String phone;
    private Object location;
    private Timestamp lastUpdate;
    
    protected GeneratedAddressImpl() {
        
    }
    
    @Override
    public City findCityId() {
        return managerOf_(City.class).findAny(City.CITY_ID, getCityId())
            .orElseThrow(() -> new SpeedmentException(
                "Foreign key constraint error. City is set to " + getCityId()
                ));
            
    }
    
    @Override
    public Short getAddressId() {
        return addressId;
    }
    
    @Override
    public String getAddress() {
        return address;
    }
    
    @Override
    public Optional<String> getAddress2() {
        return Optional.ofNullable(address2);
    }
    
    @Override
    public String getDistrict() {
        return district;
    }
    
    @Override
    public Short getCityId() {
        return cityId;
    }
    
    @Override
    public Optional<String> getPostalCode() {
        return Optional.ofNullable(postalCode);
    }
    
    @Override
    public String getPhone() {
        return phone;
    }
    
    @Override
    public Object getLocation() {
        return location;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public final Address setAddressId(Short addressId) {
        this.addressId = addressId;
        return this;
    }
    
    @Override
    public final Address setAddress(String address) {
        this.address = address;
        return this;
    }
    
    @Override
    public final Address setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }
    
    @Override
    public final Address setDistrict(String district) {
        this.district = district;
        return this;
    }
    
    @Override
    public final Address setCityId(Short cityId) {
        this.cityId = cityId;
        return this;
    }
    
    @Override
    public final Address setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    
    @Override
    public final Address setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    
    @Override
    public final Address setLocation(Object location) {
        this.location = location;
        return this;
    }
    
    @Override
    public final Address setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Stream<Customer> findCustomersByAddressId() {
        return managerOf_(Customer.class)
                .stream().filter(Customer.ADDRESS_ID.equal(this.getAddressId()));
    }
    
    @Override
    public Stream<Staff> findStaffsByAddressId() {
        return managerOf_(Staff.class)
                .stream().filter(Staff.ADDRESS_ID.equal(this.getAddressId()));
    }
    
    @Override
    public Stream<Store> findStoresByAddressId() {
        return managerOf_(Store.class)
                .stream().filter(Store.ADDRESS_ID.equal(this.getAddressId()));
    }
    
    @Override
    public Stream<Staff> findStaffs() {
        return findStaffsByAddressId();
    }
    
    @Override
    public Stream<Customer> findCustomers() {
        return findCustomersByAddressId();
    }
    
    @Override
    public Stream<Store> findStores() {
        return findStoresByAddressId();
    }
    
    @Override
    public Address copy() {
        final Address address = new AddressImpl() {
            @Override
            protected final Speedment speedment() {
                return GeneratedAddressImpl.this.speedment();
            }
        };
        
        setAddressId(address.getAddressId());
        setAddress(address.getAddress());
        address.getAddress2().ifPresent(this::setAddress2);
        setDistrict(address.getDistrict());
        setCityId(address.getCityId());
        address.getPostalCode().ifPresent(this::setPostalCode);
        setPhone(address.getPhone());
        setLocation(address.getLocation());
        setLastUpdate(address.getLastUpdate());
        
        return address;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("addressId = "+Objects.toString(getAddressId()));
        sj.add("address = "+Objects.toString(getAddress()));
        sj.add("address2 = "+Objects.toString(getAddress2().orElse(null)));
        sj.add("district = "+Objects.toString(getDistrict()));
        sj.add("cityId = "+Objects.toString(getCityId()));
        sj.add("postalCode = "+Objects.toString(getPostalCode().orElse(null)));
        sj.add("phone = "+Objects.toString(getPhone()));
        sj.add("location = "+Objects.toString(getLocation()));
        sj.add("lastUpdate = "+Objects.toString(getLastUpdate()));
        return "AddressImpl "+sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Address)) { return false; }
        final Address thatAddress = (Address)that;
        if (!Objects.equals(this.getAddressId(), thatAddress.getAddressId())) {return false; }
        if (!Objects.equals(this.getAddress(), thatAddress.getAddress())) {return false; }
        if (!Objects.equals(this.getAddress2(), thatAddress.getAddress2())) {return false; }
        if (!Objects.equals(this.getDistrict(), thatAddress.getDistrict())) {return false; }
        if (!Objects.equals(this.getCityId(), thatAddress.getCityId())) {return false; }
        if (!Objects.equals(this.getPostalCode(), thatAddress.getPostalCode())) {return false; }
        if (!Objects.equals(this.getPhone(), thatAddress.getPhone())) {return false; }
        if (!Objects.equals(this.getLocation(), thatAddress.getLocation())) {return false; }
        if (!Objects.equals(this.getLastUpdate(), thatAddress.getLastUpdate())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(getAddressId());
        hash = 31 * hash + Objects.hashCode(getAddress());
        hash = 31 * hash + Objects.hashCode(getAddress2());
        hash = 31 * hash + Objects.hashCode(getDistrict());
        hash = 31 * hash + Objects.hashCode(getCityId());
        hash = 31 * hash + Objects.hashCode(getPostalCode());
        hash = 31 * hash + Objects.hashCode(getPhone());
        hash = 31 * hash + Objects.hashCode(getLocation());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
    
    @Override
    public Class<Address> entityClass() {
        return Address.class;
    }
}