package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ShippingDocument;
import com.example.erp.wms.ofbiz.repository.ShippingDocumentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShippingDocumentService {

    private final ShippingDocumentRepository repository;

    public ShippingDocumentService(ShippingDocumentRepository repository) {
        this.repository = repository;
    }

    public List<ShippingDocument> list() {
        return repository.findAll();
    }

    public ShippingDocument get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShippingDocument %d not found".formatted(id)));
    }

    public ShippingDocument create(ShippingDocument entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShippingDocument update(Long id, ShippingDocument entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShippingDocument %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}