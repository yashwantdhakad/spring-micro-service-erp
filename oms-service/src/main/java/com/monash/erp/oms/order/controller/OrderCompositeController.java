package com.monash.erp.oms.order.controller;

import com.monash.erp.oms.order.dto.OrderContentDto;
import com.monash.erp.oms.order.dto.OrderCreateRequest;
import com.monash.erp.oms.order.dto.OrderDetailResponse;
import com.monash.erp.oms.order.dto.OrderDisplayInfoResponse;
import com.monash.erp.oms.order.dto.OrderHeaderDto;
import com.monash.erp.oms.order.dto.OrderItemDto;
import com.monash.erp.oms.order.dto.OrderItemRequest;
import com.monash.erp.oms.order.dto.OrderListResponse;
import com.monash.erp.oms.order.dto.OrderNoteDto;
import com.monash.erp.oms.order.dto.OrderNoteRequest;
import com.monash.erp.oms.order.service.OrderCompositeService;
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

@RestController
@RequestMapping("/api/orders")
public class OrderCompositeController {

    private final OrderCompositeService orderCompositeService;

    public OrderCompositeController(OrderCompositeService orderCompositeService) {
        this.orderCompositeService = orderCompositeService;
    }

    @GetMapping
    public OrderListResponse listOrders(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(required = false) String queryString,
            @RequestParam(required = false) String orderTypeId
    ) {
        return orderCompositeService.listOrders(page, size, queryString, orderTypeId);
    }

    @GetMapping("/{orderId}")
    public OrderDetailResponse getOrder(@PathVariable String orderId) {
        return orderCompositeService.getOrder(orderId);
    }

    @GetMapping("/{orderId}/display-info")
    public OrderDisplayInfoResponse getDisplayInfo(@PathVariable String orderId) {
        return orderCompositeService.getDisplayInfo(orderId);
    }

    @PostMapping
    public ResponseEntity<OrderHeaderDto> createOrder(@RequestBody OrderCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(orderCompositeService.createOrder(request));
    }

    @PostMapping("/{orderId}/items")
    public ResponseEntity<OrderItemDto> addItem(
            @PathVariable String orderId,
            @RequestBody OrderItemRequest request
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(orderCompositeService.addItem(orderId, request));
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
}
