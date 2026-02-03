package com.monash.erp.wms.entity;

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
public class WebAnalyticsConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String webSiteId;
    private String webAnalyticsTypeId;
    private String webAnalyticsCode;
public void setId(Long id) {
        this.id = id;
    }
public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }
public void setWebAnalyticsTypeId(String webAnalyticsTypeId) {
        this.webAnalyticsTypeId = webAnalyticsTypeId;
    }
public void setWebAnalyticsCode(String webAnalyticsCode) {
        this.webAnalyticsCode = webAnalyticsCode;
    }

}
