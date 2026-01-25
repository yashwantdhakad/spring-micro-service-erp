package com.monash.erp.oms.order.service;

import com.monash.erp.oms.common.entity.StatusItem;
import com.monash.erp.oms.common.repository.GeoRepository;
import com.monash.erp.oms.common.repository.StatusItemRepository;
import com.monash.erp.oms.order.dto.CustomerPartyDto;
import com.monash.erp.oms.order.dto.FacilityContactInfoDto;
import com.monash.erp.oms.order.dto.FacilityDto;
import com.monash.erp.oms.order.dto.FirstPartDto;
import com.monash.erp.oms.order.dto.FirstPartInfoDto;
import com.monash.erp.oms.order.dto.GeoDto;
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
import com.monash.erp.oms.order.dto.OrderItemRequest;
import com.monash.erp.oms.order.dto.OrderListItem;
import com.monash.erp.oms.order.dto.OrderListResponse;
import com.monash.erp.oms.order.dto.OrderListResponseMap;
import com.monash.erp.oms.order.dto.OrderNoteDto;
import com.monash.erp.oms.order.dto.OrderNoteRequest;
import com.monash.erp.oms.order.dto.OrderPartDto;
import com.monash.erp.oms.order.dto.OrderRoleDto;
import com.monash.erp.oms.order.dto.OrderStatusDto;
import com.monash.erp.oms.order.dto.OrganizationDto;
import com.monash.erp.oms.order.dto.PostalAddressDto;
import com.monash.erp.oms.order.dto.ProductDto;
import com.monash.erp.oms.order.entity.OrderAdjustment;
import com.monash.erp.oms.order.entity.OrderContactMech;
import com.monash.erp.oms.order.entity.OrderContent;
import com.monash.erp.oms.order.entity.OrderContentInfo;
import com.monash.erp.oms.order.entity.OrderHeader;
import com.monash.erp.oms.order.entity.OrderItem;
import com.monash.erp.oms.order.entity.OrderItemShipGroup;
import com.monash.erp.oms.order.entity.OrderItemShipGroupAssoc;
import com.monash.erp.oms.order.entity.OrderNote;
import com.monash.erp.oms.order.entity.OrderRole;
import com.monash.erp.oms.order.entity.OrderStatus;
import com.monash.erp.oms.order.entity.PostalAddress;
import com.monash.erp.oms.order.repository.OrderAdjustmentRepository;
import com.monash.erp.oms.order.repository.OrderContactMechRepository;
import com.monash.erp.oms.order.repository.OrderContentInfoRepository;
import com.monash.erp.oms.order.repository.OrderContentRepository;
import com.monash.erp.oms.order.repository.OrderHeaderRepository;
import com.monash.erp.oms.order.repository.OrderItemRepository;
import com.monash.erp.oms.order.repository.OrderItemShipGroupAssocRepository;
import com.monash.erp.oms.order.repository.OrderItemShipGroupRepository;
import com.monash.erp.oms.order.repository.OrderNoteRepository;
import com.monash.erp.oms.order.repository.OrderRoleRepository;
import com.monash.erp.oms.order.repository.OrderStatusRepository;
import com.monash.erp.oms.order.repository.PostalAddressRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class OrderCompositeService {

    private static final String DEFAULT_STATUS = "ORDER_CREATED";
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

    private final OrderHeaderRepository orderHeaderRepository;
    private final OrderItemRepository orderItemRepository;
    private final OrderItemShipGroupRepository orderItemShipGroupRepository;
    private final OrderItemShipGroupAssocRepository orderItemShipGroupAssocRepository;
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
            GeoRepository geoRepository
    ) {
        this.orderHeaderRepository = orderHeaderRepository;
        this.orderItemRepository = orderItemRepository;
        this.orderItemShipGroupRepository = orderItemShipGroupRepository;
        this.orderItemShipGroupAssocRepository = orderItemShipGroupAssocRepository;
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
    }

    public OrderListResponse listOrders(int page, int size, String queryString, String orderTypeId) {
        PageRequest pageable = PageRequest.of(Math.max(page, 0), size, Sort.by("id").descending());
        Page<OrderHeader> orders;
        if (isBlank(orderTypeId)) {
            orders = orderHeaderRepository.findAll(pageable);
        } else if (isBlank(queryString)) {
            orders = orderHeaderRepository.findByOrderTypeId(orderTypeId, pageable);
        } else {
            orders = orderHeaderRepository.findByOrderTypeIdAndOrderIdContainingIgnoreCaseOrOrderTypeIdAndOrderNameContainingIgnoreCase(
                    orderTypeId, queryString, orderTypeId, queryString, pageable);
        }

        List<OrderListItem> items = orders.getContent().stream()
                .map(this::toListItem)
                .collect(Collectors.toList());

        OrderListResponseMap responseMap = new OrderListResponseMap(items, orders.getTotalElements());
        return new OrderListResponse(responseMap);
    }

    public OrderDetailResponse getOrder(String orderId) {
        OrderHeader header = getOrderHeader(orderId);
        List<OrderContentDto> contents = orderContentInfoRepository.findByOrderId(orderId).stream()
                .map(this::toContentDto)
                .collect(Collectors.toList());

        List<OrderPartDto> parts = buildParts(orderId, header);
        List<OrderAdjustmentDto> adjustments = orderAdjustmentRepository.findByOrderId(orderId).stream()
                .map(this::toAdjustmentDto)
                .collect(Collectors.toList());

        OrderDetailResponse response = new OrderDetailResponse();
        response.setParts(parts);
        response.setContents(contents);
        response.setAdjustments(adjustments);
        return response;
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
        return response;
    }

    public OrderHeaderDto createOrder(OrderCreateRequest request) {
        OrderHeader header = new OrderHeader();
        header.setOrderTypeId(request.getOrderTypeEnumId());
        header.setEntryDate(LocalDateTime.now());
        header.setStatusId(DEFAULT_STATUS);
        header.setProductStoreId(request.getProductStoreId());
        header.setOriginFacilityId(request.getFacilityId());
        header.setCurrencyUom(DEFAULT_CURRENCY);
        header.setGrandTotal(BigDecimal.ZERO);
        header = orderHeaderRepository.save(header);

        header.setOrderId("ORD" + header.getId());
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
        orderItemShipGroupRepository.save(shipGroup);

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
        item.setEstimatedDeliveryDate(request.getEstimatedDeliveryDate());
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
        itemStatus.setStatusId(DEFAULT_ITEM_STATUS);
        itemStatus.setStatusDatetime(LocalDateTime.now());
        itemStatus.setStatusUserLogin("system");
        orderStatusRepository.save(itemStatus);

        if (header.getGrandTotal() == null) {
            header.setGrandTotal(BigDecimal.ZERO);
        }
        header.setGrandTotal(header.getGrandTotal().add(item.getUnitPrice().multiply(item.getQuantity())));
        orderHeaderRepository.save(header);

        return toItemDto(item);
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

    public OrderContentDto addContent(String orderId, String description, MultipartFile contentFile) {
        getOrderHeader(orderId);

        if (contentFile == null || contentFile.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "contentFile is required");
        }

        String contentId = "OCN" + UUID.randomUUID().toString().replace("-", "").toUpperCase(Locale.ROOT);
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

    private OrderHeader getOrderHeader(String orderId) {
        return orderHeaderRepository.findByOrderId(orderId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Order %s not found".formatted(orderId)));
    }

    private OrderListItem toListItem(OrderHeader order) {
        OrderListItem item = new OrderListItem();
        item.setOrderId(order.getOrderId());
        item.setEntryDate(order.getEntryDate());
        BigDecimal grandTotal = order.getGrandTotal();
        if (grandTotal == null) {
            grandTotal = orderItemRepository.findByOrderId(order.getOrderId()).stream()
                    .map(orderItem -> defaultIfNull(orderItem.getUnitPrice(), BigDecimal.ZERO)
                            .multiply(defaultIfNull(orderItem.getQuantity(), BigDecimal.ONE)))
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
        }
        item.setGrandTotal(grandTotal);
        item.setStatusDescription(resolveStatusDescription(order.getStatusId()));
        item.setStoreName(order.getProductStoreId());

        List<OrderItemShipGroup> shipGroups = orderItemShipGroupRepository.findByOrderId(order.getOrderId());
        if (!shipGroups.isEmpty()) {
            OrderItemShipGroup firstGroup = shipGroups.get(0);
            item.setFacilityName(firstGroup.getFacilityId());
            item.setVendorOrganizationName(firstGroup.getVendorPartyId());
        }

        String customerPartyId = resolveRole(order.getOrderId(), ROLE_BILL_TO_CUSTOMER);
        item.setCustomerName(customerPartyId);
        item.setOrganizationName(customerPartyId);

        BigDecimal quantityTotal = orderItemRepository.findByOrderId(order.getOrderId()).stream()
                .map(OrderItem::getQuantity)
                .filter(value -> value != null)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        item.setQuantityTotal(quantityTotal);
        return item;
    }

    private OrderHeaderDto toHeaderDto(OrderHeader orderHeader) {
        OrderHeaderDto dto = new OrderHeaderDto();
        dto.setOrderId(orderHeader.getOrderId());
        dto.setEntryDate(orderHeader.getEntryDate());
        dto.setCurrencyUomId(orderHeader.getCurrencyUom());
        dto.setProductStoreId(orderHeader.getProductStoreId());
        dto.setGrandTotal(orderHeader.getGrandTotal());
        return dto;
    }

    private List<OrderPartDto> buildParts(String orderId, OrderHeader header) {
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
            part.setStatus(resolveStatus(header.getStatusId()));
            part.setFacility(new FacilityDto(shipGroup.getFacilityId(), shipGroup.getFacilityId()));
            part.setCustomer(buildCustomer(orderId));
            part.setItems(partItems.stream().map(this::toItemDto).collect(Collectors.toList()));
            part.setPartTotal(calculatePartTotal(partItems));
            parts.add(part);
        }

        return parts;
    }

    private List<OrderItem> resolvePartItems(
            OrderItemShipGroup shipGroup,
            List<OrderItem> items,
            List<OrderItemShipGroupAssoc> assocs
    ) {
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

    private OrderItemDto toItemDto(OrderItem item) {
        OrderItemDto dto = new OrderItemDto();
        dto.setProductId(item.getProductId());
        dto.setProduct(new ProductDto(item.getProductId()));
        dto.setItemDescription(item.getItemDescription());
        dto.setItemType(new ItemTypeDto(item.getOrderItemTypeId()));
        dto.setRequiredByDate(item.getShipBeforeDate());
        dto.setUnitAmount(item.getUnitPrice());
        dto.setQuantity(item.getQuantity());
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
        return firstPart;
    }

    private OrderContentDto toContentDto(OrderContentInfo info) {
        OrderContentDto dto = new OrderContentDto();
        dto.setDescription(info.getDescription());
        dto.setContentDate(info.getContentDate());
        dto.setContentLocation(info.getContentLocation());
        return dto;
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
        return statusItemRepository.findByStatusId(statusId).orElse(null);
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
        return orderContactMechRepository.findByOrderId(orderId).stream()
                .map(this::toContactMechDto)
                .collect(Collectors.toList());
    }

    private OrderContactMechDto toContactMechDto(OrderContactMech contactMech) {
        OrderContactMechDto dto = new OrderContactMechDto();
        dto.setContactMechPurposeTypeId(contactMech.getContactMechPurposeTypeId());
        dto.setContactMechId(contactMech.getContactMechId());

        if (!isBlank(contactMech.getContactMechId())) {
            postalAddressRepository.findByContactMechId(contactMech.getContactMechId())
                    .ifPresent(address -> {
                        PostalAddressDto addressDto = toPostalAddressDto(address);
                        dto.setPostalAddress(addressDto);
                        GeoDto geo = resolveGeo(address.getStateProvinceGeoId());
                        dto.setPostalAddressStateGeo(geo);
                    });
        }
        return dto;
    }

    private OrderContactMechDto attachOrderAddress(
            String orderId,
            OrderAddressRequest request,
            String defaultPurpose,
            boolean assignShipGroup
    ) {
        if (request == null || !hasAddressData(request)) {
            return null;
        }

        String contactMechId = firstNonBlank(request.getContactMechId(), "OCM" + UUID.randomUUID().toString().replace("-", "").toUpperCase(Locale.ROOT));
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

        OrderContactMech contactMech = new OrderContactMech();
        contactMech.setOrderId(orderId);
        contactMech.setContactMechId(contactMechId);
        contactMech.setContactMechPurposeTypeId(firstNonBlank(request.getContactMechPurposeTypeId(), defaultPurpose));
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

    private String firstNonBlank(String value, String fallback) {
        return isBlank(value) ? fallback : value;
    }

    private BigDecimal defaultIfNull(BigDecimal value, BigDecimal fallback) {
        return value == null ? fallback : value;
    }
}
