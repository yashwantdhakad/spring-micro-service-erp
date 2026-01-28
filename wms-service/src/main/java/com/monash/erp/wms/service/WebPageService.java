package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.WebPage;
import com.monash.erp.wms.repository.WebPageRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WebPageService {

    private final WebPageRepository repository;

    public WebPageService(WebPageRepository repository) {
        this.repository = repository;
    }

    public List<WebPage> list() {
        return repository.findAll();
    }

    public WebPage get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WebPage %d not found".formatted(id)));
    }

    public WebPage create(WebPage entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WebPage update(Long id, WebPage entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WebPage %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}