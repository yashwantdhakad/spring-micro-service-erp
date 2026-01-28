package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.WebslingerHostMapping;
import com.monash.erp.wms.repository.WebslingerHostMappingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WebslingerHostMappingService {

    private final WebslingerHostMappingRepository repository;

    public WebslingerHostMappingService(WebslingerHostMappingRepository repository) {
        this.repository = repository;
    }

    public List<WebslingerHostMapping> list() {
        return repository.findAll();
    }

    public WebslingerHostMapping get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WebslingerHostMapping %d not found".formatted(id)));
    }

    public WebslingerHostMapping create(WebslingerHostMapping entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WebslingerHostMapping update(Long id, WebslingerHostMapping entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WebslingerHostMapping %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}