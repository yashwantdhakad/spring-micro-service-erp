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
public class WebslingerServer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String webslingerServerId;
    private String delegatorName;
    private String dispatcherName;
    private String serverName;
    private String webSiteId;
    private String target;
    private String loadAtStart;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setWebslingerServerId(String webslingerServerId) {
        this.webslingerServerId = webslingerServerId;
    }
public void setDelegatorName(String delegatorName) {
        this.delegatorName = delegatorName;
    }
public void setDispatcherName(String dispatcherName) {
        this.dispatcherName = dispatcherName;
    }
public void setServerName(String serverName) {
        this.serverName = serverName;
    }
public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }
public void setTarget(String target) {
        this.target = target;
    }
public void setLoadAtStart(String loadAtStart) {
        this.loadAtStart = loadAtStart;
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
