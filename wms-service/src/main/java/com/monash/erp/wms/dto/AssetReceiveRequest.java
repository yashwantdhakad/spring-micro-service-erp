package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AssetReceiveRequest {

    private String inventoryItemId;
    private String inventoryItemTypeId;
    private String productId;
    private String statusId;
    private String facilityId;
    private String locationSeqId;
    private LocalDateTime receivedDate;
    private LocalDateTime manufacturedDate;
    private LocalDateTime expirationDate;
    private String vendorPartyId;
    private String quantity;
    private String acquireCost;
    private String comments;
    private String currencyUomId;
    private String shipmentId;
    private String orderId;
    private String orderItemSeqId;
    private String shipGroupSeqId;
    private String shipmentItemSeqId;
    private String workEffortId;
}
