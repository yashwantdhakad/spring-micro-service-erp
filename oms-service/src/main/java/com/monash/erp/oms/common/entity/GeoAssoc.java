package com.monash.erp.oms.common.entity;

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
public class GeoAssoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String geoId;

    private String geoIdTo;

    private String geoAssocTypeId;
public void setId(Long id) {
        this.id = id;
    }
public void setGeoId(String geoId) {
        this.geoId = geoId;
    }
public void setGeoIdTo(String geoIdTo) {
        this.geoIdTo = geoIdTo;
    }
public void setGeoAssocTypeId(String geoAssocTypeId) {
        this.geoAssocTypeId = geoAssocTypeId;
    }
}
