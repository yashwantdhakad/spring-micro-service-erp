package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GlAccountGroupMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String glAccountId;

    private String glAccountGroupTypeId;

    private String glAccountGroupId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }

    public String getGlAccountGroupTypeId() {
        return glAccountGroupTypeId;
    }

    public void setGlAccountGroupTypeId(String glAccountGroupTypeId) {
        this.glAccountGroupTypeId = glAccountGroupTypeId;
    }

    public String getGlAccountGroupId() {
        return glAccountGroupId;
    }

    public void setGlAccountGroupId(String glAccountGroupId) {
        this.glAccountGroupId = glAccountGroupId;
    }
}
