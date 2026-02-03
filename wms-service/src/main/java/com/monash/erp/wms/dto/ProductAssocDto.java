package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductAssocDto {

    private Long id;
    private ProductSummary product;
    private ProductSummary toProduct;
    private ProductAssocTypeDto type;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String sequenceNum;
    private String quantity;
}
