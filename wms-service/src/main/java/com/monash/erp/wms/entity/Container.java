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
public class Container {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String containerId;
    private String containerTypeId;
    private String facilityId;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setContainerId(String containerId) {
        this.containerId = containerId;
    }
public void setContainerTypeId(String containerTypeId) {
        this.containerTypeId = containerTypeId;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
