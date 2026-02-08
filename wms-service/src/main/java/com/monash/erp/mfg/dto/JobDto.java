package com.monash.erp.mfg.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class JobDto {
    private Long id;
    private String workEffortId;
    private String workEffortTypeId;
    private String currentStatusId;
    private LocalDateTime lastStatusUpdate;
    private String workEffortPurposeTypeId;
    private String workEffortParentId;
    private String scopeEnumId;
    private String priority;
    private String percentComplete;
    private String workEffortName;
    private String showAsEnumId;
    private String sendNotificationEmail;
    private String description;
    private String locationDesc;
    private LocalDateTime estimatedStartDate;
    private LocalDateTime estimatedCompletionDate;
    private LocalDateTime actualStartDate;
    private LocalDateTime actualCompletionDate;
    private String estimatedMilliSeconds;
    private String estimatedSetupMillis;
    private String estimateCalcMethod;
    private String actualMilliSeconds;
    private String actualSetupMillis;
    private String totalMilliSecondsAllowed;
    private String totalMoneyAllowed;
    private String moneyUomId;
    private String facilityId;
    private String quantityToProduce;
    private String quantityProduced;
    private String quantityRejected;
    private LocalDateTime createdDate;
}
