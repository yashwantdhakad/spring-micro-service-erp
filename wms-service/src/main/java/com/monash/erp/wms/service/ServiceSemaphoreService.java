package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ServiceSemaphore;
import com.monash.erp.wms.repository.ServiceSemaphoreRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ServiceSemaphoreService {

    private final ServiceSemaphoreRepository repository;

    public ServiceSemaphoreService(ServiceSemaphoreRepository repository) {
        this.repository = repository;
    }

    public List<ServiceSemaphore> list() {
        return repository.findAll();
    }

    public ServiceSemaphore get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ServiceSemaphore %d not found".formatted(id)));
    }

    public ServiceSemaphore create(ServiceSemaphore entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ServiceSemaphore update(Long id, ServiceSemaphore entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ServiceSemaphore %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}