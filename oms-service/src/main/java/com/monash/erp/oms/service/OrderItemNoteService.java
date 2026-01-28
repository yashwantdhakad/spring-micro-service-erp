package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItemNote;
import com.monash.erp.oms.repository.OrderItemNoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemNoteService {

    private final OrderItemNoteRepository repository;

    public OrderItemNoteService(OrderItemNoteRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemNote> list() {
        return repository.findAll();
    }

    public OrderItemNote get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemNote %d not found".formatted(id)));
    }

    public OrderItemNote create(OrderItemNote entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemNote update(Long id, OrderItemNote entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemNote %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}