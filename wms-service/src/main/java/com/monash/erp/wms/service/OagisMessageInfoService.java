package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.OagisMessageInfo;
import com.monash.erp.wms.repository.OagisMessageInfoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OagisMessageInfoService {

    private final OagisMessageInfoRepository repository;

    public OagisMessageInfoService(OagisMessageInfoRepository repository) {
        this.repository = repository;
    }

    public List<OagisMessageInfo> list() {
        return repository.findAll();
    }

    public OagisMessageInfo get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OagisMessageInfo %d not found".formatted(id)));
    }

    public OagisMessageInfo create(OagisMessageInfo entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OagisMessageInfo update(Long id, OagisMessageInfo entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OagisMessageInfo %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}