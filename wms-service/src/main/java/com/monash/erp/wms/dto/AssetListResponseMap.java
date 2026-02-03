package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import com.monash.erp.wms.entity.InventoryItem;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AssetListResponseMap {

    private List<InventoryItem> resultList;
    private long total;
}
