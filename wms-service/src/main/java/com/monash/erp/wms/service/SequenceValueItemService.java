package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SequenceValueItem;
import com.monash.erp.wms.repository.SequenceValueItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SequenceValueItemService {

    private final SequenceValueItemRepository repository;

    public SequenceValueItemService(SequenceValueItemRepository repository) {
        this.repository = repository;
    }

    public List<SequenceValueItem> list() {
        return repository.findAll();
    }

    public SequenceValueItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SequenceValueItem %d not found".formatted(id)));
    }

    public SequenceValueItem create(SequenceValueItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SequenceValueItem update(Long id, SequenceValueItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SequenceValueItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}