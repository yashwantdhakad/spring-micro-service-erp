package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ApplicationSandbox;
import com.monash.erp.wms.repository.ApplicationSandboxRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ApplicationSandboxService {

    private final ApplicationSandboxRepository repository;

    public ApplicationSandboxService(ApplicationSandboxRepository repository) {
        this.repository = repository;
    }

    public List<ApplicationSandbox> list() {
        return repository.findAll();
    }

    public ApplicationSandbox get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ApplicationSandbox %d not found".formatted(id)));
    }

    public ApplicationSandbox create(ApplicationSandbox entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ApplicationSandbox update(Long id, ApplicationSandbox entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ApplicationSandbox %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}