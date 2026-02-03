package com.monash.erp.mfg.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobProduceRequest {

    private String productId;
    private String quantity;
    private String locationSeqId;
}
