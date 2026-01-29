package com.monash.erp.oms.order.dto;

import java.time.LocalDateTime;

public class OrderContentDto {

    private String contentId;
    private String description;
    private LocalDateTime contentDate;
    private String contentLocation;

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getContentDate() {
        return contentDate;
    }

    public void setContentDate(LocalDateTime contentDate) {
        this.contentDate = contentDate;
    }

    public String getContentLocation() {
        return contentLocation;
    }

    public void setContentLocation(String contentLocation) {
        this.contentLocation = contentLocation;
    }
}
