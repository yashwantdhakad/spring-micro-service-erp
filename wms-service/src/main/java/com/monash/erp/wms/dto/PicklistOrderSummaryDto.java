package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PicklistOrderSummaryDto {

    private String picklistId;
    private String picklistBinId;
    private String statusId;
    private LocalDateTime createdDate;
    private String shipmentId;
    private List<PicklistOrderItemDto> items;
}
