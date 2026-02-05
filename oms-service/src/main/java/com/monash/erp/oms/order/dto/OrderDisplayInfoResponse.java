package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import com.monash.erp.oms.common.entity.StatusItem;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDisplayInfoResponse {

    private OrderHeaderDto orderHeader;
    private StatusItem statusItem;
    private List<OrderNoteDto> orderNoteList;
    private FirstPartInfoDto firstPartInfo;
    private FirstPartDto firstPart;
    private List<OrderRoleDto> orderRoleList;
    private List<OrderContactMechDto> orderContactMechList;
    private List<OrderAdjustmentDto> orderAdjustmentList;
    private List<OrderStatusDto> orderStatusList;
    private List<OrderTermDto> orderTermList;
    private List<OrderPaymentPreferenceDto> orderPaymentPreferenceList;
}
