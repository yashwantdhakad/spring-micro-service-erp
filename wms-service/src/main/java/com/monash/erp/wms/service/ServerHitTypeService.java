package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ServerHitType;
import com.monash.erp.wms.repository.ServerHitTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ServerHitTypeService {

    private final ServerHitTypeRepository repository;

    public ServerHitTypeService(ServerHitTypeRepository repository) {
        this.repository = repository;
    }

    public List<ServerHitType> list() {
        return repository.findAll();
    }

    public ServerHitType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ServerHitType %d not found".formatted(id)));
    }

    public ServerHitType create(ServerHitType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ServerHitType update(Long id, ServerHitType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ServerHitType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}