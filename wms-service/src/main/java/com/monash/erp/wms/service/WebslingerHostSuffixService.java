package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.WebslingerHostSuffix;
import com.monash.erp.wms.repository.WebslingerHostSuffixRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WebslingerHostSuffixService {

    private final WebslingerHostSuffixRepository repository;

    public WebslingerHostSuffixService(WebslingerHostSuffixRepository repository) {
        this.repository = repository;
    }

    public List<WebslingerHostSuffix> list() {
        return repository.findAll();
    }

    public WebslingerHostSuffix get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WebslingerHostSuffix %d not found".formatted(id)));
    }

    public WebslingerHostSuffix create(WebslingerHostSuffix entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WebslingerHostSuffix update(Long id, WebslingerHostSuffix entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WebslingerHostSuffix %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}