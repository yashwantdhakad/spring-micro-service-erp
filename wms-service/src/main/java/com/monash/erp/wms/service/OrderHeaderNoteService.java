package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.OrderHeaderNote;
import com.monash.erp.wms.repository.OrderHeaderNoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderHeaderNoteService {

    private final OrderHeaderNoteRepository repository;

    public OrderHeaderNoteService(OrderHeaderNoteRepository repository) {
        this.repository = repository;
    }

    public List<OrderHeaderNote> list() {
        return repository.findAll();
    }

    public OrderHeaderNote get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderHeaderNote %d not found".formatted(id)));
    }

    public OrderHeaderNote create(OrderHeaderNote entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderHeaderNote update(Long id, OrderHeaderNote entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderHeaderNote %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}