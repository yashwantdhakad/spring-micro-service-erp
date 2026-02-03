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
public class WebSitePathAlias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String webSiteId;
    private String pathAlias;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String aliasTo;
    private String contentId;
    private String mapKey;
public void setId(Long id) {
        this.id = id;
    }
public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }
public void setPathAlias(String pathAlias) {
        this.pathAlias = pathAlias;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setAliasTo(String aliasTo) {
        this.aliasTo = aliasTo;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setMapKey(String mapKey) {
        this.mapKey = mapKey;
    }

}
