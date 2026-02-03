package com.monash.erp.oms.accounting.entity;

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
public class GlAccountGroupMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String glAccountId;

    private String glAccountGroupTypeId;

    private String glAccountGroupId;
public void setId(Long id) {
        this.id = id;
    }
public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
public void setGlAccountGroupTypeId(String glAccountGroupTypeId) {
        this.glAccountGroupTypeId = glAccountGroupTypeId;
    }
public void setGlAccountGroupId(String glAccountGroupId) {
        this.glAccountGroupId = glAccountGroupId;
    }
}
