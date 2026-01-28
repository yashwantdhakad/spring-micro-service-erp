package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.PosTerminalInternTx;
import com.monash.erp.wms.repository.PosTerminalInternTxRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PosTerminalInternTxService {

    private final PosTerminalInternTxRepository repository;

    public PosTerminalInternTxService(PosTerminalInternTxRepository repository) {
        this.repository = repository;
    }

    public List<PosTerminalInternTx> list() {
        return repository.findAll();
    }

    public PosTerminalInternTx get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PosTerminalInternTx %d not found".formatted(id)));
    }

    public PosTerminalInternTx create(PosTerminalInternTx entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PosTerminalInternTx update(Long id, PosTerminalInternTx entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PosTerminalInternTx %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}