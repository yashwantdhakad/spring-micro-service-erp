package com.monash.erp.mfg.entity;

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
public class MrpEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mrpId;
    private String productId;
    private LocalDateTime eventDate;
    private String mrpEventTypeId;
    private String facilityId;
    private String quantity;
    private String eventName;
    private String isLate;
    private String facilityIdTo;
public void setId(Long id) {
        this.id = id;
    }
public void setMrpId(String mrpId) {
        this.mrpId = mrpId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }
public void setMrpEventTypeId(String mrpEventTypeId) {
        this.mrpEventTypeId = mrpEventTypeId;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
public void setEventName(String eventName) {
        this.eventName = eventName;
    }
public void setIsLate(String isLate) {
        this.isLate = isLate;
    }
public void setFacilityIdTo(String facilityIdTo) {
        this.facilityIdTo = facilityIdTo;
    }

}
