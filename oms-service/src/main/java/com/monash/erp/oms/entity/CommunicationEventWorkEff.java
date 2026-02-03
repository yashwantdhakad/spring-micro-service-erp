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
public class CommunicationEventWorkEff extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workEffortId;
    private String communicationEventId;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
