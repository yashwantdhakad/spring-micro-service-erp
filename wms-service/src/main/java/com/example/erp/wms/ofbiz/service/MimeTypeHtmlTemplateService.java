package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.MimeTypeHtmlTemplate;
import com.example.erp.wms.ofbiz.repository.MimeTypeHtmlTemplateRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MimeTypeHtmlTemplateService {

    private final MimeTypeHtmlTemplateRepository repository;

    public MimeTypeHtmlTemplateService(MimeTypeHtmlTemplateRepository repository) {
        this.repository = repository;
    }

    public List<MimeTypeHtmlTemplate> list() {
        return repository.findAll();
    }

    public MimeTypeHtmlTemplate get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "MimeTypeHtmlTemplate %d not found".formatted(id)));
    }

    public MimeTypeHtmlTemplate create(MimeTypeHtmlTemplate entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public MimeTypeHtmlTemplate update(Long id, MimeTypeHtmlTemplate entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "MimeTypeHtmlTemplate %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}