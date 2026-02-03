package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductContentDto {

    private String contentId;
    private String description;
    private String productContentTypeEnumId;
    private String contentLocation;
}
