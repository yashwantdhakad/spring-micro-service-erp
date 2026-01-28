package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementItem;
import com.monash.erp.oms.repository.AgreementItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementItemService {

    private final AgreementItemRepository repository;

    public AgreementItemService(AgreementItemRepository repository) {
        this.repository = repository;
    }

    public List<AgreementItem> list() {
        return repository.findAll();
    }

    public AgreementItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementItem %d not found".formatted(id)));
    }

    public AgreementItem create(AgreementItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementItem update(Long id, AgreementItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}