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
public class GlAccountCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String glAccountCategoryId;

    private String glAccountCategoryTypeId;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setGlAccountCategoryId(String glAccountCategoryId) {
        this.glAccountCategoryId = glAccountCategoryId;
    }
public void setGlAccountCategoryTypeId(String glAccountCategoryTypeId) {
        this.glAccountCategoryTypeId = glAccountCategoryTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
