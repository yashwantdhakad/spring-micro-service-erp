package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.GoogleCoShippingMethod;
import com.monash.erp.wms.repository.GoogleCoShippingMethodRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GoogleCoShippingMethodService {

    private final GoogleCoShippingMethodRepository repository;

    public GoogleCoShippingMethodService(GoogleCoShippingMethodRepository repository) {
        this.repository = repository;
    }

    public List<GoogleCoShippingMethod> list() {
        return repository.findAll();
    }

    public GoogleCoShippingMethod get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GoogleCoShippingMethod %d not found".formatted(id)));
    }

    public GoogleCoShippingMethod create(GoogleCoShippingMethod entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GoogleCoShippingMethod update(Long id, GoogleCoShippingMethod entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GoogleCoShippingMethod %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}