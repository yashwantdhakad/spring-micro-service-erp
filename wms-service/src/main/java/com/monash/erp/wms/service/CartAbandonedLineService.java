package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.CartAbandonedLine;
import com.monash.erp.wms.repository.CartAbandonedLineRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CartAbandonedLineService {

    private final CartAbandonedLineRepository repository;

    public CartAbandonedLineService(CartAbandonedLineRepository repository) {
        this.repository = repository;
    }

    public List<CartAbandonedLine> list() {
        return repository.findAll();
    }

    public CartAbandonedLine get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CartAbandonedLine %d not found".formatted(id)));
    }

    public CartAbandonedLine create(CartAbandonedLine entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CartAbandonedLine update(Long id, CartAbandonedLine entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CartAbandonedLine %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}