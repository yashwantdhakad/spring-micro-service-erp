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
public class CommContentAssocType extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String commContentAssocTypeId;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setCommContentAssocTypeId(String commContentAssocTypeId) {
        this.commContentAssocTypeId = commContentAssocTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
