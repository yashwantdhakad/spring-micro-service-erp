package com.monash.erp.party.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "postal_address",
        indexes = {
                @Index(name = "idx_postal_address_contact_mech_id", columnList = "contact_mech_id"),
                @Index(name = "idx_postal_address_postal_code", columnList = "postal_code")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class PostalAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contactMechId;
    private String toName;
    private String attnName;
    private String address1;
    private String address2;
    private String houseNumber;
    private String houseNumberExt;
    private String directions;
    private String city;
    private String cityGeoId;
    private String postalCode;
    private String postalCodeExt;
    private String countryGeoId;
    private String stateProvinceGeoId;
    private String countyGeoId;
    private String municipalityGeoId;
    private String postalCodeGeoId;
    private String geoPointId;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String shipToCode;
public void setId(Long id) {
        this.id = id;
    }
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
public void setToName(String toName) {
        this.toName = toName;
    }
public void setAttnName(String attnName) {
        this.attnName = attnName;
    }
public void setAddress1(String address1) {
        this.address1 = address1;
    }
public void setAddress2(String address2) {
        this.address2 = address2;
    }
public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
public void setHouseNumberExt(String houseNumberExt) {
        this.houseNumberExt = houseNumberExt;
    }
public void setDirections(String directions) {
        this.directions = directions;
    }
public void setCity(String city) {
        this.city = city;
    }
public void setCityGeoId(String cityGeoId) {
        this.cityGeoId = cityGeoId;
    }
public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
public void setPostalCodeExt(String postalCodeExt) {
        this.postalCodeExt = postalCodeExt;
    }
public void setCountryGeoId(String countryGeoId) {
        this.countryGeoId = countryGeoId;
    }
public void setStateProvinceGeoId(String stateProvinceGeoId) {
        this.stateProvinceGeoId = stateProvinceGeoId;
    }
public void setCountyGeoId(String countyGeoId) {
        this.countyGeoId = countyGeoId;
    }
public void setMunicipalityGeoId(String municipalityGeoId) {
        this.municipalityGeoId = municipalityGeoId;
    }
public void setPostalCodeGeoId(String postalCodeGeoId) {
        this.postalCodeGeoId = postalCodeGeoId;
    }
public void setGeoPointId(String geoPointId) {
        this.geoPointId = geoPointId;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }
public void setShipToCode(String shipToCode) {
        this.shipToCode = shipToCode;
    }

}
