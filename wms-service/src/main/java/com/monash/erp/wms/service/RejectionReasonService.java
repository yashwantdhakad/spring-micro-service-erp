package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.RejectionReason;
import com.monash.erp.wms.repository.RejectionReasonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RejectionReasonService {

    private final RejectionReasonRepository repository;

    public RejectionReasonService(RejectionReasonRepository repository) {
        this.repository = repository;
    }

    public List<RejectionReason> list() {
        return repository.findAll();
    }

    public RejectionReason get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RejectionReason %d not found".formatted(id)));
    }

    public RejectionReason create(RejectionReason entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RejectionReason update(Long id, RejectionReason entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RejectionReason %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}