package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.PosTerminalLog;
import com.monash.erp.wms.repository.PosTerminalLogRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PosTerminalLogService {

    private final PosTerminalLogRepository repository;

    public PosTerminalLogService(PosTerminalLogRepository repository) {
        this.repository = repository;
    }

    public List<PosTerminalLog> list() {
        return repository.findAll();
    }

    public PosTerminalLog get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PosTerminalLog %d not found".formatted(id)));
    }

    public PosTerminalLog create(PosTerminalLog entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PosTerminalLog update(Long id, PosTerminalLog entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PosTerminalLog %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}