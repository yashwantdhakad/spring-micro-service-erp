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
public class ApprovalType extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String approvalTypeId;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setApprovalTypeId(String approvalTypeId) {
        this.approvalTypeId = approvalTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
