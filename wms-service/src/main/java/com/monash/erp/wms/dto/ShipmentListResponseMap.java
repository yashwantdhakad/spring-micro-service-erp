package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShipmentListResponseMap {

    private List<ShipmentListItem> resultList;
    private long total;
}
