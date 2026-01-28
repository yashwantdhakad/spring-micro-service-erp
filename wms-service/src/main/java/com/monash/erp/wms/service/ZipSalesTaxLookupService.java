package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ZipSalesTaxLookup;
import com.monash.erp.wms.repository.ZipSalesTaxLookupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ZipSalesTaxLookupService {

    private final ZipSalesTaxLookupRepository repository;

    public ZipSalesTaxLookupService(ZipSalesTaxLookupRepository repository) {
        this.repository = repository;
    }

    public List<ZipSalesTaxLookup> list() {
        return repository.findAll();
    }

    public ZipSalesTaxLookup get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ZipSalesTaxLookup %d not found".formatted(id)));
    }

    public ZipSalesTaxLookup create(ZipSalesTaxLookup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ZipSalesTaxLookup update(Long id, ZipSalesTaxLookup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ZipSalesTaxLookup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}