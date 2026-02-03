package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

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
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
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

}
