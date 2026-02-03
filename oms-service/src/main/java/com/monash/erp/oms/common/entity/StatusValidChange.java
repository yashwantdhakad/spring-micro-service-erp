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
public class StatusValidChange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String statusId;

    private String statusIdTo;

    private String conditionExpression;

    private String transitionName;
public void setId(Long id) {
        this.id = id;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setStatusIdTo(String statusIdTo) {
        this.statusIdTo = statusIdTo;
    }
public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }
public void setTransitionName(String transitionName) {
        this.transitionName = transitionName;
    }
}
