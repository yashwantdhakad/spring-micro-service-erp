package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.TechDataCalendar;
import com.monash.erp.mfg.repository.TechDataCalendarRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TechDataCalendarService {

    private final TechDataCalendarRepository repository;

    public TechDataCalendarService(TechDataCalendarRepository repository) {
        this.repository = repository;
    }

    public List<TechDataCalendar> list() {
        return repository.findAll();
    }

    public TechDataCalendar get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TechDataCalendar %d not found".formatted(id)));
    }

    public TechDataCalendar create(TechDataCalendar entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TechDataCalendar update(Long id, TechDataCalendar entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TechDataCalendar %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}