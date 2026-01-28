package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.WebslingerServerBase;
import com.monash.erp.wms.repository.WebslingerServerBaseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WebslingerServerBaseService {

    private final WebslingerServerBaseRepository repository;

    public WebslingerServerBaseService(WebslingerServerBaseRepository repository) {
        this.repository = repository;
    }

    public List<WebslingerServerBase> list() {
        return repository.findAll();
    }

    public WebslingerServerBase get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WebslingerServerBase %d not found".formatted(id)));
    }

    public WebslingerServerBase create(WebslingerServerBase entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WebslingerServerBase update(Long id, WebslingerServerBase entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WebslingerServerBase %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}