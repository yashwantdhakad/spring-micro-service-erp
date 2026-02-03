package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InventorySummaryDto {

    private String facilityId;
    private String facilityName;
    private BigDecimal atpTotal;
    private BigDecimal qohTotal;
}
