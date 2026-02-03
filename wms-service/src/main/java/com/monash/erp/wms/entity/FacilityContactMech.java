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
        name = "facility_contact_mech",
        indexes = {
                @Index(name = "idx_facility_contact_mech_facility_id", columnList = "facility_id"),
                @Index(name = "idx_facility_contact_mech_contact_mech_id", columnList = "contact_mech_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class FacilityContactMech {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String facilityId;
    private String contactMechId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String extension;
    private String comments;
public void setId(Long id) {
        this.id = id;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setExtension(String extension) {
        this.extension = extension;
    }
public void setComments(String comments) {
        this.comments = comments;
    }

}
