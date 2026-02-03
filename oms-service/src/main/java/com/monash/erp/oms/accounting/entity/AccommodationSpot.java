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
public class AccommodationSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accommodationSpotId;

    private String accommodationClassId;

    private String fixedAssetId;

    private BigDecimal numberOfSpaces;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setAccommodationSpotId(String accommodationSpotId) {
        this.accommodationSpotId = accommodationSpotId;
    }
public void setAccommodationClassId(String accommodationClassId) {
        this.accommodationClassId = accommodationClassId;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setNumberOfSpaces(BigDecimal numberOfSpaces) {
        this.numberOfSpaces = numberOfSpaces;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
