package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortInvReservation;
import com.monash.erp.mfg.repository.WorkEffortInvReservationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortInvReservationService {

    private final WorkEffortInvReservationRepository repository;

    public WorkEffortInvReservationService(WorkEffortInvReservationRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortInvReservation> list(String inventoryItemId) {
        if (isBlank(inventoryItemId)) {
            return repository.findAll();
        }
        return repository.findByInventoryItemId(inventoryItemId);
    }

    public WorkEffortInvReservation get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortInvReservation %d not found".formatted(id)));
    }

    public WorkEffortInvReservation create(WorkEffortInvReservation entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortInvReservation update(Long id, WorkEffortInvReservation entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortInvReservation %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }
}
