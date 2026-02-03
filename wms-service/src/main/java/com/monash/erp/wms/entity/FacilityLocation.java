package com.monash.erp.wms.entity;

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
public class FacilityLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String facilityId;
    private String locationSeqId;
    private String locationTypeEnumId;
    private String areaId;
    private String aisleId;
    private String sectionId;
    private String levelId;
    private String positionId;
    private String geoPointId;
public void setId(Long id) {
        this.id = id;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }
public void setLocationTypeEnumId(String locationTypeEnumId) {
        this.locationTypeEnumId = locationTypeEnumId;
    }
public void setAreaId(String areaId) {
        this.areaId = areaId;
    }
public void setAisleId(String aisleId) {
        this.aisleId = aisleId;
    }
public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }
public void setLevelId(String levelId) {
        this.levelId = levelId;
    }
public void setPositionId(String positionId) {
        this.positionId = positionId;
    }
public void setGeoPointId(String geoPointId) {
        this.geoPointId = geoPointId;
    }

}
