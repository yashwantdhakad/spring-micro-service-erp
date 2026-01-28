package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CustRequestParty;
import com.monash.erp.oms.repository.CustRequestPartyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustRequestPartyService {

    private final CustRequestPartyRepository repository;

    public CustRequestPartyService(CustRequestPartyRepository repository) {
        this.repository = repository;
    }

    public List<CustRequestParty> list() {
        return repository.findAll();
    }

    public CustRequestParty get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestParty %d not found".formatted(id)));
    }

    public CustRequestParty create(CustRequestParty entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustRequestParty update(Long id, CustRequestParty entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestParty %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}