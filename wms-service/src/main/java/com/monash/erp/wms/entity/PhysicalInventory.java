package com.monash.erp.wms.entity;

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
public class PhysicalInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String physicalInventoryId;
    private LocalDateTime physicalInventoryDate;
    private String partyId;
    private String generalComments;
public void setId(Long id) {
        this.id = id;
    }
public void setPhysicalInventoryId(String physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }
public void setPhysicalInventoryDate(LocalDateTime physicalInventoryDate) {
        this.physicalInventoryDate = physicalInventoryDate;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setGeneralComments(String generalComments) {
        this.generalComments = generalComments;
    }

}
