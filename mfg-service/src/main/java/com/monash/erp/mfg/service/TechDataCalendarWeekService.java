package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.TechDataCalendarWeek;
import com.monash.erp.mfg.repository.TechDataCalendarWeekRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TechDataCalendarWeekService {

    private final TechDataCalendarWeekRepository repository;

    public TechDataCalendarWeekService(TechDataCalendarWeekRepository repository) {
        this.repository = repository;
    }

    public List<TechDataCalendarWeek> list() {
        return repository.findAll();
    }

    public TechDataCalendarWeek get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TechDataCalendarWeek %d not found".formatted(id)));
    }

    public TechDataCalendarWeek create(TechDataCalendarWeek entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TechDataCalendarWeek update(Long id, TechDataCalendarWeek entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TechDataCalendarWeek %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}