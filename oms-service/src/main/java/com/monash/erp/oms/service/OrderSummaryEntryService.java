package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderSummaryEntry;
import com.monash.erp.oms.repository.OrderSummaryEntryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderSummaryEntryService {

    private final OrderSummaryEntryRepository repository;

    public OrderSummaryEntryService(OrderSummaryEntryRepository repository) {
        this.repository = repository;
    }

    public List<OrderSummaryEntry> list() {
        return repository.findAll();
    }

    public OrderSummaryEntry get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderSummaryEntry %d not found".formatted(id)));
    }

    public OrderSummaryEntry create(OrderSummaryEntry entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderSummaryEntry update(Long id, OrderSummaryEntry entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderSummaryEntry %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}