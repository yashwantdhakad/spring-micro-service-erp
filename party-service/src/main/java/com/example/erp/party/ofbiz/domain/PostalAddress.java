package com.example.erp.party.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getAttnName() {
        return attnName;
    }

    public void setAttnName(String attnName) {
        this.attnName = attnName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseNumberExt() {
        return houseNumberExt;
    }

    public void setHouseNumberExt(String houseNumberExt) {
        this.houseNumberExt = houseNumberExt;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityGeoId() {
        return cityGeoId;
    }

    public void setCityGeoId(String cityGeoId) {
        this.cityGeoId = cityGeoId;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCodeExt() {
        return postalCodeExt;
    }

    public void setPostalCodeExt(String postalCodeExt) {
        this.postalCodeExt = postalCodeExt;
    }

    public String getCountryGeoId() {
        return countryGeoId;
    }

    public void setCountryGeoId(String countryGeoId) {
        this.countryGeoId = countryGeoId;
    }

    public String getStateProvinceGeoId() {
        return stateProvinceGeoId;
    }

    public void setStateProvinceGeoId(String stateProvinceGeoId) {
        this.stateProvinceGeoId = stateProvinceGeoId;
    }

    public String getCountyGeoId() {
        return countyGeoId;
    }

    public void setCountyGeoId(String countyGeoId) {
        this.countyGeoId = countyGeoId;
    }

    public String getMunicipalityGeoId() {
        return municipalityGeoId;
    }

    public void setMunicipalityGeoId(String municipalityGeoId) {
        this.municipalityGeoId = municipalityGeoId;
    }

    public String getPostalCodeGeoId() {
        return postalCodeGeoId;
    }

    public void setPostalCodeGeoId(String postalCodeGeoId) {
        this.postalCodeGeoId = postalCodeGeoId;
    }

    public String getGeoPointId() {
        return geoPointId;
    }

    public void setGeoPointId(String geoPointId) {
        this.geoPointId = geoPointId;
    }

}