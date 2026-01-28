package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.PosTerminal;
import com.monash.erp.wms.repository.PosTerminalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PosTerminalService {

    private final PosTerminalRepository repository;

    public PosTerminalService(PosTerminalRepository repository) {
        this.repository = repository;
    }

    public List<PosTerminal> list() {
        return repository.findAll();
    }

    public PosTerminal get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PosTerminal %d not found".formatted(id)));
    }

    public PosTerminal create(PosTerminal entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PosTerminal update(Long id, PosTerminal entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PosTerminal %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}