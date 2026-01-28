package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SalesForecast;
import com.monash.erp.wms.repository.SalesForecastRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SalesForecastService {

    private final SalesForecastRepository repository;

    public SalesForecastService(SalesForecastRepository repository) {
        this.repository = repository;
    }

    public List<SalesForecast> list() {
        return repository.findAll();
    }

    public SalesForecast get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesForecast %d not found".formatted(id)));
    }

    public SalesForecast create(SalesForecast entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SalesForecast update(Long id, SalesForecast entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesForecast %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}