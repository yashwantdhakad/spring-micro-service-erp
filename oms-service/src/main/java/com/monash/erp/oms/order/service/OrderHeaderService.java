package com.monash.erp.oms.order.service;

import com.monash.erp.oms.entity.OrderHeader;
import com.monash.erp.oms.order.dto.OrderHeaderDto;
import com.monash.erp.oms.order.mapper.OrderHeaderMapper;
import com.monash.erp.oms.order.repository.OrderHeaderRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderHeaderService {

    private final OrderHeaderRepository repository;
    private final OrderHeaderMapper mapper;

    public OrderHeaderService(OrderHeaderRepository repository, OrderHeaderMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<OrderHeaderDto> list() {
        return repository.findAll().stream()
                .map(mapper::toDTO)
                .toList();
    }

    public OrderHeaderDto get(Long id) {
        OrderHeader entity = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "OrderHeader %d not found".formatted(id)));
        return mapper.toDTO(entity);
    }

    @Transactional
    public OrderHeaderDto create(OrderHeaderDto dto) {
        if (dto.getOrderName() == null || dto.getOrderName().trim().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Order Name is required");
        }
        OrderHeader entity = mapper.toEntity(dto);
        entity.setId(null); // Ensure creation
        OrderHeader saved = repository.save(entity);
        return mapper.toDTO(saved);
    }

    @Transactional
    public OrderHeaderDto update(Long id, OrderHeaderDto dto) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderHeader %d not found".formatted(id));
        }
        OrderHeader entity = mapper.toEntity(dto);
        entity.setId(id);
        OrderHeader saved = repository.save(entity);
        return mapper.toDTO(saved);
    }

    @Transactional
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderHeader %d not found".formatted(id));
        }
        repository.deleteById(id);
    }
}
