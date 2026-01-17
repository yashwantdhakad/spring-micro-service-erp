package com.example.erp.mfg.ofbiz.service;

import com.example.erp.mfg.ofbiz.domain.TechDataCalendarExcDay;
import com.example.erp.mfg.ofbiz.repository.TechDataCalendarExcDayRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TechDataCalendarExcDayService {

    private final TechDataCalendarExcDayRepository repository;

    public TechDataCalendarExcDayService(TechDataCalendarExcDayRepository repository) {
        this.repository = repository;
    }

    public List<TechDataCalendarExcDay> list() {
        return repository.findAll();
    }

    public TechDataCalendarExcDay get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TechDataCalendarExcDay %d not found".formatted(id)));
    }

    public TechDataCalendarExcDay create(TechDataCalendarExcDay entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TechDataCalendarExcDay update(Long id, TechDataCalendarExcDay entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TechDataCalendarExcDay %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}