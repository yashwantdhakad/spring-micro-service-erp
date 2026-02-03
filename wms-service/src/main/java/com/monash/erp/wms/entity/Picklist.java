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
        name = "picklist",
        indexes = {
                @Index(name = "idx_picklist_picklist_id", columnList = "picklist_id"),
                @Index(name = "idx_picklist_status_id", columnList = "status_id"),
                @Index(name = "idx_picklist_facility_id", columnList = "facility_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class Picklist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String picklistId;
    private String description;
    private String facilityId;
    private String shipmentMethodTypeId;
    private String statusId;
    private LocalDateTime picklistDate;
    private LocalDateTime createdDate;
    private String createdByUserLogin;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedByUserLogin;
public void setId(Long id) {
        this.id = id;
    }
public void setPicklistId(String picklistId) {
        this.picklistId = picklistId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setPicklistDate(LocalDateTime picklistDate) {
        this.picklistDate = picklistDate;
    }
public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

}
