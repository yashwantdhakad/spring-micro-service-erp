package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.RecurrenceInfo;
import com.monash.erp.wms.repository.RecurrenceInfoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RecurrenceInfoService {

    private final RecurrenceInfoRepository repository;

    public RecurrenceInfoService(RecurrenceInfoRepository repository) {
        this.repository = repository;
    }

    public List<RecurrenceInfo> list() {
        return repository.findAll();
    }

    public RecurrenceInfo get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RecurrenceInfo %d not found".formatted(id)));
    }

    public RecurrenceInfo create(RecurrenceInfo entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RecurrenceInfo update(Long id, RecurrenceInfo entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RecurrenceInfo %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}