package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ServerHitBin;
import com.monash.erp.wms.repository.ServerHitBinRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ServerHitBinService {

    private final ServerHitBinRepository repository;

    public ServerHitBinService(ServerHitBinRepository repository) {
        this.repository = repository;
    }

    public List<ServerHitBin> list() {
        return repository.findAll();
    }

    public ServerHitBin get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ServerHitBin %d not found".formatted(id)));
    }

    public ServerHitBin create(ServerHitBin entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ServerHitBin update(Long id, ServerHitBin entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ServerHitBin %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}