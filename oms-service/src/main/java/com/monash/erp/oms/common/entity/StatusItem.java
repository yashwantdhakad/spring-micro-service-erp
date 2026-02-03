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
public class StatusItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String statusId;

    private String statusTypeId;

    private String statusCode;

    private String sequenceId;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setStatusTypeId(String statusTypeId) {
        this.statusTypeId = statusTypeId;
    }
public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
