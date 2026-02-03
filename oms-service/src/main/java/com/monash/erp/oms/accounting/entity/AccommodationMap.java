package com.monash.erp.oms.accounting.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class AccommodationMap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accommodationMapId;

    private String accommodationClassId;

    private String fixedAssetId;

    private String accommodationMapTypeId;

    private BigDecimal numberOfSpaces;
public void setId(Long id) {
        this.id = id;
    }
public void setAccommodationMapId(String accommodationMapId) {
        this.accommodationMapId = accommodationMapId;
    }
public void setAccommodationClassId(String accommodationClassId) {
        this.accommodationClassId = accommodationClassId;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setAccommodationMapTypeId(String accommodationMapTypeId) {
        this.accommodationMapTypeId = accommodationMapTypeId;
    }
public void setNumberOfSpaces(BigDecimal numberOfSpaces) {
        this.numberOfSpaces = numberOfSpaces;
    }
}
