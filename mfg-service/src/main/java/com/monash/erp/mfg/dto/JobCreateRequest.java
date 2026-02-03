package com.monash.erp.mfg.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobCreateRequest {

    private String purposeEnumId;
    private String workEffortName;
    private String facilityId;
    private LocalDateTime estimatedStartDate;
    private String estimatedWorkDuration;
    private String produceProductId;
    private String produceEstimatedQuantity;
    private String produceEstimatedAmount;
    private List<JobMaterialRequest> consumeItems;
}
