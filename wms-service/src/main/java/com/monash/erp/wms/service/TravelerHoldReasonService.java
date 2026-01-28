package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TravelerHoldReason;
import com.monash.erp.wms.repository.TravelerHoldReasonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TravelerHoldReasonService {

    private final TravelerHoldReasonRepository repository;

    public TravelerHoldReasonService(TravelerHoldReasonRepository repository) {
        this.repository = repository;
    }

    public List<TravelerHoldReason> list() {
        return repository.findAll();
    }

    public TravelerHoldReason get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TravelerHoldReason %d not found".formatted(id)));
    }

    public TravelerHoldReason create(TravelerHoldReason entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TravelerHoldReason update(Long id, TravelerHoldReason entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TravelerHoldReason %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}