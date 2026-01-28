package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.TaxGatewayConfigType;
import com.monash.erp.oms.repository.TaxGatewayConfigTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TaxGatewayConfigTypeService {

    private final TaxGatewayConfigTypeRepository repository;

    public TaxGatewayConfigTypeService(TaxGatewayConfigTypeRepository repository) {
        this.repository = repository;
    }

    public List<TaxGatewayConfigType> list() {
        return repository.findAll();
    }

    public TaxGatewayConfigType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxGatewayConfigType %d not found".formatted(id)));
    }

    public TaxGatewayConfigType create(TaxGatewayConfigType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TaxGatewayConfigType update(Long id, TaxGatewayConfigType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxGatewayConfigType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}