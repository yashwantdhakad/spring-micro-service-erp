package com.monash.erp.wms.entity;

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
        name = "facility",
        indexes = {
                @Index(name = "idx_facility_facility_id", columnList = "facility_id"),
                @Index(name = "idx_facility_name", columnList = "facility_name")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String facilityId;
    private String facilityTypeId;
    private String parentFacilityId;
    private String ownerPartyId;
    private String defaultInventoryItemTypeId;
    private String facilityName;
    private String primaryFacilityGroupId;
    private String facilitySize;
    private String facilitySizeUomId;
    private String productStoreId;
    private String defaultDaysToShip;
    private LocalDateTime openedDate;
    private LocalDateTime closedDate;
    private String description;
    private String defaultDimensionUomId;
    private String defaultWeightUomId;
    private String geoPointId;
    private String facilityLevel;
public void setId(Long id) {
        this.id = id;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setFacilityTypeId(String facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
    }
public void setParentFacilityId(String parentFacilityId) {
        this.parentFacilityId = parentFacilityId;
    }
public void setOwnerPartyId(String ownerPartyId) {
        this.ownerPartyId = ownerPartyId;
    }
public void setDefaultInventoryItemTypeId(String defaultInventoryItemTypeId) {
        this.defaultInventoryItemTypeId = defaultInventoryItemTypeId;
    }
public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }
public void setPrimaryFacilityGroupId(String primaryFacilityGroupId) {
        this.primaryFacilityGroupId = primaryFacilityGroupId;
    }
public void setFacilitySize(String facilitySize) {
        this.facilitySize = facilitySize;
    }
public void setFacilitySizeUomId(String facilitySizeUomId) {
        this.facilitySizeUomId = facilitySizeUomId;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setDefaultDaysToShip(String defaultDaysToShip) {
        this.defaultDaysToShip = defaultDaysToShip;
    }
public void setOpenedDate(LocalDateTime openedDate) {
        this.openedDate = openedDate;
    }
public void setClosedDate(LocalDateTime closedDate) {
        this.closedDate = closedDate;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setDefaultDimensionUomId(String defaultDimensionUomId) {
        this.defaultDimensionUomId = defaultDimensionUomId;
    }
public void setDefaultWeightUomId(String defaultWeightUomId) {
        this.defaultWeightUomId = defaultWeightUomId;
    }
public void setGeoPointId(String geoPointId) {
        this.geoPointId = geoPointId;
    }
public void setFacilityLevel(String facilityLevel) {
        this.facilityLevel = facilityLevel;
    }

}
