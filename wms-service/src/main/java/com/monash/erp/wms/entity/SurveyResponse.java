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
public class SurveyResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surveyResponseId;
    private String surveyId;
    private String partyId;
    private LocalDateTime responseDate;
    private LocalDateTime lastModifiedDate;
    private String referenceId;
    private String generalFeedback;
    private String orderId;
    private String orderItemSeqId;
    private String statusId;
public void setId(Long id) {
        this.id = id;
    }
public void setSurveyResponseId(String surveyResponseId) {
        this.surveyResponseId = surveyResponseId;
    }
public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setResponseDate(LocalDateTime responseDate) {
        this.responseDate = responseDate;
    }
public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }
public void setGeneralFeedback(String generalFeedback) {
        this.generalFeedback = generalFeedback;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

}
