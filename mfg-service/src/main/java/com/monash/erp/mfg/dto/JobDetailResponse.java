package com.monash.erp.mfg.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import com.monash.erp.mfg.entity.WorkEffort;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobDetailResponse {

    private WorkEffort workEffort;
    private List<JobGoodStandardDto> produceList;
    private List<JobGoodStandardDto> consumeList;
    private List<WorkEffort> tasks;
}
