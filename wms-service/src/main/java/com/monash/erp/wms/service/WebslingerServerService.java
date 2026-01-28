package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.WebslingerServer;
import com.monash.erp.wms.repository.WebslingerServerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WebslingerServerService {

    private final WebslingerServerRepository repository;

    public WebslingerServerService(WebslingerServerRepository repository) {
        this.repository = repository;
    }

    public List<WebslingerServer> list() {
        return repository.findAll();
    }

    public WebslingerServer get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WebslingerServer %d not found".formatted(id)));
    }

    public WebslingerServer create(WebslingerServer entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WebslingerServer update(Long id, WebslingerServer entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WebslingerServer %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}