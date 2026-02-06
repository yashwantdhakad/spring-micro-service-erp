package com.monash.erp.oms.order.controller;

import com.monash.erp.oms.order.dto.OrderAddressRequest;
import com.monash.erp.oms.order.dto.OrderContactMechDto;
import com.monash.erp.oms.order.dto.OrderContentDto;
import com.monash.erp.oms.order.dto.OrderCreateRequest;
import com.monash.erp.oms.order.dto.OrderDetailResponse;
import com.monash.erp.oms.order.dto.OrderDisplayInfoResponse;
import com.monash.erp.oms.order.dto.OrderHeaderDto;
import com.monash.erp.oms.order.dto.OrderItemDto;
import com.monash.erp.oms.order.dto.OrderItemQuantityUpdateRequest;
import com.monash.erp.oms.order.dto.OrderItemRequest;
import com.monash.erp.oms.order.dto.OrderListResponse;
import com.monash.erp.oms.order.dto.OrderNoteDto;
import com.monash.erp.oms.order.dto.OrderNoteRequest;
import com.monash.erp.oms.order.dto.OrderShippingInstructionRequest;
import com.monash.erp.oms.order.dto.OrderStatusChangeRequest;
import com.monash.erp.oms.order.dto.PurchaseOrderReceiveRequest;
import com.monash.erp.oms.order.dto.PurchaseOrderReceiveResponse;
import com.monash.erp.oms.order.dto.InvoiceSummaryDto;
import com.monash.erp.oms.order.dto.ReservationStatusDto;
import com.monash.erp.oms.order.dto.ReservedOrderItemDto;
import com.monash.erp.oms.order.dto.ReservedOrderSummaryDto;
import com.monash.erp.oms.order.service.OrderCompositeService;
import com.monash.erp.oms.order.service.OrderPdfService;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.net.URLConnection;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderCompositeController {

    private final OrderCompositeService orderCompositeService;
    private final OrderPdfService orderPdfService;

    public OrderCompositeController(OrderCompositeService orderCompositeService, OrderPdfService orderPdfService) {
        this.orderCompositeService = orderCompositeService;
        this.orderPdfService = orderPdfService;
    }

    @GetMapping
    public OrderListResponse listOrders(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(required = false) String queryString,
            @RequestParam(required = false) String orderTypeId,
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false) String sortDirection
    ) {
        return orderCompositeService.listOrders(page, size, queryString, orderTypeId, sortBy, sortDirection);
    }

    @GetMapping("/{orderId}")
    public OrderDetailResponse getOrder(@PathVariable String orderId) {
        return orderCompositeService.getOrder(orderId);
    }

    @GetMapping("/by-id/{id}")
    public OrderDetailResponse getOrderById(@PathVariable Long id) {
        return orderCompositeService.getOrderById(id);
    }

    @GetMapping("/{orderId}/display-info")
    public OrderDisplayInfoResponse getDisplayInfo(@PathVariable String orderId) {
        return orderCompositeService.getDisplayInfo(orderId);
    }

    @GetMapping("/by-id/{id}/display-info")
    public OrderDisplayInfoResponse getDisplayInfoById(@PathVariable Long id) {
        return orderCompositeService.getDisplayInfoById(id);
    }

    @GetMapping(value = "/{orderId}/pdf", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> getOrderPdf(@PathVariable String orderId) {
        byte[] pdf = orderPdfService.generateOrderPdf(orderId);
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_PDF)
                .body(pdf);
    }

    @PostMapping
    public ResponseEntity<OrderHeaderDto> createOrder(@RequestBody OrderCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(orderCompositeService.createOrder(request));
    }

    @PostMapping("/{orderId}/addresses")
    public ResponseEntity<OrderContactMechDto> addOrderAddress(
            @PathVariable String orderId,
            @RequestBody OrderAddressRequest request
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(orderCompositeService.addOrderAddress(orderId, request));
    }

    @PutMapping("/{orderId}/addresses/{contactMechId}")
    public OrderContactMechDto updateOrderAddress(
            @PathVariable String orderId,
            @PathVariable String contactMechId,
            @RequestBody OrderAddressRequest request
    ) {
        return orderCompositeService.updateOrderAddress(orderId, contactMechId, request);
    }

    @PostMapping("/{orderId}/items")
    public ResponseEntity<OrderItemDto> addItem(
            @PathVariable String orderId,
            @RequestBody OrderItemRequest request
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(orderCompositeService.addItem(orderId, request));
    }

    @PostMapping("/{orderId}/status")
    public OrderHeaderDto updateStatus(
            @PathVariable String orderId,
            @RequestBody OrderStatusChangeRequest request
    ) {
        return orderCompositeService.updateOrderStatus(orderId, request);
    }

    @PutMapping("/{orderId}/items/{orderItemSeqId}/quantity")
    public OrderItemDto updateItemQuantity(
            @PathVariable String orderId,
            @PathVariable String orderItemSeqId,
            @RequestBody OrderItemQuantityUpdateRequest request
    ) {
        return orderCompositeService.updateOrderItemQuantity(orderId, orderItemSeqId, request);
    }

    @PutMapping("/{orderId}/ship-groups/{shipGroupSeqId}/shipping-instructions")
    public ResponseEntity<Void> updateShippingInstructions(
            @PathVariable String orderId,
            @PathVariable String shipGroupSeqId,
            @RequestBody OrderShippingInstructionRequest request
    ) {
        orderCompositeService.updateShippingInstructions(orderId, shipGroupSeqId, request);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{orderId}/receive")
    public ResponseEntity<PurchaseOrderReceiveResponse> receive(
            @PathVariable String orderId,
            @RequestBody PurchaseOrderReceiveRequest request
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(orderCompositeService.receivePurchaseOrder(orderId, request));
    }

    @GetMapping("/{orderId}/reservation-status")
    public ReservationStatusDto reservationStatus(@PathVariable String orderId) {
        return orderCompositeService.getReservationStatus(orderId);
    }

    @GetMapping("/reserved")
    public List<ReservedOrderSummaryDto> listReservedOrders() {
        return orderCompositeService.listReservedOrders();
    }

    @GetMapping("/{orderId}/reserved-items")
    public List<ReservedOrderItemDto> listReservedOrderItems(@PathVariable String orderId) {
        return orderCompositeService.listReservedOrderItems(orderId);
    }

    @PostMapping("/backorders/reserve")
    public ReservationStatusDto reserveBackorders() {
        return orderCompositeService.reserveBackorders();
    }

    @PostMapping("/{orderId}/reservations/clear")
    public ResponseEntity<Void> clearReservations(@PathVariable String orderId) {
        orderCompositeService.clearReservations(orderId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{orderId}/picklist")
    public java.util.Map<String, String> createPicklist(@PathVariable String orderId) {
        return orderCompositeService.createSalesPicklist(orderId);
    }

    @PostMapping("/{orderId}/invoice-sales")
    public InvoiceSummaryDto createSalesInvoice(@PathVariable String orderId) {
        return orderCompositeService.createSalesInvoice(orderId);
    }

    @PostMapping("/{orderId}/complete-sales")
    public OrderHeaderDto completeSalesOrder(@PathVariable String orderId) {
        return orderCompositeService.completeSalesOrder(orderId);
    }

    @GetMapping("/{orderId}/invoices")
    public java.util.List<InvoiceSummaryDto> listInvoices(@PathVariable String orderId) {
        return orderCompositeService.listInvoices(orderId);
    }

    @PostMapping("/{orderId}/notes")
    public ResponseEntity<OrderNoteDto> addNote(
            @PathVariable String orderId,
            @RequestBody OrderNoteRequest request
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(orderCompositeService.addNote(orderId, request));
    }

    @PutMapping("/{orderId}/notes/{noteId}")
    public OrderNoteDto updateNote(
            @PathVariable String orderId,
            @PathVariable Long noteId,
            @RequestBody OrderNoteRequest request
    ) {
        return orderCompositeService.updateNote(orderId, noteId, request);
    }

    @PostMapping(value = "/{orderId}/contents", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<OrderContentDto> addContent(
            @PathVariable String orderId,
            @RequestPart("description") String description,
            @RequestPart("contentFile") MultipartFile contentFile
    ) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(orderCompositeService.addContent(orderId, description, contentFile));
    }

    @GetMapping("/{orderId}/contents/{contentId}")
    public ResponseEntity<Resource> getContent(
            @PathVariable String orderId,
            @PathVariable String contentId
    ) throws Exception {
        OrderCompositeService.OrderContentDownload download = orderCompositeService.loadOrderContent(orderId, contentId);
        Resource resource = new UrlResource(download.getFilePath().toUri());
        String fileName = download.getFileName();
        if (fileName == null || fileName.isBlank()) {
            fileName = contentId;
        }
        String contentType = URLConnection.guessContentTypeFromName(fileName);
        MediaType mediaType = contentType != null ? MediaType.parseMediaType(contentType) : MediaType.APPLICATION_OCTET_STREAM;

        return ResponseEntity.ok()
                .contentType(mediaType)
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + fileName + "\"")
                .body(resource);
    }
}
