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
public class CustRequestCategory extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String custRequestCategoryId;
    private String custRequestTypeId;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setCustRequestCategoryId(String custRequestCategoryId) {
        this.custRequestCategoryId = custRequestCategoryId;
    }
public void setCustRequestTypeId(String custRequestTypeId) {
        this.custRequestTypeId = custRequestTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
