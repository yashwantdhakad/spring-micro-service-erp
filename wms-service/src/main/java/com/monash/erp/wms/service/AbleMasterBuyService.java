package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.AbleMasterBuy;
import com.monash.erp.wms.repository.AbleMasterBuyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AbleMasterBuyService {

    private final AbleMasterBuyRepository repository;

    public AbleMasterBuyService(AbleMasterBuyRepository repository) {
        this.repository = repository;
    }

    public List<AbleMasterBuy> list() {
        return repository.findAll();
    }

    public AbleMasterBuy get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AbleMasterBuy %d not found".formatted(id)));
    }

    public AbleMasterBuy create(AbleMasterBuy entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AbleMasterBuy update(Long id, AbleMasterBuy entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AbleMasterBuy %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}