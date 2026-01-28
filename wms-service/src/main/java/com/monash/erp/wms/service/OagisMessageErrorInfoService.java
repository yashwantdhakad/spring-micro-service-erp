package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.OagisMessageErrorInfo;
import com.monash.erp.wms.repository.OagisMessageErrorInfoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OagisMessageErrorInfoService {

    private final OagisMessageErrorInfoRepository repository;

    public OagisMessageErrorInfoService(OagisMessageErrorInfoRepository repository) {
        this.repository = repository;
    }

    public List<OagisMessageErrorInfo> list() {
        return repository.findAll();
    }

    public OagisMessageErrorInfo get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OagisMessageErrorInfo %d not found".formatted(id)));
    }

    public OagisMessageErrorInfo create(OagisMessageErrorInfo entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OagisMessageErrorInfo update(Long id, OagisMessageErrorInfo entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OagisMessageErrorInfo %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}