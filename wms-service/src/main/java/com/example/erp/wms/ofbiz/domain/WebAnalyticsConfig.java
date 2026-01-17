package com.example.erp.wms.ofbiz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WebAnalyticsConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String webSiteId;
    private String webAnalyticsTypeId;
    private String webAnalyticsCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWebSiteId() {
        return webSiteId;
    }

    public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }

    public String getWebAnalyticsTypeId() {
        return webAnalyticsTypeId;
    }

    public void setWebAnalyticsTypeId(String webAnalyticsTypeId) {
        this.webAnalyticsTypeId = webAnalyticsTypeId;
    }

    public String getWebAnalyticsCode() {
        return webAnalyticsCode;
    }

    public void setWebAnalyticsCode(String webAnalyticsCode) {
        this.webAnalyticsCode = webAnalyticsCode;
    }

}