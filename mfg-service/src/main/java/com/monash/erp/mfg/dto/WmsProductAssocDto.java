package com.monash.erp.mfg.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WmsProductAssocDto {

    private WmsProductSummary toProduct;
    private String quantity;
    private WmsProductAssocTypeDto type;
}
