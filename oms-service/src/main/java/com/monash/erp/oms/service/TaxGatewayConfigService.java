package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.TaxGatewayConfig;
import com.monash.erp.oms.repository.TaxGatewayConfigRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TaxGatewayConfigService {

    private final TaxGatewayConfigRepository repository;

    public TaxGatewayConfigService(TaxGatewayConfigRepository repository) {
        this.repository = repository;
    }

    public List<TaxGatewayConfig> list() {
        return repository.findAll();
    }

    public TaxGatewayConfig get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxGatewayConfig %d not found".formatted(id)));
    }

    public TaxGatewayConfig create(TaxGatewayConfig entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TaxGatewayConfig update(Long id, TaxGatewayConfig entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxGatewayConfig %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}