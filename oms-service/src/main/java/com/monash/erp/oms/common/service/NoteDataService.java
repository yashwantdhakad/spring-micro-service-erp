package com.monash.erp.oms.common.service;

import com.monash.erp.oms.common.entity.NoteData;
import com.monash.erp.oms.common.repository.NoteDataRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class NoteDataService {

    private final NoteDataRepository repository;

    public NoteDataService(NoteDataRepository repository) {
        this.repository = repository;
    }

    public List<NoteData> list() {
        return repository.findAll();
    }

    public NoteData get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "NoteData %d not found".formatted(id)));
    }

    public NoteData create(NoteData entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public NoteData update(Long id, NoteData entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NoteData %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
