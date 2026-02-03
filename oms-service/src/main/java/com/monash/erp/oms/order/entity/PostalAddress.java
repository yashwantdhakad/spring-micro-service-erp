package com.monash.erp.oms.order.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class PostalAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contactMechId;
    private String toName;
    private String address1;
    private String address2;
    private String city;
    private String postalCode;
    private String countryGeoId;
    private String stateProvinceGeoId;
public void setId(Long id) {
        this.id = id;
    }
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
public void setToName(String toName) {
        this.toName = toName;
    }
public void setAddress1(String address1) {
        this.address1 = address1;
    }
public void setAddress2(String address2) {
        this.address2 = address2;
    }
public void setCity(String city) {
        this.city = city;
    }
public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
public void setCountryGeoId(String countryGeoId) {
        this.countryGeoId = countryGeoId;
    }
public void setStateProvinceGeoId(String stateProvinceGeoId) {
        this.stateProvinceGeoId = stateProvinceGeoId;
    }
}
