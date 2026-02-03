package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import com.monash.erp.wms.entity.InventoryItem;
import com.monash.erp.wms.entity.InventoryItemDetail;
import com.monash.erp.wms.entity.ItemIssuance;
import com.monash.erp.wms.entity.ShipmentReceipt;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AssetDetailResponse {

    private InventoryItem asset;
    private List<InventoryItemDetail> details;
    private List<ShipmentReceipt> receipts;
    private List<ItemIssuance> issuances;
}
