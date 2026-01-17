package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.PortalPage;
import com.example.erp.oms.common.repository.PortalPageRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PortalPageService {

    private final PortalPageRepository repository;

    public PortalPageService(PortalPageRepository repository) {
        this.repository = repository;
    }

    public List<PortalPage> list() {
        return repository.findAll();
    }

    public PortalPage get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PortalPage %d not found".formatted(id)));
    }

    public PortalPage create(PortalPage entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PortalPage update(Long id, PortalPage entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PortalPage %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
