package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.Container;
import com.example.erp.wms.ofbiz.repository.ContainerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContainerService {

    private final ContainerRepository repository;

    public ContainerService(ContainerRepository repository) {
        this.repository = repository;
    }

    public List<Container> list() {
        return repository.findAll();
    }

    public Container get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Container %d not found".formatted(id)));
    }

    public Container create(Container entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Container update(Long id, Container entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Container %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}