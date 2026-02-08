package com.monash.erp.mfg.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobListItem {

    private String workEffortId;
    private String workEffortName;
    private String facilityId;
    private String statusId;
    private LocalDateTime estimatedStartDate;
}
