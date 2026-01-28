package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SalesForecastHistory;
import com.monash.erp.wms.repository.SalesForecastHistoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SalesForecastHistoryService {

    private final SalesForecastHistoryRepository repository;

    public SalesForecastHistoryService(SalesForecastHistoryRepository repository) {
        this.repository = repository;
    }

    public List<SalesForecastHistory> list() {
        return repository.findAll();
    }

    public SalesForecastHistory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesForecastHistory %d not found".formatted(id)));
    }

    public SalesForecastHistory create(SalesForecastHistory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SalesForecastHistory update(Long id, SalesForecastHistory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesForecastHistory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}