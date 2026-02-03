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
public class AcctgTransEntryType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String acctgTransEntryTypeId;

    private String parentTypeId;

    private Boolean hasTable;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setAcctgTransEntryTypeId(String acctgTransEntryTypeId) {
        this.acctgTransEntryTypeId = acctgTransEntryTypeId;
    }
public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
public void setHasTable(Boolean hasTable) {
        this.hasTable = hasTable;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
