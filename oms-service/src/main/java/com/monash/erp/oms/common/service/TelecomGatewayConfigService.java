package com.monash.erp.oms.common.service;

import com.monash.erp.oms.common.entity.TelecomGatewayConfig;
import com.monash.erp.oms.common.repository.TelecomGatewayConfigRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TelecomGatewayConfigService {

    private final TelecomGatewayConfigRepository repository;

    public TelecomGatewayConfigService(TelecomGatewayConfigRepository repository) {
        this.repository = repository;
    }

    public List<TelecomGatewayConfig> list() {
        return repository.findAll();
    }

    public TelecomGatewayConfig get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TelecomGatewayConfig %d not found".formatted(id)));
    }

    public TelecomGatewayConfig create(TelecomGatewayConfig entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TelecomGatewayConfig update(Long id, TelecomGatewayConfig entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TelecomGatewayConfig %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
