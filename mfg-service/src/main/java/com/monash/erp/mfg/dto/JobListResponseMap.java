package com.monash.erp.mfg.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobListResponseMap {

    private List<JobListItem> resultList;
    private long total;
}
