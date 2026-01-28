package com.monash.erp.party.service;

import com.monash.erp.party.entity.PersonTraining;
import com.monash.erp.party.repository.PersonTrainingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PersonTrainingService {

    private final PersonTrainingRepository repository;

    public PersonTrainingService(PersonTrainingRepository repository) {
        this.repository = repository;
    }

    public List<PersonTraining> list() {
        return repository.findAll();
    }

    public PersonTraining get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PersonTraining %d not found".formatted(id)));
    }

    public PersonTraining create(PersonTraining entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PersonTraining update(Long id, PersonTraining entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PersonTraining %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}