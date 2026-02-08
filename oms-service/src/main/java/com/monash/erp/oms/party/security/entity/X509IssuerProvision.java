package com.monash.erp.oms.party.security.entity;

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
public class X509IssuerProvision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String certProvisionId;

    private String commonName;

    private String organizationalUnit;

    private String organizationName;

    private String cityLocality;

    private String stateProvince;

    private String country;

    private String serialNumber;
public void setId(Long id) {
        this.id = id;
    }
public void setCertProvisionId(String certProvisionId) {
        this.certProvisionId = certProvisionId;
    }
public void setCommonName(String commonName) {
        this.commonName = commonName;
    }
public void setOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }
public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
public void setCityLocality(String cityLocality) {
        this.cityLocality = cityLocality;
    }
public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }
public void setCountry(String country) {
        this.country = country;
    }
public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
