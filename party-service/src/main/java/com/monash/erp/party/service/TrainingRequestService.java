package com.monash.erp.party.service;

import com.monash.erp.party.entity.TrainingRequest;
import com.monash.erp.party.repository.TrainingRequestRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TrainingRequestService {

    private final TrainingRequestRepository repository;

    public TrainingRequestService(TrainingRequestRepository repository) {
        this.repository = repository;
    }

    public List<TrainingRequest> list() {
        return repository.findAll();
    }

    public TrainingRequest get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TrainingRequest %d not found".formatted(id)));
    }

    public TrainingRequest create(TrainingRequest entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TrainingRequest update(Long id, TrainingRequest entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TrainingRequest %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}