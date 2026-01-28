package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.BillingAccountTermAttr;
import com.monash.erp.oms.repository.BillingAccountTermAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BillingAccountTermAttrService {

    private final BillingAccountTermAttrRepository repository;

    public BillingAccountTermAttrService(BillingAccountTermAttrRepository repository) {
        this.repository = repository;
    }

    public List<BillingAccountTermAttr> list() {
        return repository.findAll();
    }

    public BillingAccountTermAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BillingAccountTermAttr %d not found".formatted(id)));
    }

    public BillingAccountTermAttr create(BillingAccountTermAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BillingAccountTermAttr update(Long id, BillingAccountTermAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BillingAccountTermAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}