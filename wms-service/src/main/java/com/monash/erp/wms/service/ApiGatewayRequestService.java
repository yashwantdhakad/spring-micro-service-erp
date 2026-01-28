package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ApiGatewayRequest;
import com.monash.erp.wms.repository.ApiGatewayRequestRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ApiGatewayRequestService {

    private final ApiGatewayRequestRepository repository;

    public ApiGatewayRequestService(ApiGatewayRequestRepository repository) {
        this.repository = repository;
    }

    public List<ApiGatewayRequest> list() {
        return repository.findAll();
    }

    public ApiGatewayRequest get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ApiGatewayRequest %d not found".formatted(id)));
    }

    public ApiGatewayRequest create(ApiGatewayRequest entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ApiGatewayRequest update(Long id, ApiGatewayRequest entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ApiGatewayRequest %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}