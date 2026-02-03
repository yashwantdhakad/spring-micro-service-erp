package com.monash.erp.mfg.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WmsAssetReceiveRequest {

    private String inventoryItemId;
    private String inventoryItemTypeId;
    private String productId;
    private String statusId;
    private String facilityId;
    private String locationSeqId;
    private LocalDateTime receivedDate;
    private String quantity;
    private String acquireCost;
    private String workEffortId;
}
