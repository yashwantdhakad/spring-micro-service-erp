package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductCategoryDto {

    private String productCategoryId;
    private String categoryName;
    private String productCategoryTypeId;
    private LocalDateTime fromDate;
}
