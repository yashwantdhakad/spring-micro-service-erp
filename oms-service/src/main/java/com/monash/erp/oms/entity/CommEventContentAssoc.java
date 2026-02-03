package com.monash.erp.oms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class CommEventContentAssoc extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contentId;
    private String communicationEventId;
    private String commContentAssocTypeId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private BigDecimal sequenceNum;
public void setId(Long id) {
        this.id = id;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId;
    }
public void setCommContentAssocTypeId(String commContentAssocTypeId) {
        this.commContentAssocTypeId = commContentAssocTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

}
