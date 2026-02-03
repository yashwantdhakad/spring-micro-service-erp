package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PurchaseOrderReceiveRequest {

    private String facilityId;
    private String vendorPartyId;
    private String shipGroupSeqId;
    private LocalDateTime receivedDate;
    private List<PurchaseOrderReceiveItemRequest> items;
}
