package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.TechDataCalendarExcWeek;
import com.monash.erp.mfg.repository.TechDataCalendarExcWeekRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TechDataCalendarExcWeekService {

    private final TechDataCalendarExcWeekRepository repository;

    public TechDataCalendarExcWeekService(TechDataCalendarExcWeekRepository repository) {
        this.repository = repository;
    }

    public List<TechDataCalendarExcWeek> list() {
        return repository.findAll();
    }

    public TechDataCalendarExcWeek get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TechDataCalendarExcWeek %d not found".formatted(id)));
    }

    public TechDataCalendarExcWeek create(TechDataCalendarExcWeek entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TechDataCalendarExcWeek update(Long id, TechDataCalendarExcWeek entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TechDataCalendarExcWeek %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}