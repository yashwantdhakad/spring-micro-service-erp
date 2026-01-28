package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SalesForecastDetail;
import com.monash.erp.wms.repository.SalesForecastDetailRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SalesForecastDetailService {

    private final SalesForecastDetailRepository repository;

    public SalesForecastDetailService(SalesForecastDetailRepository repository) {
        this.repository = repository;
    }

    public List<SalesForecastDetail> list() {
        return repository.findAll();
    }

    public SalesForecastDetail get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesForecastDetail %d not found".formatted(id)));
    }

    public SalesForecastDetail create(SalesForecastDetail entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SalesForecastDetail update(Long id, SalesForecastDetail entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesForecastDetail %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}