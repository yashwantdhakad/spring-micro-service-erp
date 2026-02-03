package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BomSummaryDto {
    private String productId;
    private String productName;
    private String bomTypeId;
    private String bomTypeLabel;
}
