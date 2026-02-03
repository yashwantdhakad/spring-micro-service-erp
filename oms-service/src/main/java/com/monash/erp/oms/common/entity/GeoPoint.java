package com.monash.erp.oms.common.entity;

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
public class GeoPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String geoPointId;

    private String geoPointTypeEnumId;

    private String description;

    private String dataSourceId;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private BigDecimal elevation;

    private String elevationUomId;

    private String information;
public void setId(Long id) {
        this.id = id;
    }
public void setGeoPointId(String geoPointId) {
        this.geoPointId = geoPointId;
    }
public void setGeoPointTypeEnumId(String geoPointTypeEnumId) {
        this.geoPointTypeEnumId = geoPointTypeEnumId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
public void setElevation(BigDecimal elevation) {
        this.elevation = elevation;
    }
public void setElevationUomId(String elevationUomId) {
        this.elevationUomId = elevationUomId;
    }
public void setInformation(String information) {
        this.information = information;
    }
}
