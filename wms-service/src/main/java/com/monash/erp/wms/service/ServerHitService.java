package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ServerHit;
import com.monash.erp.wms.repository.ServerHitRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ServerHitService {

    private final ServerHitRepository repository;

    public ServerHitService(ServerHitRepository repository) {
        this.repository = repository;
    }

    public List<ServerHit> list() {
        return repository.findAll();
    }

    public ServerHit get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ServerHit %d not found".formatted(id)));
    }

    public ServerHit create(ServerHit entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ServerHit update(Long id, ServerHit entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ServerHit %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}