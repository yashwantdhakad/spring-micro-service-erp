package com.monash.erp.mfg.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WmsItemIssuanceRequest {

    private String itemIssuanceId;
    private String inventoryItemId;
    private String workEffortId;
    private LocalDateTime issuedDateTime;
    private String issuedByUserLoginId;
    private String quantity;
    private String wegsReferenceNumber;
}
