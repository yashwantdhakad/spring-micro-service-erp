package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.AcctgTransTypeAttr;
import com.example.erp.oms.accounting.repository.AcctgTransTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AcctgTransTypeAttrService {

    private final AcctgTransTypeAttrRepository repository;

    public AcctgTransTypeAttrService(AcctgTransTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<AcctgTransTypeAttr> list() {
        return repository.findAll();
    }

    public AcctgTransTypeAttr get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AcctgTransTypeAttr %d not found".formatted(id)));
    }

    public AcctgTransTypeAttr create(AcctgTransTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AcctgTransTypeAttr update(Long id, AcctgTransTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AcctgTransTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
