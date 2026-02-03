package com.monash.erp.party.dto;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerListResponse {

    private List<CustomerSummary> resultList;
    private long documentListCount;
}
