package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TerminationReason;
import com.monash.erp.wms.repository.TerminationReasonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TerminationReasonService {

    private final TerminationReasonRepository repository;

    public TerminationReasonService(TerminationReasonRepository repository) {
        this.repository = repository;
    }

    public List<TerminationReason> list() {
        return repository.findAll();
    }

    public TerminationReason get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TerminationReason %d not found".formatted(id)));
    }

    public TerminationReason create(TerminationReason entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TerminationReason update(Long id, TerminationReason entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TerminationReason %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}