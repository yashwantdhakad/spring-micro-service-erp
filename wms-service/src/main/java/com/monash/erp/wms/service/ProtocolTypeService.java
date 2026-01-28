package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProtocolType;
import com.monash.erp.wms.repository.ProtocolTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProtocolTypeService {

    private final ProtocolTypeRepository repository;

    public ProtocolTypeService(ProtocolTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProtocolType> list() {
        return repository.findAll();
    }

    public ProtocolType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProtocolType %d not found".formatted(id)));
    }

    public ProtocolType create(ProtocolType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProtocolType update(Long id, ProtocolType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProtocolType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}