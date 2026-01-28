package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.PosTerminalState;
import com.monash.erp.wms.repository.PosTerminalStateRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PosTerminalStateService {

    private final PosTerminalStateRepository repository;

    public PosTerminalStateService(PosTerminalStateRepository repository) {
        this.repository = repository;
    }

    public List<PosTerminalState> list() {
        return repository.findAll();
    }

    public PosTerminalState get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PosTerminalState %d not found".formatted(id)));
    }

    public PosTerminalState create(PosTerminalState entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PosTerminalState update(Long id, PosTerminalState entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PosTerminalState %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}