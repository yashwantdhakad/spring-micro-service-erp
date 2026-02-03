package com.monash.erp.oms.entity;

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
public class CommunicationEventPurpose extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String communicationEventPrpTypId;
    private String communicationEventId;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setCommunicationEventPrpTypId(String communicationEventPrpTypId) {
        this.communicationEventPrpTypId = communicationEventPrpTypId;
    }
public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
