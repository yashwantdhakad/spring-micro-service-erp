package com.monash.erp.oms.order.service;

import com.monash.erp.oms.common.entity.Geo;
import com.monash.erp.oms.common.entity.StatusItem;
import com.monash.erp.oms.common.repository.GeoRepository;
import com.monash.erp.oms.common.repository.StatusItemRepository;
import com.monash.erp.oms.order.dto.CustomerPartyDto;
import com.monash.erp.oms.order.dto.FacilityContactInfoDto;
import com.monash.erp.oms.order.dto.FacilityDto;
import com.monash.erp.oms.order.dto.FirstPartDto;
import com.monash.erp.oms.order.dto.FirstPartInfoDto;
import com.monash.erp.oms.order.dto.GeoDto;
import com.monash.erp.oms.order.dto.InvoiceItemSummaryDto;
import com.monash.erp.oms.order.dto.InvoiceSummaryDto;
import com.monash.erp.oms.order.dto.ItemTypeDto;
import com.monash.erp.oms.order.dto.OrderAdjustmentDto;
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
import com.monash.erp.oms.order.dto.OrderListItem;
import com.monash.erp.oms.order.dto.OrderListResponse;
import com.monash.erp.oms.order.dto.OrderListResponseMap;
import com.monash.erp.oms.order.dto.OrderNoteDto;
import com.monash.erp.oms.order.dto.OrderNoteRequest;
import com.monash.erp.oms.order.dto.OrderPartDto;
import com.monash.erp.oms.order.dto.OrderPaymentPreferenceDto;
import com.monash.erp.oms.order.dto.OrderRoleDto;
import com.monash.erp.oms.order.dto.OrderShippingInstructionRequest;
import com.monash.erp.oms.order.dto.OrderStatusChangeRequest;
import com.monash.erp.oms.order.dto.OrderStatusDto;
import com.monash.erp.oms.order.dto.OrderTermDto;
import com.monash.erp.oms.order.dto.OrganizationDto;
import com.monash.erp.oms.order.dto.PostalAddressDto;
import com.monash.erp.oms.order.dto.ProductDto;
import com.monash.erp.oms.order.dto.PurchaseOrderReceiveItemRequest;
import com.monash.erp.oms.order.dto.PurchaseOrderReceiveRequest;
import com.monash.erp.oms.order.dto.PurchaseOrderReceiveResponse;
import com.monash.erp.oms.order.dto.PurchaseOrderReceiptDto;
import com.monash.erp.oms.order.dto.ReservationStatusDto;
import com.monash.erp.oms.order.dto.ReservedOrderItemDto;
import com.monash.erp.oms.order.dto.ReservedOrderSummaryDto;
import com.monash.erp.oms.accounting.entity.AcctgTrans;
import com.monash.erp.oms.accounting.entity.AcctgTransEntry;
import com.monash.erp.oms.accounting.entity.Invoice;
import com.monash.erp.oms.accounting.entity.InvoiceItem;
import com.monash.erp.oms.accounting.repository.AcctgTransEntryRepository;
import com.monash.erp.oms.accounting.repository.AcctgTransRepository;
import com.monash.erp.oms.accounting.repository.InvoiceItemRepository;
import com.monash.erp.oms.accounting.repository.InvoiceRepository;
import com.monash.erp.oms.entity.OrderAdjustment;
import com.monash.erp.oms.entity.OrderContactMech;
import com.monash.erp.oms.entity.OrderContent;
import com.monash.erp.oms.order.entity.OrderContentInfo;
import com.monash.erp.oms.entity.OrderHeader;
import com.monash.erp.oms.entity.OrderItem;
import com.monash.erp.oms.entity.OrderItemShipGrpInvRes;
import com.monash.erp.oms.entity.OrderItemShipGroup;
import com.monash.erp.oms.order.entity.OrderItemShipGroupAssoc;
import com.monash.erp.oms.order.entity.OrderNote;
import com.monash.erp.oms.entity.OrderItemBilling;
import com.monash.erp.oms.entity.OrderRole;
import com.monash.erp.oms.entity.OrderStatus;
import com.monash.erp.oms.order.entity.PostalAddress;
import com.monash.erp.oms.order.repository.OrderAdjustmentRepository;
import com.monash.erp.oms.order.repository.OrderContactMechRepository;
import com.monash.erp.oms.order.repository.OrderContentInfoRepository;
import com.monash.erp.oms.order.repository.OrderContentRepository;
import com.monash.erp.oms.order.repository.OrderHeaderRepository;
import com.monash.erp.oms.order.repository.OrderItemRepository;
import com.monash.erp.oms.order.repository.OrderItemShipGrpInvResRepository;
import com.monash.erp.oms.order.repository.OrderItemShipGroupAssocRepository;
import com.monash.erp.oms.order.repository.OrderItemShipGroupRepository;
import com.monash.erp.oms.order.repository.OrderNoteRepository;
import com.monash.erp.oms.order.repository.OrderRoleRepository;
import com.monash.erp.oms.order.repository.OrderStatusRepository;
import com.monash.erp.oms.order.repository.PostalAddressRepository;
import com.monash.erp.oms.order.repository.OrderItemBillingRepository;
import com.monash.erp.oms.repository.OrderPaymentPreferenceRepository;
import com.monash.erp.oms.repository.OrderTermRepository;
import com.monash.erp.oms.entity.OrderPaymentPreference;
import com.monash.erp.oms.entity.OrderTerm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class OrderCompositeService {

    private static final String DEFAULT_STATUS = "ORDER_CREATED";
    private static final String STATUS_CREATED = "ORDER_CREATED";
    private static final String DEFAULT_ITEM_STATUS = "ITEM_CREATED";
    private static final String DEFAULT_CURRENCY = "USD";
    private static final String ROLE_BILL_TO_CUSTOMER = "BILL_TO_CUSTOMER";
    private static final String ROLE_BILL_FROM_VENDOR = "BILL_FROM_VENDOR";
    private static final String ROLE_SHIP_TO_CUSTOMER = "SHIP_TO_CUSTOMER";
    private static final String ROLE_PLACING_CUSTOMER = "PLACING_CUSTOMER";
    private static final String ROLE_END_USER_CUSTOMER = "END_USER_CUSTOMER";
    private static final String ROLE_SHIP_FROM_VENDOR = "SHIP_FROM_VENDOR";
    private static final String ROLE_SUPPLIER_AGENT = "SUPPLIER_AGENT";
    private static final String PURPOSE_SHIPPING = "SHIPPING_LOCATION";
    private static final String PURPOSE_BILLING = "BILLING_LOCATION";
    private static final String STATUS_APPROVED = "ORDER_APPROVED";
    private static final String STATUS_COMPLETED = "ORDER_COMPLETED";
    private static final String ITEM_APPROVED = "ITEM_APPROVED";
    private static final String ITEM_COMPLETED = "ITEM_COMPLETED";
    private static final String RESERVE_ORDER_ENUM = "INVRO_FIFO_REC";
    private static final String ADJ_TYPE_SHIPPING = "SHIPPING_CHARGES";
    private static final String ADJ_TYPE_DISCOUNT = "DISCOUNT_ADJUSTMENT";
    private static final String INVOICE_TYPE_PURCHASE = "PURCHASE_INVOICE";
    private static final String INVOICE_STATUS_READY = "INVOICE_READY";
    private static final String ACCTG_TRANS_TYPE_PURCHASE = "PURCHASE_INVOICE";
    private static final String INVOICE_TYPE_SALES = "SALES_INVOICE";
    private static final String ACCTG_TRANS_TYPE_SALES = "SALES_INVOICE";
    private static final String GL_ACCOUNT_UNINVOICED = "214000";
    private static final String GL_ACCOUNT_AP = "210000";
    private static final String GL_ACCOUNT_AR = "120000";
    private static final String GL_ACCOUNT_SALES = "400000";
    private static final String ORG_PARTY_ID = "Company";
    private static final Path ORDER_CONTENT_DIR = Paths.get("data", "uploads", "order-contents");

    private final OrderHeaderRepository orderHeaderRepository;
    private final OrderItemRepository orderItemRepository;
    private final OrderItemShipGroupRepository orderItemShipGroupRepository;
    private final OrderItemShipGroupAssocRepository orderItemShipGroupAssocRepository;
    private final OrderItemShipGrpInvResRepository orderItemShipGrpInvResRepository;
    private final OrderRoleRepository orderRoleRepository;
    private final OrderContentRepository orderContentRepository;
    private final OrderContentInfoRepository orderContentInfoRepository;
    private final OrderNoteRepository orderNoteRepository;
    private final StatusItemRepository statusItemRepository;
    private final OrderAdjustmentRepository orderAdjustmentRepository;
    private final OrderContactMechRepository orderContactMechRepository;
    private final OrderStatusRepository orderStatusRepository;
    private final PostalAddressRepository postalAddressRepository;
    private final GeoRepository geoRepository;
    private final OrderItemBillingRepository orderItemBillingRepository;
    private final InvoiceRepository invoiceRepository;
    private final InvoiceItemRepository invoiceItemRepository;
    private final AcctgTransRepository acctgTransRepository;
    private final AcctgTransEntryRepository acctgTransEntryRepository;
    private final OrderPaymentPreferenceRepository orderPaymentPreferenceRepository;
    private final OrderTermRepository orderTermRepository;
    private final RestTemplate restTemplate;
    private final String wmsBaseUrl;

    public OrderCompositeService(
            OrderHeaderRepository orderHeaderRepository,
            OrderItemRepository orderItemRepository,
            OrderItemShipGroupRepository orderItemShipGroupRepository,
            OrderItemShipGroupAssocRepository orderItemShipGroupAssocRepository,
            OrderRoleRepository orderRoleRepository,
            OrderContentRepository orderContentRepository,
            OrderContentInfoRepository orderContentInfoRepository,
            OrderNoteRepository orderNoteRepository,
            StatusItemRepository statusItemRepository,
            OrderAdjustmentRepository orderAdjustmentRepository,
            OrderContactMechRepository orderContactMechRepository,
            OrderStatusRepository orderStatusRepository,
            PostalAddressRepository postalAddressRepository,
            GeoRepository geoRepository,
            OrderItemBillingRepository orderItemBillingRepository,
            OrderItemShipGrpInvResRepository orderItemShipGrpInvResRepository,
            InvoiceRepository invoiceRepository,
            InvoiceItemRepository invoiceItemRepository,
            AcctgTransRepository acctgTransRepository,
            AcctgTransEntryRepository acctgTransEntryRepository,
            OrderPaymentPreferenceRepository orderPaymentPreferenceRepository,
            OrderTermRepository orderTermRepository,
            RestTemplate restTemplate,
            @Value("${wms.base-url}") String wmsBaseUrl) {
        this.orderHeaderRepository = orderHeaderRepository;
        this.orderItemRepository = orderItemRepository;
        this.orderItemShipGroupRepository = orderItemShipGroupRepository;
        this.orderItemShipGroupAssocRepository = orderItemShipGroupAssocRepository;
        this.orderItemShipGrpInvResRepository = orderItemShipGrpInvResRepository;
        this.orderRoleRepository = orderRoleRepository;
        this.orderContentRepository = orderContentRepository;
        this.orderContentInfoRepository = orderContentInfoRepository;
        this.orderNoteRepository = orderNoteRepository;
        this.statusItemRepository = statusItemRepository;
        this.orderAdjustmentRepository = orderAdjustmentRepository;
        this.orderContactMechRepository = orderContactMechRepository;
        this.orderStatusRepository = orderStatusRepository;
        this.postalAddressRepository = postalAddressRepository;
        this.geoRepository = geoRepository;
        this.orderItemBillingRepository = orderItemBillingRepository;
        this.invoiceRepository = invoiceRepository;
        this.invoiceItemRepository = invoiceItemRepository;
        this.acctgTransRepository = acctgTransRepository;
        this.acctgTransEntryRepository = acctgTransEntryRepository;
        this.orderPaymentPreferenceRepository = orderPaymentPreferenceRepository;
        this.orderTermRepository = orderTermRepository;
        this.restTemplate = restTemplate;
        this.wmsBaseUrl = wmsBaseUrl;
    }

    public OrderListResponse listOrders(int page, int size, String queryString, String orderTypeId, String sortBy,
            String sortDirection) {
        PageRequest pageable = PageRequest.of(Math.max(page, 0), size, buildOrderSort(sortBy, sortDirection));
        Page<OrderHeader> orders = loadOrders(queryString, orderTypeId, pageable);

        List<OrderHeader> headers = orders.getContent();
        if (headers.isEmpty()) {
            return new OrderListResponse(new OrderListResponseMap(List.of(), orders.getTotalElements()));
        }

        List<String> orderIds = headers.stream()
                .map(OrderHeader::getOrderId)
                .filter(value -> !isBlank(value))
                .collect(Collectors.toList());

        Map<String, OrderItemRepository.OrderItemAggregate> aggregates = orderItemRepository
                .findAggregatesByOrderIdIn(orderIds)
                .stream()
                .collect(Collectors.toMap(OrderItemRepository.OrderItemAggregate::getOrderId, aggregate -> aggregate));

        Map<String, OrderItemShipGroup> shipGroupMap = orderItemShipGroupRepository.findByOrderIdIn(orderIds).stream()
                .filter(group -> !isBlank(group.getOrderId()))
                .collect(Collectors.toMap(
                        OrderItemShipGroup::getOrderId,
                        group -> group,
                        (left, right) -> left));

        Map<String, OrderRole> billToRoles = orderRoleRepository
                .findByOrderIdInAndRoleTypeId(orderIds, ROLE_BILL_TO_CUSTOMER)
                .stream()
                .filter(role -> !isBlank(role.getOrderId()))
                .collect(Collectors.toMap(OrderRole::getOrderId, role -> role, (left, right) -> left));

        List<OrderListItem> items = headers.stream()
                .map(order -> toListItem(order, aggregates, shipGroupMap, billToRoles))
                .collect(Collectors.toList());

        OrderListResponseMap responseMap = new OrderListResponseMap(items, orders.getTotalElements());
        return new OrderListResponse(responseMap);
    }

    public OrderDetailResponse getOrder(String orderId) {
        OrderHeader header = getOrderHeader(orderId);
        List<OrderContentDto> contents = orderContentInfoRepository.findByOrderId(orderId).stream()
                .map(this::toContentDto)
                .collect(Collectors.toList());

        Map<String, BigDecimal> receivedQuantities = fetchReceivedQuantities(orderId);
        Map<String, BigDecimal> pickedQuantities = fetchPickedQuantities(orderId);
        Map<String, BigDecimal> reservedQuantities = fetchReservedQuantities(orderId);
        List<OrderPartDto> parts = buildParts(orderId, header, receivedQuantities, pickedQuantities,
                reservedQuantities);
        List<OrderAdjustmentDto> adjustments = orderAdjustmentRepository.findByOrderId(orderId).stream()
                .map(this::toAdjustmentDto)
                .collect(Collectors.toList());

        OrderDetailResponse response = new OrderDetailResponse();
        response.setParts(parts);
        response.setContents(contents);
        response.setAdjustments(adjustments);
        return response;
    }

    public OrderDetailResponse getOrderById(Long id) {
        OrderHeader header = getOrderHeaderById(id);
        return getOrder(header.getOrderId());
    }

    public OrderDisplayInfoResponse getDisplayInfo(String orderId) {
        OrderHeader header = getOrderHeader(orderId);
        OrderHeaderDto headerDto = toHeaderDto(header);
        StatusItem statusItem = resolveStatus(header.getStatusId());

        List<OrderNoteDto> notes = orderNoteRepository.findByOrderId(orderId).stream()
                .map(this::toNoteDto)
                .collect(Collectors.toList());

        List<OrderRoleDto> roles = orderRoleRepository.findByOrderId(orderId).stream()
                .map(role -> new OrderRoleDto(role.getPartyId(), role.getRoleTypeId()))
                .collect(Collectors.toList());

        List<OrderContactMechDto> contactMechs = buildOrderContactMechs(orderId);
        List<OrderAdjustmentDto> adjustments = orderAdjustmentRepository.findByOrderId(orderId).stream()
                .map(this::toAdjustmentDto)
                .collect(Collectors.toList());
        List<OrderStatusDto> statuses = orderStatusRepository.findByOrderIdOrderByStatusDatetimeAsc(orderId).stream()
                .map(this::toStatusDto)
                .collect(Collectors.toList());
        List<OrderTermDto> terms = orderTermRepository.findByOrderId(orderId).stream()
                .map(this::toOrderTermDto)
                .collect(Collectors.toList());
        List<OrderPaymentPreferenceDto> paymentPreferences = orderPaymentPreferenceRepository.findByOrderId(orderId)
                .stream()
                .map(this::toOrderPaymentPreferenceDto)
                .collect(Collectors.toList());

        FirstPartDto firstPart = buildFirstPart(orderId);
        FirstPartInfoDto firstPartInfo = new FirstPartInfoDto();
        resolveShipFromContact(contactMechs).ifPresent(firstPartInfo::setFacilityContactInfo);

        OrderDisplayInfoResponse response = new OrderDisplayInfoResponse();
        response.setOrderHeader(headerDto);
        response.setStatusItem(statusItem);
        response.setOrderNoteList(notes);
        response.setFirstPart(firstPart);
        response.setFirstPartInfo(firstPartInfo);
        response.setOrderRoleList(roles);
        response.setOrderContactMechList(contactMechs);
        response.setOrderAdjustmentList(adjustments);
        response.setOrderStatusList(statuses);
        response.setOrderTermList(terms);
        response.setOrderPaymentPreferenceList(paymentPreferences);
        return response;
    }

    public OrderDisplayInfoResponse getDisplayInfoById(Long id) {
        OrderHeader header = getOrderHeaderById(id);
        return getDisplayInfo(header.getOrderId());
    }

    public OrderHeaderDto createOrder(OrderCreateRequest request) {
        OrderHeader header = new OrderHeader();
        header.setOrderTypeId(request.getOrderTypeEnumId());
        header.setEntryDate(LocalDateTime.now());
        header.setStatusId(DEFAULT_STATUS);
        header.setProductStoreId(request.getProductStoreId());
        header.setOriginFacilityId(request.getFacilityId());
        if (!isBlank(request.getPoNumber())) {
            header.setOrderName(request.getPoNumber());
        }
        header.setCurrencyUom(DEFAULT_CURRENCY);
        header.setGrandTotal(BigDecimal.ZERO);
        header = orderHeaderRepository.save(header);

        header.setOrderId(String.valueOf(header.getId()));
        header = orderHeaderRepository.save(header);

        if (!isBlank(request.getCustomerPartyId())) {
            addRole(header.getOrderId(), request.getCustomerPartyId(), ROLE_BILL_TO_CUSTOMER);
            addRole(header.getOrderId(), request.getCustomerPartyId(), ROLE_SHIP_TO_CUSTOMER);
            addRole(header.getOrderId(), request.getCustomerPartyId(), ROLE_PLACING_CUSTOMER);
            addRole(header.getOrderId(), request.getCustomerPartyId(), ROLE_END_USER_CUSTOMER);
        }

        if (!isBlank(request.getVendorPartyId())) {
            addRole(header.getOrderId(), request.getVendorPartyId(), ROLE_BILL_FROM_VENDOR);
            addRole(header.getOrderId(), request.getVendorPartyId(), ROLE_SHIP_FROM_VENDOR);
            addRole(header.getOrderId(), request.getVendorPartyId(), ROLE_SUPPLIER_AGENT);
        }

        OrderItemShipGroup shipGroup = new OrderItemShipGroup();
        shipGroup.setOrderId(header.getOrderId());
        shipGroup.setShipGroupSeqId("00001");
        shipGroup.setVendorPartyId(request.getVendorPartyId());
        shipGroup.setFacilityId(request.getFacilityId());
        shipGroup.setShipByDate(request.getShipBeforeDate());
        shipGroup.setEstimatedDeliveryDate(request.getEstimatedDeliveryDate());
        if (!isBlank(request.getShippingInstructions())) {
            shipGroup.setShippingInstructions(request.getShippingInstructions());
        }
        applyShipByMethod(shipGroup, request.getShipByMethod());
        orderItemShipGroupRepository.save(shipGroup);

        applyOrderAdjustments(header, request);
        createOrderTerm(header.getOrderId(), request);
        createOrderPaymentPreference(header.getOrderId(), request);

        if (request.getShippingAddress() != null) {
            attachOrderAddress(header.getOrderId(), request.getShippingAddress(), PURPOSE_SHIPPING, true);
        }

        if (request.getBillingAddress() != null) {
            attachOrderAddress(header.getOrderId(), request.getBillingAddress(), PURPOSE_BILLING, false);
        }

        OrderStatus status = new OrderStatus();
        status.setOrderId(header.getOrderId());
        status.setStatusId(DEFAULT_STATUS);
        status.setStatusDatetime(LocalDateTime.now());
        status.setStatusUserLogin("system");
        orderStatusRepository.save(status);

        return toHeaderDto(header);
    }

    public OrderContactMechDto addOrderAddress(String orderId, OrderAddressRequest request) {
        OrderContactMechDto created = attachOrderAddress(orderId, request, PURPOSE_SHIPPING, true);
        if (created == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Address payload is required");
        }
        return created;
    }

    public OrderContactMechDto updateOrderAddress(String orderId, String contactMechId, OrderAddressRequest request) {
        OrderAddressRequest payload = request == null ? new OrderAddressRequest() : request;
        payload.setContactMechId(firstNonBlank(payload.getContactMechId(), contactMechId));
        OrderContactMechDto updated = attachOrderAddress(orderId, payload, PURPOSE_SHIPPING, true);
        if (updated == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Address payload is required");
        }
        return updated;
    }

    public OrderItemDto addItem(String orderId, OrderItemRequest request) {
        OrderHeader header = getOrderHeader(orderId);

        String nextSeqId = nextOrderItemSeqId(orderId);
        OrderItem item = new OrderItem();
        item.setOrderId(orderId);
        item.setOrderItemSeqId(nextSeqId);
        item.setProductId(request.getProductId());
        item.setQuantity(defaultIfNull(request.getQuantity(), BigDecimal.ONE));
        item.setUnitPrice(defaultIfNull(request.getUnitAmount(), BigDecimal.ZERO));
        item.setItemDescription(request.getItemDescription());
        item.setOrderItemTypeId(request.getItemTypeEnumId());
        item.setShipBeforeDate(request.getShipBeforeDate());
        String itemStatusId = DEFAULT_ITEM_STATUS;
        if (STATUS_APPROVED.equals(header.getStatusId())) {
            itemStatusId = ITEM_APPROVED;
        }

        item.setStatusId(itemStatusId);
        orderItemRepository.save(item);

        String shipGroupSeqId = isBlank(request.getOrderPartSeqId()) ? "00001" : request.getOrderPartSeqId();
        OrderItemShipGroupAssoc assoc = new OrderItemShipGroupAssoc();
        assoc.setOrderId(orderId);
        assoc.setOrderItemSeqId(nextSeqId);
        assoc.setShipGroupSeqId(shipGroupSeqId);
        assoc.setQuantity(item.getQuantity());
        orderItemShipGroupAssocRepository.save(assoc);

        OrderStatus itemStatus = new OrderStatus();
        itemStatus.setOrderId(orderId);
        itemStatus.setOrderItemSeqId(nextSeqId);
        itemStatus.setStatusId(itemStatusId);
        itemStatus.setStatusDatetime(LocalDateTime.now());
        itemStatus.setStatusUserLogin("system");
        orderStatusRepository.save(itemStatus);

        if (header.getGrandTotal() == null) {
            header.setGrandTotal(BigDecimal.ZERO);
        }
        header.setGrandTotal(header.getGrandTotal().add(item.getUnitPrice().multiply(item.getQuantity())));
        orderHeaderRepository.save(header);

        if (STATUS_APPROVED.equals(header.getStatusId())) {
            reserveInventoryForOrder(orderId);
        }

        return toItemDto(item, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO);
    }

    public OrderNoteDto addNote(String orderId, OrderNoteRequest request) {
        getOrderHeader(orderId);
        OrderNote note = new OrderNote();
        note.setOrderId(orderId);
        note.setNoteText(request.getNoteText());
        note.setNoteDate(Optional.ofNullable(request.getNoteDate()).orElseGet(LocalDateTime::now));
        note.setUserId(firstNonBlank(request.getUserId(), "system"));
        return toNoteDto(orderNoteRepository.save(note));
    }

    public OrderNoteDto updateNote(String orderId, Long noteId, OrderNoteRequest request) {
        OrderNote note = orderNoteRepository.findById(noteId)
                .filter(existing -> orderId.equals(existing.getOrderId()))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Order note not found"));
        if (!isBlank(request.getNoteText())) {
            note.setNoteText(request.getNoteText());
        }
        if (request.getNoteDate() != null) {
            note.setNoteDate(request.getNoteDate());
        }
        if (!isBlank(request.getUserId())) {
            note.setUserId(request.getUserId());
        }
        return toNoteDto(orderNoteRepository.save(note));
    }

    public OrderHeaderDto updateOrderStatus(String orderId, OrderStatusChangeRequest request) {
        if (request == null || isBlank(request.getStatusId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Status is required");
        }
        OrderHeader header = getOrderHeader(orderId);
        String statusId = request.getStatusId();
        header.setStatusId(statusId);
        orderHeaderRepository.save(header);
        createOrderStatus(orderId, statusId);

        if (STATUS_APPROVED.equals(statusId)) {
            List<OrderItem> items = orderItemRepository.findByOrderId(orderId);
            for (OrderItem item : items) {
                item.setStatusId(ITEM_APPROVED);
            }
            orderItemRepository.saveAll(items);

            for (OrderItem item : items) {
                createItemStatus(orderId, item.getOrderItemSeqId(), ITEM_APPROVED);
            }

            if ("SALES_ORDER".equalsIgnoreCase(header.getOrderTypeId())) {
                reserveInventoryForOrder(orderId);
            }
        }

        return toHeaderDto(header);
    }

    public OrderItemDto updateOrderItemQuantity(
            String orderId,
            String orderItemSeqId,
            OrderItemQuantityUpdateRequest request) {
        if (request == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Request body is required");
        }
        OrderHeader header = getOrderHeader(orderId);
        String statusId = header.getStatusId();
        if (!STATUS_CREATED.equals(statusId) && !STATUS_APPROVED.equals(statusId)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Order is not editable");
        }

        OrderItem item = orderItemRepository.findByOrderIdAndOrderItemSeqId(orderId, orderItemSeqId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Order item not found"));
        if (request.getQuantity() != null) {
            item.setQuantity(request.getQuantity());
        }
        if (request.getUnitAmount() != null) {
            item.setUnitPrice(request.getUnitAmount());
        }
        orderItemRepository.save(item);

        BigDecimal receivedQuantity = fetchReceivedQuantities(orderId)
                .getOrDefault(item.getOrderItemSeqId(), BigDecimal.ZERO);
        BigDecimal pickedQuantity = fetchPickedQuantities(orderId)
                .getOrDefault(item.getOrderItemSeqId(), BigDecimal.ZERO);
        BigDecimal reservedQuantity = fetchReservedQuantities(orderId)
                .getOrDefault(item.getOrderItemSeqId(), BigDecimal.ZERO);
        return toItemDto(item, receivedQuantity, pickedQuantity, reservedQuantity);
    }

    public void updateShippingInstructions(String orderId, String shipGroupSeqId,
            OrderShippingInstructionRequest request) {
        if (request == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Shipping instructions are required");
        }
        OrderItemShipGroup shipGroup = orderItemShipGroupRepository
                .findByOrderIdAndShipGroupSeqId(orderId, shipGroupSeqId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Ship group not found"));
        shipGroup.setShippingInstructions(request.getShippingInstructions());
        orderItemShipGroupRepository.save(shipGroup);
    }

    public OrderHeaderDto approvePurchaseOrder(String orderId) {
        OrderHeader header = getOrderHeader(orderId);
        header.setStatusId(STATUS_APPROVED);
        orderHeaderRepository.save(header);

        OrderStatus status = new OrderStatus();
        status.setOrderId(orderId);
        status.setStatusId(STATUS_APPROVED);
        status.setStatusDatetime(LocalDateTime.now());
        status.setStatusUserLogin("system");
        orderStatusRepository.save(status);

        List<OrderItem> items = orderItemRepository.findByOrderId(orderId);
        for (OrderItem item : items) {
            item.setStatusId(ITEM_APPROVED);
        }
        orderItemRepository.saveAll(items);

        for (OrderItem item : items) {
            OrderStatus itemStatus = new OrderStatus();
            itemStatus.setOrderId(orderId);
            itemStatus.setOrderItemSeqId(item.getOrderItemSeqId());
            itemStatus.setStatusId(ITEM_APPROVED);
            itemStatus.setStatusDatetime(LocalDateTime.now());
            itemStatus.setStatusUserLogin("system");
            orderStatusRepository.save(itemStatus);
        }

        return toHeaderDto(header);
    }

    public OrderHeaderDto approveSalesOrder(String orderId) {
        OrderHeader header = getOrderHeader(orderId);
        header.setStatusId(STATUS_APPROVED);
        orderHeaderRepository.save(header);
        createOrderStatus(orderId, STATUS_APPROVED);

        List<OrderItem> items = orderItemRepository.findByOrderId(orderId);
        for (OrderItem item : items) {
            item.setStatusId(ITEM_APPROVED);
        }
        orderItemRepository.saveAll(items);

        for (OrderItem item : items) {
            createItemStatus(orderId, item.getOrderItemSeqId(), ITEM_APPROVED);
        }

        reserveInventoryForOrder(orderId);
        return toHeaderDto(header);
    }

    public ReservationStatusDto getReservationStatus(String orderId) {
        getOrderHeader(orderId);
        return buildReservationStatus(orderId);
    }

    public List<ReservedOrderSummaryDto> listReservedOrders() {
        List<OrderHeader> approvedOrders = orderHeaderRepository.findByStatusId(STATUS_APPROVED);
        if (approvedOrders.isEmpty()) {
            return List.of();
        }

        List<String> ordersInPicklists = fetchOrdersInPicklists();

        List<String> orderIds = approvedOrders.stream()
                .map(OrderHeader::getOrderId)
                .filter(value -> !isBlank(value))
                .filter(orderId -> !ordersInPicklists.contains(orderId))
                .distinct()
                .collect(Collectors.toList());

        if (orderIds.isEmpty()) {
            return List.of();
        }

        List<OrderItemShipGrpInvRes> reservations = orderItemShipGrpInvResRepository.findByOrderIdIn(orderIds);
        Map<String, List<OrderItemShipGrpInvRes>> reservationsByOrder = reservations.stream()
                .filter(res -> res.getQuantity() != null && res.getQuantity().compareTo(BigDecimal.ZERO) > 0)
                .collect(Collectors.groupingBy(OrderItemShipGrpInvRes::getOrderId));

        if (reservationsByOrder.isEmpty()) {
            return List.of();
        }

        Map<String, OrderHeader> orderMap = approvedOrders.stream()
                .filter(order -> !isBlank(order.getOrderId()))
                .collect(Collectors.toMap(OrderHeader::getOrderId, order -> order, (a, b) -> a));

        List<ReservedOrderSummaryDto> result = new ArrayList<>();
        for (Map.Entry<String, List<OrderItemShipGrpInvRes>> entry : reservationsByOrder.entrySet()) {
            String orderId = entry.getKey();
            OrderHeader header = orderMap.get(orderId);
            if (header == null) {
                continue;
            }

            List<OrderItemShipGrpInvRes> orderReservations = entry.getValue();
            BigDecimal totalReserved = orderReservations.stream()
                    .map(OrderItemShipGrpInvRes::getQuantity)
                    .filter(Objects::nonNull)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

            if (totalReserved.compareTo(BigDecimal.ZERO) <= 0) {
                continue;
            }

            Set<String> itemSeqIds = orderReservations.stream()
                    .map(OrderItemShipGrpInvRes::getOrderItemSeqId)
                    .filter(value -> !isBlank(value))
                    .collect(Collectors.toSet());

            ReservedOrderSummaryDto dto = new ReservedOrderSummaryDto();
            dto.setOrderId(orderId);
            dto.setFacilityId(header.getOriginFacilityId());
            dto.setStatusId(header.getStatusId());
            dto.setCreatedDate(header.getOrderDate());
            dto.setPickQuantity(totalReserved);
            dto.setItemCount(itemSeqIds.size());
            result.add(dto);
        }

        return result;
    }

    public List<ReservedOrderItemDto> listReservedOrderItems(String orderId) {
        if (isBlank(orderId)) {
            return List.of();
        }

        List<OrderItemShipGrpInvRes> reservations = orderItemShipGrpInvResRepository.findByOrderId(orderId);
        if (reservations.isEmpty()) {
            return List.of();
        }

        Map<String, BigDecimal> reservedByItem = new HashMap<>();
        Map<String, String> inventoryByItem = new HashMap<>();
        Map<String, String> shipGroupByItem = new HashMap<>();

        for (OrderItemShipGrpInvRes res : reservations) {
            if (res.getQuantity() == null || res.getQuantity().compareTo(BigDecimal.ZERO) <= 0) {
                continue;
            }
            reservedByItem.merge(res.getOrderItemSeqId(), res.getQuantity(), BigDecimal::add);
            if (!isBlank(res.getInventoryItemId())) {
                inventoryByItem.put(res.getOrderItemSeqId(), res.getInventoryItemId());
            }
            if (!isBlank(res.getShipGroupSeqId())) {
                shipGroupByItem.put(res.getOrderItemSeqId(), res.getShipGroupSeqId());
            }
        }

        if (reservedByItem.isEmpty()) {
            return List.of();
        }

        List<OrderItem> items = orderItemRepository.findByOrderId(orderId);
        Map<String, OrderItem> itemMap = items.stream()
                .filter(item -> !isBlank(item.getOrderItemSeqId()))
                .collect(Collectors.toMap(OrderItem::getOrderItemSeqId, item -> item, (a, b) -> a));

        List<ReservedOrderItemDto> result = new ArrayList<>();
        for (Map.Entry<String, BigDecimal> entry : reservedByItem.entrySet()) {
            String itemSeqId = entry.getKey();
            OrderItem item = itemMap.get(itemSeqId);
            ReservedOrderItemDto dto = new ReservedOrderItemDto();
            dto.setOrderItemSeqId(itemSeqId);
            dto.setReservedQuantity(entry.getValue());
            dto.setInventoryItemId(inventoryByItem.get(itemSeqId));
            dto.setShipGroupSeqId(shipGroupByItem.get(itemSeqId));
            if (item != null) {
                dto.setProductId(item.getProductId());
                dto.setDescription(item.getItemDescription());
            }
            result.add(dto);
        }

        return result;
    }

    public ReservationStatusDto reserveBackorders() {
        List<OrderItemShipGrpInvRes> backorders = orderItemShipGrpInvResRepository
                .findByQuantityNotAvailableGreaterThan(BigDecimal.ZERO);
        if (backorders.isEmpty()) {
            return new ReservationStatusDto(true, false);
        }

        List<String> orderIds = backorders.stream()
                .map(OrderItemShipGrpInvRes::getOrderId)
                .filter(value -> !isBlank(value))
                .distinct()
                .collect(Collectors.toList());

        for (String orderId : orderIds) {
            reserveInventoryForOrder(orderId);
        }

        boolean anyBackorder = orderIds.stream()
                .map(this::buildReservationStatus)
                .anyMatch(ReservationStatusDto::isHasBackorder);
        return new ReservationStatusDto(!anyBackorder, anyBackorder);
    }

    @Transactional
    public void clearReservations(String orderId) {
        getOrderHeader(orderId);
        orderItemShipGrpInvResRepository.deleteByOrderId(orderId);
    }

    public Map<String, String> createSalesPicklist(String orderId) {
        OrderHeader header = getOrderHeader(orderId);
        ReservationStatusDto status = buildReservationStatus(orderId);
        if (!status.isFullyReserved()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Order has backordered items");
        }

        String facilityId = resolveFacility(orderId);
        if (isBlank(facilityId)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "facilityId is required");
        }

        List<OrderItemShipGrpInvRes> reservations = orderItemShipGrpInvResRepository.findByOrderId(orderId);
        if (reservations.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No reservations found");
        }

        List<WmsPicklistItem> items = reservations.stream()
                .filter(res -> !isBlank(res.getInventoryItemId()))
                .map(res -> {
                    OrderItem item = orderItemRepository
                            .findByOrderIdAndOrderItemSeqId(orderId, res.getOrderItemSeqId())
                            .orElse(null);
                    if (item == null) {
                        return null;
                    }
                    WmsPicklistItem pickItem = new WmsPicklistItem();
                    pickItem.setOrderItemSeqId(res.getOrderItemSeqId());
                    pickItem.setProductId(item.getProductId());
                    pickItem.setInventoryItemId(res.getInventoryItemId());
                    pickItem.setQuantity(defaultIfNull(res.getQuantity(), BigDecimal.ZERO));
                    return pickItem;
                })
                .filter(value -> value != null)
                .collect(Collectors.toList());

        if (items.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No reservable inventory found");
        }

        WmsPicklistRequest request = new WmsPicklistRequest();
        request.setOrderId(orderId);
        request.setFacilityId(facilityId);
        request.setShipGroupSeqId(firstNonBlank(resolveShipGroup(orderId), "00001"));
        request.setShipmentMethodTypeId(null);
        request.setItems(items);

        String url = wmsBaseUrl + "/api/fulfillment/sales-orders/" + orderId + "/picklist";
        WmsPicklistResponse response = restTemplate.postForObject(url, request, WmsPicklistResponse.class);
        if (response == null) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Failed to create picklist");
        }

        Map<String, String> result = new HashMap<>();
        result.put("picklistId", response.getPicklistId());
        result.put("picklistBinId", response.getPicklistBinId());
        result.put("shipmentId", response.getShipmentId());
        return result;
    }

    public OrderHeaderDto completeSalesOrder(String orderId) {
        OrderHeader header = getOrderHeader(orderId);
        header.setStatusId(STATUS_COMPLETED);
        orderHeaderRepository.save(header);
        createOrderStatus(orderId, STATUS_COMPLETED);

        List<OrderItem> items = orderItemRepository.findByOrderId(orderId);
        for (OrderItem item : items) {
            item.setStatusId(ITEM_COMPLETED);
        }
        orderItemRepository.saveAll(items);

        for (OrderItem item : items) {
            createItemStatus(orderId, item.getOrderItemSeqId(), ITEM_COMPLETED);
        }

        return toHeaderDto(header);
    }

    public InvoiceSummaryDto createSalesInvoice(String orderId) {
        OrderHeader header = getOrderHeader(orderId);
        if (!orderItemBillingRepository.findByOrderId(orderId).isEmpty()) {
            List<InvoiceSummaryDto> invoices = listInvoices(orderId);
            return invoices.isEmpty() ? null : invoices.get(0);
        }

        List<OrderItem> items = orderItemRepository.findByOrderId(orderId);
        if (items.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No order items found");
        }

        String invoiceId = "INV"
                + UUID.randomUUID().toString().replace("-", "").substring(0, 8).toUpperCase(Locale.ROOT);
        Invoice invoice = new Invoice();
        invoice.setInvoiceId(invoiceId);
        invoice.setInvoiceTypeId(INVOICE_TYPE_SALES);
        invoice.setPartyIdFrom(ORG_PARTY_ID);
        invoice.setPartyId(resolveRole(orderId, ROLE_BILL_TO_CUSTOMER));
        invoice.setRoleTypeId(ROLE_BILL_TO_CUSTOMER);
        invoice.setStatusId(INVOICE_STATUS_READY);
        invoice.setInvoiceDate(LocalDateTime.now());
        invoice.setCurrencyUomId(firstNonBlank(header.getCurrencyUom(), DEFAULT_CURRENCY));
        invoiceRepository.save(invoice);

        int seq = 1;
        for (OrderItem item : items) {
            InvoiceItem invoiceItem = new InvoiceItem();
            invoiceItem.setInvoiceId(invoiceId);
            invoiceItem.setInvoiceItemSeqId(String.format("%05d", seq++));
            invoiceItem.setInvoiceItemTypeId("INV_FPROD_ITEM");
            invoiceItem.setProductId(item.getProductId());
            invoiceItem.setQuantity(defaultIfNull(item.getQuantity(), BigDecimal.ZERO));
            BigDecimal amount = defaultIfNull(item.getUnitPrice(), BigDecimal.ZERO)
                    .multiply(defaultIfNull(item.getQuantity(), BigDecimal.ZERO));
            invoiceItem.setAmount(amount);
            invoiceItem.setDescription(item.getItemDescription());
            invoiceItemRepository.save(invoiceItem);

            OrderItemBilling billing = new OrderItemBilling();
            billing.setOrderId(orderId);
            billing.setOrderItemSeqId(item.getOrderItemSeqId());
            billing.setInvoiceId(invoiceId);
            billing.setInvoiceItemSeqId(invoiceItem.getInvoiceItemSeqId());
            billing.setQuantity(defaultIfNull(item.getQuantity(), BigDecimal.ZERO));
            billing.setAmount(amount);
            orderItemBillingRepository.save(billing);
        }

        AcctgTrans trans = new AcctgTrans();
        trans.setAcctgTransId(
                "AT" + UUID.randomUUID().toString().replace("-", "").substring(0, 8).toUpperCase(Locale.ROOT));
        trans.setAcctgTransTypeId(ACCTG_TRANS_TYPE_SALES);
        trans.setTransactionDate(LocalDateTime.now());
        trans.setIsPosted(Boolean.TRUE);
        trans.setPostedDate(LocalDateTime.now());
        trans.setGlFiscalTypeId("ACTUAL");
        trans.setPartyId(resolveRole(orderId, ROLE_BILL_TO_CUSTOMER));
        trans.setRoleTypeId(ROLE_BILL_TO_CUSTOMER);
        trans.setInvoiceId(invoiceId);
        acctgTransRepository.save(trans);

        BigDecimal totalAmount = items.stream()
                .map(item -> defaultIfNull(item.getUnitPrice(), BigDecimal.ZERO)
                        .multiply(defaultIfNull(item.getQuantity(), BigDecimal.ZERO)))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        createAcctgEntry(trans.getAcctgTransId(), "00001", GL_ACCOUNT_AR, totalAmount, Boolean.TRUE);
        createAcctgEntry(trans.getAcctgTransId(), "00002", GL_ACCOUNT_SALES, totalAmount, Boolean.FALSE);

        List<InvoiceSummaryDto> summaries = listInvoices(orderId);
        return summaries.isEmpty() ? null : summaries.get(0);
    }

    public PurchaseOrderReceiveResponse receivePurchaseOrder(String orderId, PurchaseOrderReceiveRequest request) {
        OrderHeader header = getOrderHeader(orderId);
        if (request == null || request.getItems() == null || request.getItems().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "items are required");
        }
        if (!STATUS_APPROVED.equals(header.getStatusId()) && !STATUS_COMPLETED.equals(header.getStatusId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Purchase order must be approved before receiving");
        }

        String shipGroupSeqId = firstNonBlank(request.getShipGroupSeqId(), "00001");
        String facilityId = firstNonBlank(request.getFacilityId(), resolveFacility(orderId));
        String vendorPartyId = firstNonBlank(request.getVendorPartyId(), resolveVendor(orderId));

        if (isBlank(facilityId)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "facilityId is required");
        }

        Map<String, BigDecimal> receivedTotals = fetchReceivedQuantities(orderId);
        Map<String, OrderItem> itemMap = orderItemRepository.findByOrderId(orderId).stream()
                .collect(Collectors.toMap(OrderItem::getOrderItemSeqId, item -> item));

        List<WmsReceiveItem> wmsItems = new ArrayList<>();
        for (PurchaseOrderReceiveItemRequest itemRequest : request.getItems()) {
            OrderItem orderItem = itemMap.get(itemRequest.getOrderItemSeqId());
            if (orderItem == null) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "Invalid orderItemSeqId: " + itemRequest.getOrderItemSeqId());
            }
            BigDecimal orderedQty = defaultIfNull(orderItem.getQuantity(), BigDecimal.ZERO);
            BigDecimal receivedQty = receivedTotals.getOrDefault(orderItem.getOrderItemSeqId(), BigDecimal.ZERO);
            BigDecimal remaining = orderedQty.subtract(receivedQty);
            if (itemRequest.getQuantity() == null || itemRequest.getQuantity().compareTo(BigDecimal.ZERO) <= 0) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "quantity must be greater than zero");
            }
            if (itemRequest.getQuantity().compareTo(remaining) > 0) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "receive quantity exceeds remaining for item " + orderItem.getOrderItemSeqId());
            }
            WmsReceiveItem wmsItem = new WmsReceiveItem();
            wmsItem.setOrderItemSeqId(orderItem.getOrderItemSeqId());
            wmsItem.setProductId(orderItem.getProductId());
            wmsItem.setQuantity(itemRequest.getQuantity().toPlainString());
            wmsItem.setUnitCost(defaultIfNull(orderItem.getUnitPrice(), BigDecimal.ZERO).toPlainString());
            wmsItem.setLocationSeqId(itemRequest.getLocationSeqId());
            wmsItems.add(wmsItem);
        }

        WmsReceiveRequest wmsRequest = new WmsReceiveRequest();
        wmsRequest.setOrderId(orderId);
        wmsRequest.setFacilityId(facilityId);
        wmsRequest.setVendorPartyId(vendorPartyId);
        wmsRequest.setOwnerPartyId(ORG_PARTY_ID);
        wmsRequest.setShipGroupSeqId(shipGroupSeqId);
        wmsRequest.setCurrencyUomId(firstNonBlank(header.getCurrencyUom(), DEFAULT_CURRENCY));
        wmsRequest.setReceivedDate(request.getReceivedDate());
        wmsRequest.setItems(wmsItems);

        String wmsUrl = wmsBaseUrl + "/api/purchase-orders/" + orderId + "/receive";
        WmsReceiveResponse wmsResponse = restTemplate.postForObject(wmsUrl, wmsRequest, WmsReceiveResponse.class);
        if (wmsResponse == null) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Failed to receive purchase order");
        }

        Map<String, BigDecimal> updatedReceivedTotals = fetchReceivedQuantities(orderId);
        boolean allReceived = true;
        for (OrderItem item : itemMap.values()) {
            BigDecimal orderedQty = defaultIfNull(item.getQuantity(), BigDecimal.ZERO);
            BigDecimal receivedQty = updatedReceivedTotals.getOrDefault(item.getOrderItemSeqId(), BigDecimal.ZERO);
            if (receivedQty.compareTo(orderedQty) < 0) {
                allReceived = false;
                item.setStatusId(ITEM_APPROVED);
            } else {
                item.setStatusId(ITEM_COMPLETED);
                createItemStatus(orderId, item.getOrderItemSeqId(), ITEM_COMPLETED);
            }
        }
        orderItemRepository.saveAll(itemMap.values());

        if (allReceived) {
            header.setStatusId(STATUS_COMPLETED);
            orderHeaderRepository.save(header);
            createOrderStatus(orderId, STATUS_COMPLETED);
            createInvoiceForOrder(header, itemMap.values(), wmsResponse);
        }

        List<PurchaseOrderReceiptDto> receipts = new ArrayList<>();
        if (wmsResponse.getReceipts() != null) {
            for (WmsReceipt receipt : wmsResponse.getReceipts()) {
                receipts.add(new PurchaseOrderReceiptDto(
                        receipt.getOrderItemSeqId(),
                        receipt.getReceiptId(),
                        receipt.getInventoryItemId(),
                        toBigDecimal(receipt.getQuantityAccepted())));
            }
        }

        return new PurchaseOrderReceiveResponse(wmsResponse.getShipmentId(), receipts);
    }

    public List<InvoiceSummaryDto> listInvoices(String orderId) {
        getOrderHeader(orderId);
        List<OrderItemBilling> billings = orderItemBillingRepository.findByOrderId(orderId);
        if (billings.isEmpty()) {
            return List.of();
        }

        Map<String, InvoiceSummaryDto> summaries = new LinkedHashMap<>();
        for (OrderItemBilling billing : billings) {
            String invoiceId = billing.getInvoiceId();
            if (isBlank(invoiceId)) {
                continue;
            }
            InvoiceSummaryDto summary = summaries.get(invoiceId);
            if (summary == null) {
                Invoice invoice = invoiceRepository.findByInvoiceId(invoiceId).orElse(null);
                summary = new InvoiceSummaryDto();
                summary.setInvoiceId(invoiceId);
                if (invoice != null) {
                    summary.setStatusId(invoice.getStatusId());
                    summary.setInvoiceDate(invoice.getInvoiceDate());
                    summary.setCurrencyUomId(invoice.getCurrencyUomId());
                }
                summary.setItems(new ArrayList<>());
                summaries.put(invoiceId, summary);
            }
        }

        for (InvoiceSummaryDto summary : summaries.values()) {
            List<InvoiceItemSummaryDto> items = invoiceItemRepository.findByInvoiceId(summary.getInvoiceId()).stream()
                    .map(item -> new InvoiceItemSummaryDto(
                            item.getProductId(),
                            defaultIfNull(item.getQuantity(), BigDecimal.ZERO),
                            defaultIfNull(item.getAmount(), BigDecimal.ZERO)))
                    .collect(Collectors.toList());
            summary.setItems(items);
        }

        return new ArrayList<>(summaries.values());
    }

    public OrderContentDto addContent(String orderId, String description, MultipartFile contentFile) {
        getOrderHeader(orderId);

        if (contentFile == null || contentFile.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "contentFile is required");
        }

        String contentId = "OCN" + UUID.randomUUID().toString().replace("-", "").toUpperCase(Locale.ROOT);
        storeOrderContentFile(contentId, contentFile);

        OrderContent orderContent = new OrderContent();
        orderContent.setOrderId(orderId);
        orderContent.setContentId(contentId);
        orderContent.setFromDate(LocalDateTime.now());
        orderContentRepository.save(orderContent);

        OrderContentInfo info = new OrderContentInfo();
        info.setOrderId(orderId);
        info.setContentId(contentId);
        info.setDescription(description);
        info.setContentLocation(contentFile.getOriginalFilename());
        info.setContentDate(LocalDateTime.now());
        orderContentInfoRepository.save(info);

        return toContentDto(info);
    }

    public OrderContentDownload loadOrderContent(String orderId, String contentId) {
        if (isBlank(orderId) || isBlank(contentId)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "orderId and contentId are required");
        }

        OrderContentInfo info = orderContentInfoRepository.findByOrderIdAndContentId(orderId, contentId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found"));

        Path filePath = resolveOrderContentPath(contentId);
        if (!Files.exists(filePath)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content file not found");
        }

        return new OrderContentDownload(filePath, info.getContentLocation());
    }

    private OrderHeader getOrderHeader(String orderId) {
        return orderHeaderRepository.findByOrderId(orderId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Order %s not found".formatted(orderId)));
    }

    private OrderHeader getOrderHeaderById(Long id) {
        return orderHeaderRepository.findById(id)
                .orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Order %d not found".formatted(id)));
    }

    private Page<OrderHeader> loadOrders(String queryString, String orderTypeId, PageRequest pageable) {
        if (isBlank(orderTypeId)) {
            return orderHeaderRepository.findAll(pageable);
        }
        if (isBlank(queryString)) {
            return orderHeaderRepository.findByOrderTypeId(orderTypeId, pageable);
        }
        return orderHeaderRepository
                .findByOrderTypeIdAndOrderIdContainingIgnoreCaseOrOrderTypeIdAndOrderNameContainingIgnoreCase(
                        orderTypeId, queryString, orderTypeId, queryString, pageable);
    }

    private OrderListItem toListItem(
            OrderHeader order,
            Map<String, OrderItemRepository.OrderItemAggregate> aggregates,
            Map<String, OrderItemShipGroup> shipGroupMap,
            Map<String, OrderRole> billToRoles) {
        OrderListItem item = new OrderListItem();
        item.setId(order.getId());
        item.setOrderId(order.getOrderId());
        item.setEntryDate(order.getEntryDate());
        BigDecimal grandTotal = order.getGrandTotal();
        OrderItemRepository.OrderItemAggregate aggregate = aggregates.get(order.getOrderId());
        if (grandTotal == null && aggregate != null && aggregate.getGrandTotal() != null) {
            grandTotal = aggregate.getGrandTotal();
        }
        item.setGrandTotal(grandTotal);
        item.setStatusDescription(resolveStatusDescription(order.getStatusId()));
        item.setStoreName(order.getProductStoreId());

        OrderItemShipGroup firstGroup = shipGroupMap.get(order.getOrderId());
        if (firstGroup != null) {
            item.setFacilityName(firstGroup.getFacilityId());
            item.setVendorOrganizationName(firstGroup.getVendorPartyId());
        }

        OrderRole role = billToRoles.get(order.getOrderId());
        String customerPartyId = role != null ? role.getPartyId() : null;
        item.setCustomerName(customerPartyId);
        item.setOrganizationName(customerPartyId);

        BigDecimal quantityTotal = aggregate != null ? aggregate.getQuantityTotal() : null;
        item.setQuantityTotal(quantityTotal);
        return item;
    }

    private Sort buildOrderSort(String sortBy, String sortDirection) {
        Sort.Direction direction = resolveDirection(sortDirection);
        String sortField = isBlank(sortBy) ? "entryDate" : sortBy;
        String mappedField = switch (sortField) {
            case "orderId" -> "orderId";
            case "orderDate" -> "orderDate";
            case "entryDate" -> "entryDate";
            case "statusId" -> "statusId";
            case "orderName" -> "orderName";
            case "grandTotal" -> "grandTotal";
            default -> "entryDate";
        };
        return Sort.by(direction, mappedField);
    }

    private Sort.Direction resolveDirection(String sortDirection) {
        return "asc".equalsIgnoreCase(sortDirection) ? Sort.Direction.ASC : Sort.Direction.DESC;
    }

    private List<OrderListItem> sortOrderListItems(List<OrderListItem> items, String sortBy, Sort.Direction direction) {
        String sortField = isBlank(sortBy) ? "orderId" : sortBy;
        Comparator<OrderListItem> comparator = switch (sortField) {
            case "id" -> Comparator.comparing(OrderListItem::getId, Comparator.nullsLast(Comparator.naturalOrder()));
            case "orderId" ->
                Comparator.comparing(OrderListItem::getOrderId, Comparator.nullsLast(String::compareToIgnoreCase));
            case "customerName" ->
                Comparator.comparing(OrderListItem::getCustomerName, Comparator.nullsLast(String::compareToIgnoreCase));
            case "organizationName" -> Comparator.comparing(OrderListItem::getOrganizationName,
                    Comparator.nullsLast(String::compareToIgnoreCase));
            case "vendorOrganizationName" -> Comparator.comparing(OrderListItem::getVendorOrganizationName,
                    Comparator.nullsLast(String::compareToIgnoreCase));
            case "entryDate" ->
                Comparator.comparing(OrderListItem::getEntryDate, Comparator.nullsLast(Comparator.naturalOrder()));
            case "statusDescription" -> Comparator.comparing(OrderListItem::getStatusDescription,
                    Comparator.nullsLast(String::compareToIgnoreCase));
            case "storeName" ->
                Comparator.comparing(OrderListItem::getStoreName, Comparator.nullsLast(String::compareToIgnoreCase));
            case "facilityName" ->
                Comparator.comparing(OrderListItem::getFacilityName, Comparator.nullsLast(String::compareToIgnoreCase));
            case "quantityTotal" ->
                Comparator.comparing(OrderListItem::getQuantityTotal, Comparator.nullsLast(Comparator.naturalOrder()));
            case "grandTotal" ->
                Comparator.comparing(OrderListItem::getGrandTotal, Comparator.nullsLast(Comparator.naturalOrder()));
            default ->
                Comparator.comparing(OrderListItem::getOrderId, Comparator.nullsLast(String::compareToIgnoreCase));
        };
        if (direction == Sort.Direction.DESC) {
            comparator = comparator.reversed();
        }
        return items.stream().sorted(comparator).collect(Collectors.toList());
    }

    private OrderHeaderDto toHeaderDto(OrderHeader orderHeader) {
        OrderHeaderDto dto = new OrderHeaderDto();
        dto.setId(orderHeader.getId());
        dto.setOrderId(orderHeader.getOrderId());
        dto.setEntryDate(orderHeader.getEntryDate());
        dto.setCurrencyUom(orderHeader.getCurrencyUom());
        dto.setProductStoreId(orderHeader.getProductStoreId());
        dto.setGrandTotal(orderHeader.getGrandTotal());
        dto.setOrderTypeId(orderHeader.getOrderTypeId());
        dto.setOrderName(orderHeader.getOrderName());
        return dto;
    }

    private List<OrderPartDto> buildParts(
            String orderId,
            OrderHeader header,
            Map<String, BigDecimal> receivedQuantities,
            Map<String, BigDecimal> pickedQuantities,
            Map<String, BigDecimal> reservedQuantities) {
        List<OrderItemShipGroup> shipGroups = orderItemShipGroupRepository.findByOrderId(orderId);
        if (shipGroups.isEmpty()) {
            OrderItemShipGroup fallback = new OrderItemShipGroup();
            fallback.setOrderId(orderId);
            fallback.setShipGroupSeqId("00001");
            shipGroups = List.of(fallback);
        }

        List<OrderItem> items = orderItemRepository.findByOrderId(orderId);
        List<OrderItemShipGroupAssoc> assocs = orderItemShipGroupAssocRepository.findByOrderId(orderId);

        List<OrderPartDto> parts = new ArrayList<>();
        for (OrderItemShipGroup shipGroup : shipGroups) {
            List<OrderItem> partItems = resolvePartItems(shipGroup, items, assocs);
            OrderPartDto part = new OrderPartDto();
            part.setOrderPartSeqId(shipGroup.getShipGroupSeqId());
            part.setShipBeforeDate(shipGroup.getShipByDate());
            part.setShippingInstructions(shipGroup.getShippingInstructions());
            part.setCarrierPartyId(shipGroup.getCarrierPartyId());
            part.setCarrierService(shipGroup.getCarrierService());
            part.setStatus(resolveStatus(header.getStatusId()));
            part.setFacility(new FacilityDto(shipGroup.getFacilityId(), shipGroup.getFacilityId()));
            part.setCustomer(buildCustomer(orderId));
            part.setItems(partItems.stream()
                    .map(item -> toItemDto(
                            item,
                            receivedQuantities.getOrDefault(item.getOrderItemSeqId(), BigDecimal.ZERO),
                            pickedQuantities.getOrDefault(item.getOrderItemSeqId(), BigDecimal.ZERO),
                            reservedQuantities.getOrDefault(item.getOrderItemSeqId(), BigDecimal.ZERO)))
                    .collect(Collectors.toList()));
            part.setPartTotal(calculatePartTotal(partItems));
            parts.add(part);
        }

        return parts;
    }

    private void applyOrderAdjustments(OrderHeader header, OrderCreateRequest request) {
        BigDecimal shippingAmount = safeAmount(request.getShippingAmount());
        if (shippingAmount.compareTo(BigDecimal.ZERO) > 0) {
            createOrderAdjustment(header.getOrderId(), ADJ_TYPE_SHIPPING, shippingAmount);
        }

        BigDecimal discountAmount = safeAmount(request.getDiscountAmount());
        if (discountAmount.compareTo(BigDecimal.ZERO) > 0) {
            createOrderAdjustment(header.getOrderId(), ADJ_TYPE_DISCOUNT, discountAmount.negate());
        }

        if (header.getGrandTotal() == null) {
            header.setGrandTotal(BigDecimal.ZERO);
        }

        if (shippingAmount.signum() != 0 || discountAmount.signum() != 0) {
            header.setGrandTotal(header.getGrandTotal().add(shippingAmount).subtract(discountAmount));
        }

        orderHeaderRepository.save(header);
    }

    private void applyShipByMethod(OrderItemShipGroup shipGroup, String shipByMethod) {
        if (isBlank(shipByMethod)) {
            return;
        }
        String[] parts = shipByMethod.split("@", 2);
        if (parts.length == 2) {
            shipGroup.setCarrierPartyId(parts[0]);
            shipGroup.setCarrierService(parts[1]);
        } else {
            shipGroup.setCarrierService(shipByMethod);
        }
    }

    private void createOrderTerm(String orderId, OrderCreateRequest request) {
        if (isBlank(request.getPaymentTerm())) {
            return;
        }
        OrderTerm term = new OrderTerm();
        term.setOrderId(orderId);
        term.setTermTypeId(request.getPaymentTerm());
        term.setDescription(request.getPaymentTerm());
        term.setTermDays(parseTermDays(request.getPaymentTerm()));
        orderTermRepository.save(term);
    }

    private void createOrderPaymentPreference(String orderId, OrderCreateRequest request) {
        if (isBlank(request.getPaymentMethod())) {
            return;
        }
        OrderPaymentPreference preference = new OrderPaymentPreference();
        preference.setOrderId(orderId);
        preference.setPaymentMethodTypeId(request.getPaymentMethod());
        orderPaymentPreferenceRepository.save(preference);
    }

    private OrderTermDto toOrderTermDto(OrderTerm term) {
        OrderTermDto dto = new OrderTermDto();
        dto.setTermTypeId(term.getTermTypeId());
        dto.setTermValue(term.getTermValue());
        dto.setTermDays(term.getTermDays());
        dto.setTextValue(term.getTextValue());
        dto.setDescription(term.getDescription());
        return dto;
    }

    private OrderPaymentPreferenceDto toOrderPaymentPreferenceDto(OrderPaymentPreference preference) {
        OrderPaymentPreferenceDto dto = new OrderPaymentPreferenceDto();
        dto.setPaymentMethodTypeId(preference.getPaymentMethodTypeId());
        dto.setPaymentMethodId(preference.getPaymentMethodId());
        dto.setStatusId(preference.getStatusId());
        dto.setMaxAmount(preference.getMaxAmount());
        return dto;
    }

    private BigDecimal parseTermDays(String termTypeId) {
        if (isBlank(termTypeId)) {
            return null;
        }
        String digits = termTypeId.replaceAll("\\D+", "");
        if (digits.isBlank()) {
            return null;
        }
        try {
            return new BigDecimal(digits);
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    private void createOrderAdjustment(String orderId, String adjustmentTypeId, BigDecimal amount) {
        OrderAdjustment adjustment = new OrderAdjustment();
        adjustment.setOrderAdjustmentTypeId(adjustmentTypeId);
        adjustment.setOrderId(orderId);
        adjustment.setOrderItemSeqId("_NA_");
        adjustment.setShipGroupSeqId("00001");
        adjustment.setAmount(amount);
        orderAdjustmentRepository.save(adjustment);
    }

    private BigDecimal safeAmount(BigDecimal value) {
        return value == null ? BigDecimal.ZERO : value;
    }

    private List<OrderItem> resolvePartItems(
            OrderItemShipGroup shipGroup,
            List<OrderItem> items,
            List<OrderItemShipGroupAssoc> assocs) {
        List<OrderItemShipGroupAssoc> matchingAssocs = assocs.stream()
                .filter(assoc -> shipGroup.getShipGroupSeqId().equals(assoc.getShipGroupSeqId()))
                .collect(Collectors.toList());

        if (matchingAssocs.isEmpty()) {
            return items;
        }

        return matchingAssocs.stream()
                .map(assoc -> findItem(items, assoc.getOrderItemSeqId()))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }

    private Optional<OrderItem> findItem(List<OrderItem> items, String orderItemSeqId) {
        return items.stream()
                .filter(item -> orderItemSeqId != null && orderItemSeqId.equals(item.getOrderItemSeqId()))
                .findFirst();
    }

    private OrderItemDto toItemDto(OrderItem item, BigDecimal receivedQuantity, BigDecimal pickedQuantity,
            BigDecimal reservedQuantity) {
        OrderItemDto dto = new OrderItemDto();
        dto.setOrderItemSeqId(item.getOrderItemSeqId());
        dto.setProductId(item.getProductId());
        dto.setProduct(new ProductDto(item.getProductId()));
        dto.setItemDescription(item.getItemDescription());
        dto.setItemType(new ItemTypeDto(item.getOrderItemTypeId()));
        dto.setRequiredByDate(item.getShipBeforeDate());
        dto.setUnitAmount(item.getUnitPrice());
        BigDecimal quantity = defaultIfNull(item.getQuantity(), BigDecimal.ZERO);
        dto.setQuantity(quantity);
        BigDecimal received = defaultIfNull(receivedQuantity, BigDecimal.ZERO);
        dto.setReceivedQuantity(received);
        dto.setRemainingQuantity(quantity.subtract(received).max(BigDecimal.ZERO));
        dto.setPickedQuantity(defaultIfNull(pickedQuantity, BigDecimal.ZERO));
        dto.setReservedQuantity(defaultIfNull(reservedQuantity, BigDecimal.ZERO));
        dto.setStatusId(item.getStatusId());
        dto.setStatusDescription(resolveStatusDescription(item.getStatusId()));
        return dto;
    }

    private CustomerPartyDto buildCustomer(String orderId) {
        String partyId = resolveRole(orderId, ROLE_BILL_TO_CUSTOMER);
        if (isBlank(partyId)) {
            return null;
        }
        CustomerPartyDto customer = new CustomerPartyDto();
        customer.setOrganization(new OrganizationDto(partyId));
        return customer;
    }

    private FirstPartDto buildFirstPart(String orderId) {
        FirstPartDto firstPart = new FirstPartDto();
        String customerPartyId = resolveRole(orderId, ROLE_BILL_TO_CUSTOMER);
        String vendorPartyId = resolveRole(orderId, ROLE_BILL_FROM_VENDOR);
        firstPart.setCustomerPartyId(customerPartyId);
        firstPart.setVendorPartyId(vendorPartyId);
        orderItemShipGroupRepository.findByOrderId(orderId).stream()
                .findFirst()
                .ifPresent(shipGroup -> {
                    firstPart.setFacilityId(shipGroup.getFacilityId());
                    firstPart.setOrderPartSeqId(shipGroup.getShipGroupSeqId());
                });
        return firstPart;
    }

    private OrderContentDto toContentDto(OrderContentInfo info) {
        OrderContentDto dto = new OrderContentDto();
        dto.setContentId(info.getContentId());
        dto.setDescription(info.getDescription());
        dto.setContentDate(info.getContentDate());
        dto.setContentLocation(info.getContentLocation());
        return dto;
    }

    private void storeOrderContentFile(String contentId, MultipartFile contentFile) {
        try {
            Files.createDirectories(ORDER_CONTENT_DIR);
            Path destination = resolveOrderContentPath(contentId);
            Files.copy(contentFile.getInputStream(), destination, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Failed to store content file");
        }
    }

    private Path resolveOrderContentPath(String contentId) {
        return ORDER_CONTENT_DIR.resolve(contentId);
    }

    public static class OrderContentDownload {
        private final Path filePath;
        private final String fileName;

        public OrderContentDownload(Path filePath, String fileName) {
            this.filePath = filePath;
            this.fileName = fileName;
        }

        public Path getFilePath() {
            return filePath;
        }

        public String getFileName() {
            return fileName;
        }
    }

    private OrderNoteDto toNoteDto(OrderNote note) {
        OrderNoteDto dto = new OrderNoteDto();
        dto.setId(note.getId());
        dto.setNoteText(note.getNoteText());
        dto.setNoteDate(note.getNoteDate());
        dto.setUserId(note.getUserId());
        return dto;
    }

    private StatusItem resolveStatus(String statusId) {
        if (isBlank(statusId)) {
            return null;
        }
        return statusItemRepository.findFirstByStatusIdOrderByIdAsc(statusId).orElse(null);
    }

    private String resolveStatusDescription(String statusId) {
        StatusItem statusItem = resolveStatus(statusId);
        return statusItem != null ? statusItem.getDescription() : statusId;
    }

    private String resolveRole(String orderId, String roleTypeId) {
        return orderRoleRepository.findByOrderId(orderId).stream()
                .filter(role -> roleTypeId.equalsIgnoreCase(role.getRoleTypeId()))
                .map(OrderRole::getPartyId)
                .findFirst()
                .orElse(null);
    }

    private BigDecimal calculatePartTotal(List<OrderItem> items) {
        return items.stream()
                .map(item -> defaultIfNull(item.getUnitPrice(), BigDecimal.ZERO)
                        .multiply(defaultIfNull(item.getQuantity(), BigDecimal.ONE)))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private String nextOrderItemSeqId(String orderId) {
        List<OrderItem> items = orderItemRepository.findByOrderId(orderId);
        int next = items.stream()
                .map(OrderItem::getOrderItemSeqId)
                .filter(seq -> seq != null && seq.matches("\\d+"))
                .map(Integer::parseInt)
                .max(Comparator.naturalOrder())
                .orElse(0) + 1;
        return String.format("%05d", next);
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }

    private void addRole(String orderId, String partyId, String roleTypeId) {
        if (isBlank(orderId) || isBlank(partyId) || isBlank(roleTypeId)) {
            return;
        }
        OrderRole role = new OrderRole();
        role.setOrderId(orderId);
        role.setPartyId(partyId);
        role.setRoleTypeId(roleTypeId);
        orderRoleRepository.save(role);
    }

    private List<OrderContactMechDto> buildOrderContactMechs(String orderId) {
        List<OrderContactMech> contactMechs = orderContactMechRepository.findByOrderId(orderId);
        if (contactMechs.isEmpty()) {
            return List.of();
        }

        List<String> contactMechIds = contactMechs.stream()
                .map(OrderContactMech::getContactMechId)
                .filter(value -> !isBlank(value))
                .distinct()
                .collect(Collectors.toList());

        Map<String, PostalAddress> addressMap = postalAddressRepository.findByContactMechIdIn(contactMechIds).stream()
                .filter(address -> !isBlank(address.getContactMechId()))
                .collect(Collectors.toMap(PostalAddress::getContactMechId, address -> address, (left, right) -> left));

        List<String> geoIds = addressMap.values().stream()
                .map(PostalAddress::getStateProvinceGeoId)
                .filter(value -> !isBlank(value))
                .distinct()
                .collect(Collectors.toList());
        Map<String, GeoDto> geoMap = geoRepository.findByGeoIdIn(geoIds).stream()
                .collect(Collectors.toMap(geo -> geo.getGeoId(), this::toGeoDto, (left, right) -> left));

        return contactMechs.stream()
                .map(contactMech -> toContactMechDto(contactMech, addressMap, geoMap))
                .collect(Collectors.toList());
    }

    private OrderContactMechDto toContactMechDto(
            OrderContactMech contactMech,
            Map<String, PostalAddress> addressMap,
            Map<String, GeoDto> geoMap) {
        OrderContactMechDto dto = new OrderContactMechDto();
        dto.setContactMechPurposeTypeId(contactMech.getContactMechPurposeTypeId());
        dto.setContactMechId(contactMech.getContactMechId());

        PostalAddress address = addressMap.get(contactMech.getContactMechId());
        if (address != null) {
            PostalAddressDto addressDto = toPostalAddressDto(address);
            dto.setPostalAddress(addressDto);
            GeoDto geo = geoMap.get(address.getStateProvinceGeoId());
            if (geo == null && !isBlank(address.getStateProvinceGeoId())) {
                geo = resolveGeo(address.getStateProvinceGeoId());
            }
            dto.setPostalAddressStateGeo(geo);
        }
        return dto;
    }

    private OrderContactMechDto toContactMechDto(OrderContactMech contactMech) {
        if (contactMech == null) {
            return null;
        }
        Map<String, PostalAddress> addressMap = new HashMap<>();
        Map<String, GeoDto> geoMap = new HashMap<>();
        if (!isBlank(contactMech.getContactMechId())) {
            postalAddressRepository.findByContactMechId(contactMech.getContactMechId())
                    .ifPresent(address -> {
                        addressMap.put(address.getContactMechId(), address);
                        GeoDto geo = resolveGeo(address.getStateProvinceGeoId());
                        if (geo != null && !isBlank(address.getStateProvinceGeoId())) {
                            geoMap.put(address.getStateProvinceGeoId(), geo);
                        }
                    });
        }
        return toContactMechDto(contactMech, addressMap, geoMap);
    }

    private OrderContactMechDto attachOrderAddress(
            String orderId,
            OrderAddressRequest request,
            String defaultPurpose,
            boolean assignShipGroup) {
        if (request == null || !hasAddressData(request)) {
            return null;
        }

        String purpose = firstNonBlank(request.getContactMechPurposeTypeId(), defaultPurpose);
        String contactMechId = firstNonBlank(request.getContactMechId(),
                "OCM" + UUID.randomUUID().toString().replace("-", "").toUpperCase(Locale.ROOT));
        PostalAddress address = postalAddressRepository.findByContactMechId(contactMechId)
                .orElseGet(PostalAddress::new);
        address.setContactMechId(contactMechId);
        address.setToName(request.getToName());
        address.setAddress1(request.getAddress1());
        address.setAddress2(request.getAddress2());
        address.setCity(request.getCity());
        address.setPostalCode(request.getPostalCode());
        address.setCountryGeoId(request.getCountryGeoId());
        address.setStateProvinceGeoId(request.getStateProvinceGeoId());
        postalAddressRepository.save(address);

        orderContactMechRepository.findByOrderIdAndContactMechPurposeTypeId(orderId, purpose)
                .forEach(orderContactMechRepository::delete);

        OrderContactMech contactMech = new OrderContactMech();
        contactMech.setOrderId(orderId);
        contactMech.setContactMechId(contactMechId);
        contactMech.setContactMechPurposeTypeId(purpose);
        contactMech = orderContactMechRepository.save(contactMech);

        if (assignShipGroup && PURPOSE_SHIPPING.equalsIgnoreCase(contactMech.getContactMechPurposeTypeId())) {
            orderItemShipGroupRepository.findByOrderIdAndShipGroupSeqId(orderId, "00001").ifPresent(shipGroup -> {
                shipGroup.setContactMechId(contactMechId);
                orderItemShipGroupRepository.save(shipGroup);
            });
        }

        return toContactMechDto(contactMech);
    }

    private boolean hasAddressData(OrderAddressRequest request) {
        return !isBlank(request.getAddress1())
                || !isBlank(request.getAddress2())
                || !isBlank(request.getCity())
                || !isBlank(request.getPostalCode())
                || !isBlank(request.getCountryGeoId())
                || !isBlank(request.getStateProvinceGeoId())
                || !isBlank(request.getToName());
    }

    private PostalAddressDto toPostalAddressDto(PostalAddress address) {
        PostalAddressDto dto = new PostalAddressDto();
        dto.setToName(address.getToName());
        dto.setAddress1(address.getAddress1());
        dto.setAddress2(address.getAddress2());
        dto.setCity(address.getCity());
        dto.setPostalCode(address.getPostalCode());
        dto.setCountryGeoId(address.getCountryGeoId());
        dto.setStateProvinceGeoId(address.getStateProvinceGeoId());
        dto.setStateProvinceGeo(resolveGeo(address.getStateProvinceGeoId()));
        return dto;
    }

    private GeoDto resolveGeo(String geoId) {
        if (isBlank(geoId)) {
            return null;
        }
        return geoRepository.findByGeoId(geoId)
                .map(geo -> new GeoDto(geo.getGeoName()))
                .orElse(new GeoDto(geoId));
    }

    private GeoDto toGeoDto(Geo geo) {
        if (geo == null) {
            return null;
        }
        return new GeoDto(geo.getGeoName());
    }

    private Optional<FacilityContactInfoDto> resolveShipFromContact(List<OrderContactMechDto> contactMechs) {
        return contactMechs.stream()
                .filter(contact -> "SHIPPING_LOCATION".equalsIgnoreCase(contact.getContactMechPurposeTypeId())
                        || "SHIP_ORIG_LOCATION".equalsIgnoreCase(contact.getContactMechPurposeTypeId()))
                .findFirst()
                .map(contact -> {
                    FacilityContactInfoDto info = new FacilityContactInfoDto();
                    info.setPostalAddress(contact.getPostalAddress());
                    info.setPostalAddressStateGeo(contact.getPostalAddressStateGeo());
                    return info;
                });
    }

    private OrderAdjustmentDto toAdjustmentDto(OrderAdjustment adjustment) {
        OrderAdjustmentDto dto = new OrderAdjustmentDto();
        dto.setOrderAdjustmentTypeId(adjustment.getOrderAdjustmentTypeId());
        dto.setOrderItemSeqId(adjustment.getOrderItemSeqId());
        dto.setShipGroupSeqId(adjustment.getShipGroupSeqId());
        dto.setDescription(adjustment.getDescription());
        dto.setAmount(adjustment.getAmount());
        return dto;
    }

    private OrderStatusDto toStatusDto(OrderStatus status) {
        OrderStatusDto dto = new OrderStatusDto();
        dto.setStatusId(status.getStatusId());
        dto.setOrderItemSeqId(status.getOrderItemSeqId());
        dto.setStatusDatetime(status.getStatusDatetime());
        return dto;
    }

    private void createOrderStatus(String orderId, String statusId) {
        OrderStatus status = new OrderStatus();
        status.setOrderId(orderId);
        status.setStatusId(statusId);
        status.setStatusDatetime(LocalDateTime.now());
        status.setStatusUserLogin("system");
        orderStatusRepository.save(status);
    }

    private void createItemStatus(String orderId, String orderItemSeqId, String statusId) {
        OrderStatus status = new OrderStatus();
        status.setOrderId(orderId);
        status.setOrderItemSeqId(orderItemSeqId);
        status.setStatusId(statusId);
        status.setStatusDatetime(LocalDateTime.now());
        status.setStatusUserLogin("system");
        orderStatusRepository.save(status);
    }

    private String resolveFacility(String orderId) {
        return orderItemShipGroupRepository.findByOrderId(orderId).stream()
                .map(OrderItemShipGroup::getFacilityId)
                .filter(value -> !isBlank(value))
                .findFirst()
                .orElse(null);
    }

    private String resolveVendor(String orderId) {
        return orderItemShipGroupRepository.findByOrderId(orderId).stream()
                .map(OrderItemShipGroup::getVendorPartyId)
                .filter(value -> !isBlank(value))
                .findFirst()
                .orElse(null);
    }

    private Map<String, BigDecimal> fetchReceivedQuantities(String orderId) {
        Map<String, BigDecimal> totals = new HashMap<>();
        try {
            String url = wmsBaseUrl + "/api/purchase-orders/" + orderId + "/receipts";
            WmsReceipt[] receipts = restTemplate.getForObject(url, WmsReceipt[].class);
            if (receipts == null) {
                return totals;
            }
            for (WmsReceipt receipt : receipts) {
                String key = receipt.getOrderItemSeqId();
                BigDecimal qty = toBigDecimal(receipt.getQuantityAccepted());
                totals.put(key, totals.getOrDefault(key, BigDecimal.ZERO).add(qty));
            }
        } catch (Exception ignored) {
            return totals;
        }
        return totals;
    }

    private Map<String, BigDecimal> fetchPickedQuantities(String orderId) {
        Map<String, BigDecimal> totals = new HashMap<>();
        try {
            String url = wmsBaseUrl + "/api/picklists/by-order/" + orderId;
            WmsPicklistSummary[] picklists = restTemplate.getForObject(url, WmsPicklistSummary[].class);
            if (picklists == null) {
                return totals;
            }
            for (WmsPicklistSummary picklist : picklists) {
                if (picklist.getItems() == null) {
                    continue;
                }
                for (WmsPicklistItemSummary item : picklist.getItems()) {
                    if (item.getOrderItemSeqId() == null) {
                        continue;
                    }
                    totals.put(item.getOrderItemSeqId(),
                            totals.getOrDefault(item.getOrderItemSeqId(), BigDecimal.ZERO)
                                    .add(defaultIfNull(item.getQuantity(), BigDecimal.ZERO)));
                }
            }
        } catch (Exception ignored) {
            return totals;
        }
        return totals;
    }

    private Map<String, BigDecimal> fetchReservedQuantities(String orderId) {
        Map<String, BigDecimal> totals = new HashMap<>();
        List<OrderItemShipGrpInvRes> reservations = orderItemShipGrpInvResRepository.findByOrderId(orderId);
        for (OrderItemShipGrpInvRes res : reservations) {
            if (isBlank(res.getInventoryItemId())) {
                continue;
            }
            String key = res.getOrderItemSeqId();
            BigDecimal qty = defaultIfNull(res.getQuantity(), BigDecimal.ZERO);
            totals.put(key, totals.getOrDefault(key, BigDecimal.ZERO).add(qty));
        }
        return totals;
    }

    public void cancelOrderItem(String orderId, String orderItemSeqId) {
        OrderHeader header = getOrderHeader(orderId);
        OrderItem item = orderItemRepository.findByOrderIdAndOrderItemSeqId(orderId, orderItemSeqId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Item not found"));

        if ("ITEM_CANCELLED".equals(item.getStatusId()) || "ITEM_COMPLETED".equals(item.getStatusId())) {
            return;
        }

        BigDecimal completedQty = BigDecimal.ZERO;
        if ("PURCHASE_ORDER".equals(header.getOrderTypeId())) {
            Map<String, BigDecimal> received = fetchReceivedQuantities(orderId);
            completedQty = received.getOrDefault(orderItemSeqId, BigDecimal.ZERO);
        } else {
            Map<String, BigDecimal> picked = fetchPickedQuantities(orderId);
            completedQty = picked.getOrDefault(orderItemSeqId, BigDecimal.ZERO);
        }

        if (completedQty.compareTo(BigDecimal.ZERO) > 0) {
            // Partially shipped/picked/received: Complete the item with current quantity,
            // cancel remainder
            item.setQuantity(completedQty);
            item.setStatusId("ITEM_COMPLETED");
            createItemStatus(orderId, orderItemSeqId, "ITEM_COMPLETED");
            orderItemRepository.save(item);

            // Release any reservations for this item
            List<OrderItemShipGrpInvRes> reservations = orderItemShipGrpInvResRepository.findByOrderId(orderId);
            reservations.stream()
                    .filter(res -> orderItemSeqId.equals(res.getOrderItemSeqId()))
                    .forEach(res -> {
                        orderItemShipGrpInvResRepository.delete(res);
                    });

        } else {
            // Not picked/shipped: Full cancellation
            item.setStatusId("ITEM_CANCELLED");
            createItemStatus(orderId, orderItemSeqId, "ITEM_CANCELLED");
            orderItemRepository.save(item);

            List<OrderItemShipGrpInvRes> reservations = orderItemShipGrpInvResRepository.findByOrderId(orderId);
            reservations.stream()
                    .filter(res -> orderItemSeqId.equals(res.getOrderItemSeqId()))
                    .forEach(orderItemShipGrpInvResRepository::delete);
        }

        // Trigger generic reserve/sync logic if needed
        // For now, simpler is better.
    }

    private void reserveInventoryForOrder(String orderId) {
        List<OrderItem> items = orderItemRepository.findByOrderId(orderId);
        if (items.isEmpty()) {
            return;
        }

        String facilityId = resolveFacility(orderId);
        if (isBlank(facilityId)) {
            return;
        }

        Map<String, BigDecimal> reservedByItem = new HashMap<>();
        Map<String, BigDecimal> backorderByItem = new HashMap<>();
        List<OrderItemShipGrpInvRes> existingReservations = orderItemShipGrpInvResRepository.findByOrderId(orderId);
        for (OrderItemShipGrpInvRes res : existingReservations) {
            if (!isBlank(res.getInventoryItemId())) {
                reservedByItem.merge(res.getOrderItemSeqId(), defaultIfNull(res.getQuantity(), BigDecimal.ZERO),
                        BigDecimal::add);
            }
            if (res.getQuantityNotAvailable() != null && res.getQuantityNotAvailable().compareTo(BigDecimal.ZERO) > 0) {
                backorderByItem.merge(res.getOrderItemSeqId(), res.getQuantityNotAvailable(), BigDecimal::add);
            }
        }

        List<WmsReserveItem> requestItems = new ArrayList<>();
        for (OrderItem item : items) {
            BigDecimal ordered = defaultIfNull(item.getQuantity(), BigDecimal.ZERO);
            BigDecimal reserved = reservedByItem.getOrDefault(item.getOrderItemSeqId(), BigDecimal.ZERO);
            BigDecimal remaining = ordered.subtract(reserved);
            if (remaining.compareTo(BigDecimal.ZERO) <= 0) {
                continue;
            }
            WmsReserveItem requestItem = new WmsReserveItem();
            requestItem.setOrderItemSeqId(item.getOrderItemSeqId());
            requestItem.setProductId(item.getProductId());
            requestItem.setQuantity(remaining);
            requestItems.add(requestItem);
        }

        if (requestItems.isEmpty()) {
            return;
        }

        WmsReserveRequest request = new WmsReserveRequest();
        request.setOrderId(orderId);
        request.setFacilityId(facilityId);
        request.setShipGroupSeqId(firstNonBlank(resolveShipGroup(orderId), "00001"));
        request.setItems(requestItems);

        String url = wmsBaseUrl + "/api/fulfillment/inventory/reserve";
        WmsReserveResponse response = restTemplate.postForObject(url, request, WmsReserveResponse.class);
        if (response == null || response.getItems() == null) {
            return;
        }

        for (WmsReserveItemResponse itemResponse : response.getItems()) {
            if (itemResponse.getAllocations() != null) {
                for (WmsReserveAllocation allocation : itemResponse.getAllocations()) {
                    OrderItemShipGrpInvRes reservation = new OrderItemShipGrpInvRes();
                    reservation.setOrderId(orderId);
                    reservation.setShipGroupSeqId(request.getShipGroupSeqId());
                    reservation.setOrderItemSeqId(itemResponse.getOrderItemSeqId());
                    reservation.setInventoryItemId(allocation.getInventoryItemId());
                    reservation.setReserveOrderEnumId(RESERVE_ORDER_ENUM);
                    reservation.setQuantity(allocation.getQuantity());
                    reservation.setCreatedDatetime(LocalDateTime.now());
                    reservation.setReservedDatetime(LocalDateTime.now());
                    orderItemShipGrpInvResRepository.save(reservation);
                }
            }

            BigDecimal notAvailable = defaultIfNull(itemResponse.getNotAvailableQuantity(), BigDecimal.ZERO);
            if (notAvailable.compareTo(BigDecimal.ZERO) > 0) {
                OrderItemShipGrpInvRes backorder = existingReservations.stream()
                        .filter(res -> itemResponse.getOrderItemSeqId().equals(res.getOrderItemSeqId())
                                && isBlank(res.getInventoryItemId()))
                        .findFirst()
                        .orElse(null);
                if (backorder == null) {
                    backorder = new OrderItemShipGrpInvRes();
                    backorder.setOrderId(orderId);
                    backorder.setShipGroupSeqId(request.getShipGroupSeqId());
                    backorder.setOrderItemSeqId(itemResponse.getOrderItemSeqId());
                    backorder.setReserveOrderEnumId(RESERVE_ORDER_ENUM);
                    backorder.setCreatedDatetime(LocalDateTime.now());
                }
                backorder.setQuantityNotAvailable(notAvailable);
                backorder.setReservedDatetime(LocalDateTime.now());
                orderItemShipGrpInvResRepository.save(backorder);
            } else if (backorderByItem.containsKey(itemResponse.getOrderItemSeqId())) {
                existingReservations.stream()
                        .filter(res -> itemResponse.getOrderItemSeqId().equals(res.getOrderItemSeqId())
                                && isBlank(res.getInventoryItemId())
                                && res.getQuantityNotAvailable() != null
                                && res.getQuantityNotAvailable().compareTo(BigDecimal.ZERO) > 0)
                        .forEach(res -> {
                            res.setQuantityNotAvailable(BigDecimal.ZERO);
                            orderItemShipGrpInvResRepository.save(res);
                        });
            }
        }
    }

    private ReservationStatusDto buildReservationStatus(String orderId) {
        List<OrderItem> items = orderItemRepository.findByOrderId(orderId);
        if (items.isEmpty()) {
            return new ReservationStatusDto(true, false);
        }
        List<OrderItemShipGrpInvRes> reservations = orderItemShipGrpInvResRepository.findByOrderId(orderId);
        Map<String, BigDecimal> reservedByItem = new HashMap<>();
        Map<String, BigDecimal> backorderByItem = new HashMap<>();
        for (OrderItemShipGrpInvRes res : reservations) {
            if (!isBlank(res.getInventoryItemId())) {
                reservedByItem.merge(res.getOrderItemSeqId(), defaultIfNull(res.getQuantity(), BigDecimal.ZERO),
                        BigDecimal::add);
            }
            if (res.getQuantityNotAvailable() != null && res.getQuantityNotAvailable().compareTo(BigDecimal.ZERO) > 0) {
                backorderByItem.merge(res.getOrderItemSeqId(), res.getQuantityNotAvailable(), BigDecimal::add);
            }
        }

        boolean fullyReserved = true;
        boolean hasBackorder = false;
        for (OrderItem item : items) {
            BigDecimal ordered = defaultIfNull(item.getQuantity(), BigDecimal.ZERO);
            BigDecimal reserved = reservedByItem.getOrDefault(item.getOrderItemSeqId(), BigDecimal.ZERO);
            BigDecimal notAvailable = backorderByItem.getOrDefault(item.getOrderItemSeqId(), BigDecimal.ZERO);
            if (reserved.compareTo(ordered) < 0) {
                fullyReserved = false;
            }
            if (notAvailable.compareTo(BigDecimal.ZERO) > 0) {
                hasBackorder = true;
            }
        }
        return new ReservationStatusDto(fullyReserved, hasBackorder);
    }

    private String resolveShipGroup(String orderId) {
        return orderItemShipGroupRepository.findByOrderId(orderId).stream()
                .map(OrderItemShipGroup::getShipGroupSeqId)
                .filter(value -> !isBlank(value))
                .findFirst()
                .orElse(null);
    }

    private void createInvoiceForOrder(OrderHeader header, Iterable<OrderItem> items, WmsReceiveResponse wmsResponse) {
        if (!orderItemBillingRepository.findByOrderId(header.getOrderId()).isEmpty()) {
            return;
        }

        String invoiceId = "INV"
                + UUID.randomUUID().toString().replace("-", "").substring(0, 8).toUpperCase(Locale.ROOT);
        Invoice invoice = new Invoice();
        invoice.setInvoiceId(invoiceId);
        invoice.setInvoiceTypeId(INVOICE_TYPE_PURCHASE);
        invoice.setPartyIdFrom(resolveVendor(header.getOrderId()));
        invoice.setPartyId(ORG_PARTY_ID);
        invoice.setRoleTypeId(ROLE_BILL_FROM_VENDOR);
        invoice.setStatusId(INVOICE_STATUS_READY);
        invoice.setInvoiceDate(LocalDateTime.now());
        invoice.setCurrencyUomId(firstNonBlank(header.getCurrencyUom(), DEFAULT_CURRENCY));
        invoiceRepository.save(invoice);

        int seq = 1;
        for (OrderItem item : items) {
            InvoiceItem invoiceItem = new InvoiceItem();
            invoiceItem.setInvoiceId(invoiceId);
            invoiceItem.setInvoiceItemSeqId(String.format("%05d", seq++));
            invoiceItem.setInvoiceItemTypeId("PINV_FPROD_ITEM");
            invoiceItem.setProductId(item.getProductId());
            invoiceItem.setQuantity(defaultIfNull(item.getQuantity(), BigDecimal.ZERO));
            BigDecimal amount = defaultIfNull(item.getUnitPrice(), BigDecimal.ZERO)
                    .multiply(defaultIfNull(item.getQuantity(), BigDecimal.ZERO));
            invoiceItem.setAmount(amount);
            invoiceItem.setDescription(item.getItemDescription());
            invoiceItemRepository.save(invoiceItem);

            OrderItemBilling billing = new OrderItemBilling();
            billing.setOrderId(header.getOrderId());
            billing.setOrderItemSeqId(item.getOrderItemSeqId());
            billing.setInvoiceId(invoiceId);
            billing.setInvoiceItemSeqId(invoiceItem.getInvoiceItemSeqId());
            billing.setQuantity(defaultIfNull(item.getQuantity(), BigDecimal.ZERO));
            billing.setAmount(amount);
            if (wmsResponse != null && wmsResponse.getReceipts() != null) {
                wmsResponse.getReceipts().stream()
                        .filter(receipt -> item.getOrderItemSeqId().equals(receipt.getOrderItemSeqId()))
                        .findFirst()
                        .ifPresent(receipt -> billing.setShipmentReceiptId(receipt.getReceiptId()));
            }
            orderItemBillingRepository.save(billing);
        }

        AcctgTrans trans = new AcctgTrans();
        trans.setAcctgTransId(
                "AT" + UUID.randomUUID().toString().replace("-", "").substring(0, 8).toUpperCase(Locale.ROOT));
        trans.setAcctgTransTypeId(ACCTG_TRANS_TYPE_PURCHASE);
        trans.setTransactionDate(LocalDateTime.now());
        trans.setIsPosted(Boolean.TRUE);
        trans.setPostedDate(LocalDateTime.now());
        trans.setGlFiscalTypeId("ACTUAL");
        trans.setPartyId(resolveVendor(header.getOrderId()));
        trans.setRoleTypeId(ROLE_BILL_FROM_VENDOR);
        trans.setInvoiceId(invoiceId);
        acctgTransRepository.save(trans);

        BigDecimal totalAmount = BigDecimal.ZERO;
        for (OrderItem item : items) {
            totalAmount = totalAmount.add(defaultIfNull(item.getUnitPrice(), BigDecimal.ZERO)
                    .multiply(defaultIfNull(item.getQuantity(), BigDecimal.ZERO)));
        }

        createAcctgEntry(trans.getAcctgTransId(), "00001", GL_ACCOUNT_UNINVOICED, totalAmount, Boolean.TRUE);
        createAcctgEntry(trans.getAcctgTransId(), "00002", GL_ACCOUNT_AP, totalAmount, Boolean.FALSE);
    }

    private void createAcctgEntry(String acctgTransId, String seqId, String glAccountId, BigDecimal amount,
            boolean debit) {
        AcctgTransEntry entry = new AcctgTransEntry();
        entry.setAcctgTransId(acctgTransId);
        entry.setAcctgTransEntrySeqId(seqId);
        entry.setAcctgTransEntryTypeId("_NA_");
        entry.setGlAccountId(glAccountId);
        entry.setOrganizationPartyId(ORG_PARTY_ID);
        entry.setAmount(amount);
        entry.setCurrencyUomId(DEFAULT_CURRENCY);
        entry.setOrigAmount(amount);
        entry.setOrigCurrencyUomId(DEFAULT_CURRENCY);
        entry.setDebitCreditFlag(debit);
        acctgTransEntryRepository.save(entry);
    }

    private BigDecimal toBigDecimal(String value) {
        if (isBlank(value)) {
            return BigDecimal.ZERO;
        }
        try {
            return new BigDecimal(value);
        } catch (NumberFormatException e) {
            return BigDecimal.ZERO;
        }
    }

    private static class WmsReceiveRequest {
        private String orderId;
        private String facilityId;
        private String vendorPartyId;
        private String ownerPartyId;
        private String shipGroupSeqId;
        private String currencyUomId;
        private LocalDateTime receivedDate;
        private List<WmsReceiveItem> items;

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getFacilityId() {
            return facilityId;
        }

        public void setFacilityId(String facilityId) {
            this.facilityId = facilityId;
        }

        public String getVendorPartyId() {
            return vendorPartyId;
        }

        public void setVendorPartyId(String vendorPartyId) {
            this.vendorPartyId = vendorPartyId;
        }

        public String getOwnerPartyId() {
            return ownerPartyId;
        }

        public void setOwnerPartyId(String ownerPartyId) {
            this.ownerPartyId = ownerPartyId;
        }

        public String getShipGroupSeqId() {
            return shipGroupSeqId;
        }

        public void setShipGroupSeqId(String shipGroupSeqId) {
            this.shipGroupSeqId = shipGroupSeqId;
        }

        public String getCurrencyUomId() {
            return currencyUomId;
        }

        public void setCurrencyUomId(String currencyUomId) {
            this.currencyUomId = currencyUomId;
        }

        public LocalDateTime getReceivedDate() {
            return receivedDate;
        }

        public void setReceivedDate(LocalDateTime receivedDate) {
            this.receivedDate = receivedDate;
        }

        public List<WmsReceiveItem> getItems() {
            return items;
        }

        public void setItems(List<WmsReceiveItem> items) {
            this.items = items;
        }
    }

    private static class WmsReceiveItem {
        private String orderItemSeqId;
        private String productId;
        private String quantity;
        private String unitCost;
        private String locationSeqId;

        public String getOrderItemSeqId() {
            return orderItemSeqId;
        }

        public void setOrderItemSeqId(String orderItemSeqId) {
            this.orderItemSeqId = orderItemSeqId;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getUnitCost() {
            return unitCost;
        }

        public void setUnitCost(String unitCost) {
            this.unitCost = unitCost;
        }

        public String getLocationSeqId() {
            return locationSeqId;
        }

        public void setLocationSeqId(String locationSeqId) {
            this.locationSeqId = locationSeqId;
        }
    }

    private static class WmsReceiveResponse {
        private String shipmentId;
        private List<WmsReceipt> receipts;

        public String getShipmentId() {
            return shipmentId;
        }

        public void setShipmentId(String shipmentId) {
            this.shipmentId = shipmentId;
        }

        public List<WmsReceipt> getReceipts() {
            return receipts;
        }

        public void setReceipts(List<WmsReceipt> receipts) {
            this.receipts = receipts;
        }
    }

    private static class WmsReceipt {
        private String orderItemSeqId;
        private String receiptId;
        private String inventoryItemId;
        private String quantityAccepted;

        public String getOrderItemSeqId() {
            return orderItemSeqId;
        }

        public void setOrderItemSeqId(String orderItemSeqId) {
            this.orderItemSeqId = orderItemSeqId;
        }

        public String getReceiptId() {
            return receiptId;
        }

        public void setReceiptId(String receiptId) {
            this.receiptId = receiptId;
        }

        public String getInventoryItemId() {
            return inventoryItemId;
        }

        public void setInventoryItemId(String inventoryItemId) {
            this.inventoryItemId = inventoryItemId;
        }

        public String getQuantityAccepted() {
            return quantityAccepted;
        }

        public void setQuantityAccepted(String quantityAccepted) {
            this.quantityAccepted = quantityAccepted;
        }
    }

    private static class WmsPicklistSummary {
        private String picklistId;
        private List<WmsPicklistItemSummary> items;

        public String getPicklistId() {
            return picklistId;
        }

        public void setPicklistId(String picklistId) {
            this.picklistId = picklistId;
        }

        public List<WmsPicklistItemSummary> getItems() {
            return items;
        }

        public void setItems(List<WmsPicklistItemSummary> items) {
            this.items = items;
        }
    }

    private static class WmsPicklistItemSummary {
        private String orderItemSeqId;
        private BigDecimal quantity;

        public String getOrderItemSeqId() {
            return orderItemSeqId;
        }

        public void setOrderItemSeqId(String orderItemSeqId) {
            this.orderItemSeqId = orderItemSeqId;
        }

        public BigDecimal getQuantity() {
            return quantity;
        }

        public void setQuantity(BigDecimal quantity) {
            this.quantity = quantity;
        }
    }

    private static class WmsReserveRequest {
        private String orderId;
        private String shipGroupSeqId;
        private String facilityId;
        private List<WmsReserveItem> items;

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getShipGroupSeqId() {
            return shipGroupSeqId;
        }

        public void setShipGroupSeqId(String shipGroupSeqId) {
            this.shipGroupSeqId = shipGroupSeqId;
        }

        public String getFacilityId() {
            return facilityId;
        }

        public void setFacilityId(String facilityId) {
            this.facilityId = facilityId;
        }

        public List<WmsReserveItem> getItems() {
            return items;
        }

        public void setItems(List<WmsReserveItem> items) {
            this.items = items;
        }
    }

    private static class WmsReserveItem {
        private String orderItemSeqId;
        private String productId;
        private BigDecimal quantity;

        public String getOrderItemSeqId() {
            return orderItemSeqId;
        }

        public void setOrderItemSeqId(String orderItemSeqId) {
            this.orderItemSeqId = orderItemSeqId;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public BigDecimal getQuantity() {
            return quantity;
        }

        public void setQuantity(BigDecimal quantity) {
            this.quantity = quantity;
        }
    }

    private static class WmsReserveResponse {
        private List<WmsReserveItemResponse> items;

        public List<WmsReserveItemResponse> getItems() {
            return items;
        }

        public void setItems(List<WmsReserveItemResponse> items) {
            this.items = items;
        }
    }

    private static class WmsReserveItemResponse {
        private String orderItemSeqId;
        private BigDecimal notAvailableQuantity;
        private List<WmsReserveAllocation> allocations;

        public String getOrderItemSeqId() {
            return orderItemSeqId;
        }

        public void setOrderItemSeqId(String orderItemSeqId) {
            this.orderItemSeqId = orderItemSeqId;
        }

        public BigDecimal getNotAvailableQuantity() {
            return notAvailableQuantity;
        }

        public void setNotAvailableQuantity(BigDecimal notAvailableQuantity) {
            this.notAvailableQuantity = notAvailableQuantity;
        }

        public List<WmsReserveAllocation> getAllocations() {
            return allocations;
        }

        public void setAllocations(List<WmsReserveAllocation> allocations) {
            this.allocations = allocations;
        }
    }

    private static class WmsReserveAllocation {
        private String inventoryItemId;
        private BigDecimal quantity;

        public String getInventoryItemId() {
            return inventoryItemId;
        }

        public void setInventoryItemId(String inventoryItemId) {
            this.inventoryItemId = inventoryItemId;
        }

        public BigDecimal getQuantity() {
            return quantity;
        }

        public void setQuantity(BigDecimal quantity) {
            this.quantity = quantity;
        }
    }

    private static class WmsPicklistRequest {
        private String orderId;
        private String facilityId;
        private String shipGroupSeqId;
        private String shipmentMethodTypeId;
        private List<WmsPicklistItem> items;

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getFacilityId() {
            return facilityId;
        }

        public void setFacilityId(String facilityId) {
            this.facilityId = facilityId;
        }

        public String getShipGroupSeqId() {
            return shipGroupSeqId;
        }

        public void setShipGroupSeqId(String shipGroupSeqId) {
            this.shipGroupSeqId = shipGroupSeqId;
        }

        public String getShipmentMethodTypeId() {
            return shipmentMethodTypeId;
        }

        public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
            this.shipmentMethodTypeId = shipmentMethodTypeId;
        }

        public List<WmsPicklistItem> getItems() {
            return items;
        }

        public void setItems(List<WmsPicklistItem> items) {
            this.items = items;
        }
    }

    private static class WmsPicklistItem {
        private String orderItemSeqId;
        private String productId;
        private String inventoryItemId;
        private BigDecimal quantity;

        public String getOrderItemSeqId() {
            return orderItemSeqId;
        }

        public void setOrderItemSeqId(String orderItemSeqId) {
            this.orderItemSeqId = orderItemSeqId;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getInventoryItemId() {
            return inventoryItemId;
        }

        public void setInventoryItemId(String inventoryItemId) {
            this.inventoryItemId = inventoryItemId;
        }

        public BigDecimal getQuantity() {
            return quantity;
        }

        public void setQuantity(BigDecimal quantity) {
            this.quantity = quantity;
        }
    }

    private static class WmsPicklistResponse {
        private String picklistId;
        private String picklistBinId;
        private String shipmentId;

        public String getPicklistId() {
            return picklistId;
        }

        public void setPicklistId(String picklistId) {
            this.picklistId = picklistId;
        }

        public String getPicklistBinId() {
            return picklistBinId;
        }

        public void setPicklistBinId(String picklistBinId) {
            this.picklistBinId = picklistBinId;
        }

        public String getShipmentId() {
            return shipmentId;
        }

        public void setShipmentId(String shipmentId) {
            this.shipmentId = shipmentId;
        }
    }

    private String firstNonBlank(String value, String fallback) {
        return isBlank(value) ? fallback : value;
    }

    private BigDecimal defaultIfNull(BigDecimal value, BigDecimal fallback) {
        return value == null ? fallback : value;
    }

    private List<String> fetchOrdersInPicklists() {
        try {
            String url = wmsBaseUrl + "/api/picklists/orders/ids";
            ResponseEntity<List<String>> response = restTemplate.exchange(
                    url,
                    org.springframework.http.HttpMethod.GET,
                    null,
                    new org.springframework.core.ParameterizedTypeReference<List<String>>() {
                    });
            return response.getBody() != null ? response.getBody() : List.of();
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }
}
