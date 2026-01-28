package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.CAGCode;
import com.monash.erp.wms.repository.CAGCodeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CAGCodeService {

    private final CAGCodeRepository repository;

    public CAGCodeService(CAGCodeRepository repository) {
        this.repository = repository;
    }

    public List<CAGCode> list() {
        return repository.findAll();
    }

    public CAGCode get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CAGCode %d not found".formatted(id)));
    }

    public CAGCode create(CAGCode entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CAGCode update(Long id, CAGCode entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CAGCode %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}