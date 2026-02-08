package com.monash.erp.wms.service;

import com.monash.erp.wms.dto.BulkSalesOrderPicklistRequest;
import com.monash.erp.wms.dto.SalesOrderPicklistRequest;
import com.monash.erp.wms.dto.SalesOrderPicklistItemRequest;
import com.monash.erp.wms.dto.SalesOrderPicklistResponse;
import com.monash.erp.wms.entity.Picklist;
import com.monash.erp.wms.entity.PicklistBin;
import com.monash.erp.wms.entity.Shipment;
import com.monash.erp.wms.repository.PicklistRepository;
import com.monash.erp.wms.repository.PicklistBinRepository;
import com.monash.erp.wms.repository.ShipmentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class BulkPicklistCreationTest {

    @Autowired
    private SalesOrderFulfillmentService service;

    @MockitoBean
    private PicklistRepository picklistRepository;

    @MockitoBean
    private PicklistBinRepository picklistBinRepository;

    @MockitoBean
    private ShipmentRepository shipmentRepository;

    @Test
    public void testCreateBulkPicklist() {
        // Mock repositories
        Picklist mockPicklist = new Picklist();
        mockPicklist.setPicklistId("10001");
        when(picklistRepository.save(any(Picklist.class))).thenReturn(mockPicklist);

        PicklistBin mockBin1 = new PicklistBin();
        mockBin1.setPicklistBinId("BIN001");
        when(picklistBinRepository.save(any(PicklistBin.class))).thenReturn(mockBin1);

        Shipment mockShipment = new Shipment();
        mockShipment.setShipmentId("SHIP001");
        when(shipmentRepository.save(any(Shipment.class))).thenReturn(mockShipment);

        // Create request
        BulkSalesOrderPicklistRequest request = new BulkSalesOrderPicklistRequest();
        request.setFacilityId("FAC1");

        List<SalesOrderPicklistRequest> orders = new ArrayList<>();

        SalesOrderPicklistRequest order1 = new SalesOrderPicklistRequest();
        order1.setOrderId("ORD001");
        order1.setFacilityId("FAC1");
        List<SalesOrderPicklistItemRequest> items1 = new ArrayList<>();
        SalesOrderPicklistItemRequest item1 = new SalesOrderPicklistItemRequest();
        item1.setOrderItemSeqId("001");
        item1.setProductId("PROD1");
        item1.setQuantity(new BigDecimal("10"));
        items1.add(item1);
        order1.setItems(items1);
        orders.add(order1);

        request.setOrders(orders);

        // Execute service
        SalesOrderPicklistResponse response = service.createBulkPicklist(request);

        // Assert
        assertNotNull(response);
        assertEquals("10001", response.getPicklistId());
    }
}
