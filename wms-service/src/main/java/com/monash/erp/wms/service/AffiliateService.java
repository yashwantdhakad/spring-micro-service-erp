package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.Affiliate;
import com.monash.erp.wms.repository.AffiliateRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AffiliateService {

    private final AffiliateRepository repository;

    public AffiliateService(AffiliateRepository repository) {
        this.repository = repository;
    }

    public List<Affiliate> list() {
        return repository.findAll();
    }

    public Affiliate get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Affiliate %d not found".formatted(id)));
    }

    public Affiliate create(Affiliate entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Affiliate update(Long id, Affiliate entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Affiliate %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}