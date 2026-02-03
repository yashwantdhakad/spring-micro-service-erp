package com.monash.erp.oms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class AgreementProductAppl extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String agreementId;
    private String agreementItemSeqId;
    private String productId;
    private BigDecimal price;
    private String comments;
public void setId(Long id) {
        this.id = id;
    }
public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }
public void setAgreementItemSeqId(String agreementItemSeqId) {
        this.agreementItemSeqId = agreementItemSeqId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setPrice(BigDecimal price) {
        this.price = price;
    }
public void setComments(String comments) {
        this.comments = comments;
    }

}
