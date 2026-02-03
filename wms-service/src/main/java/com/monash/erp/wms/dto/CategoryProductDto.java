package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryProductDto {

    private String productId;
    private ProductSummary product;
    private LocalDateTime fromDate;
    private String sequenceNum;
}
