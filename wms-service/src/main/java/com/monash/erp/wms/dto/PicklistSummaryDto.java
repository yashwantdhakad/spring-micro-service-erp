package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PicklistSummaryDto {

    private String picklistId;
    private String facilityId;
    private String statusId;
    private LocalDateTime createdDate;
    private String pickerId;
    private int orderCount;
    private int itemCount;
}
