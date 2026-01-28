package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CustRequestStatus;
import com.monash.erp.oms.repository.CustRequestStatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustRequestStatusService {

    private final CustRequestStatusRepository repository;

    public CustRequestStatusService(CustRequestStatusRepository repository) {
        this.repository = repository;
    }

    public List<CustRequestStatus> list() {
        return repository.findAll();
    }

    public CustRequestStatus get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestStatus %d not found".formatted(id)));
    }

    public CustRequestStatus create(CustRequestStatus entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustRequestStatus update(Long id, CustRequestStatus entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestStatus %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}