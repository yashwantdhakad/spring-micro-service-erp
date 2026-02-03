package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductAssocRequest {

    private String toProductId;
    private String productAssocTypeEnumId;
    private String quantity;
    private LocalDateTime fromDate;
}
