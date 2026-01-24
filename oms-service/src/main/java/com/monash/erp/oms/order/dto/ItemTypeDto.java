package com.monash.erp.oms.order.dto;

public class ItemTypeDto {

    private String description;

    public ItemTypeDto() {
    }

    public ItemTypeDto(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
