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
public class AgreementType extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String agreementTypeId;
    private String parentTypeId;
    private String hasTable;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setAgreementTypeId(String agreementTypeId) {
        this.agreementTypeId = agreementTypeId;
    }
public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
