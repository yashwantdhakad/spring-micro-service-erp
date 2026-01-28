package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItemPriceInfo;
import com.monash.erp.oms.repository.OrderItemPriceInfoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemPriceInfoService {

    private final OrderItemPriceInfoRepository repository;

    public OrderItemPriceInfoService(OrderItemPriceInfoRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemPriceInfo> list() {
        return repository.findAll();
    }

    public OrderItemPriceInfo get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemPriceInfo %d not found".formatted(id)));
    }

    public OrderItemPriceInfo create(OrderItemPriceInfo entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemPriceInfo update(Long id, OrderItemPriceInfo entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemPriceInfo %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}