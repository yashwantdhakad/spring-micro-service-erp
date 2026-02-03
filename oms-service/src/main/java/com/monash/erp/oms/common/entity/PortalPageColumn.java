package com.monash.erp.oms.common.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class PortalPageColumn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String portalPageId;

    private String columnSeqId;

    private BigDecimal columnWidthPixels;

    private BigDecimal columnWidthPercentage;
public void setId(Long id) {
        this.id = id;
    }
public void setPortalPageId(String portalPageId) {
        this.portalPageId = portalPageId;
    }
public void setColumnSeqId(String columnSeqId) {
        this.columnSeqId = columnSeqId;
    }
public void setColumnWidthPixels(BigDecimal columnWidthPixels) {
        this.columnWidthPixels = columnWidthPixels;
    }
public void setColumnWidthPercentage(BigDecimal columnWidthPercentage) {
        this.columnWidthPercentage = columnWidthPercentage;
    }
}
