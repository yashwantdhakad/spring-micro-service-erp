package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PurchaseOrderReceiveRequest {

    private String orderId;
    private String facilityId;
    private String vendorPartyId;
    private String ownerPartyId;
    private String shipGroupSeqId;
    private String currencyUomId;
    private LocalDateTime receivedDate;
    private List<PurchaseOrderReceiveItemRequest> items;
}
