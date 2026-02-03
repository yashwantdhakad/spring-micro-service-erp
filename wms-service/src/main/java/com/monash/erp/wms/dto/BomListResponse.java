package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BomListResponse {
    private List<BomSummaryDto> documentList;
    private long documentListCount;
}
