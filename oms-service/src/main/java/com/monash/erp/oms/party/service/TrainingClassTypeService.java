package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.TrainingClassType;
import com.monash.erp.oms.party.repository.TrainingClassTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TrainingClassTypeService {

    private final TrainingClassTypeRepository repository;

    public TrainingClassTypeService(TrainingClassTypeRepository repository) {
        this.repository = repository;
    }

    public List<TrainingClassType> list() {
        return repository.findAll();
    }

    public TrainingClassType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TrainingClassType %d not found".formatted(id)));
    }

    public TrainingClassType create(TrainingClassType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TrainingClassType update(Long id, TrainingClassType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TrainingClassType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}