package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class CustRequestResolution extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String custRequestResolutionId;
    private String custRequestTypeId;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustRequestResolutionId() {
        return custRequestResolutionId;
    }

    public void setCustRequestResolutionId(String custRequestResolutionId) {
        this.custRequestResolutionId = custRequestResolutionId;
    }

    public String getCustRequestTypeId() {
        return custRequestTypeId;
    }

    public void setCustRequestTypeId(String custRequestTypeId) {
        this.custRequestTypeId = custRequestTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




}