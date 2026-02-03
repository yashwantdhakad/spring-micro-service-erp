package com.monash.erp.wms.entity;

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
public class PosTerminal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String posTerminalId;
    private String facilityId;
    private String pushEntitySyncId;
    private String terminalName;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setPosTerminalId(String posTerminalId) {
        this.posTerminalId = posTerminalId;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setPushEntitySyncId(String pushEntitySyncId) {
        this.pushEntitySyncId = pushEntitySyncId;
    }
public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}
