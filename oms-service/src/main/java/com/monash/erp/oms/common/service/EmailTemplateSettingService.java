package com.monash.erp.oms.common.service;

import com.monash.erp.oms.common.entity.EmailTemplateSetting;
import com.monash.erp.oms.common.repository.EmailTemplateSettingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmailTemplateSettingService {

    private final EmailTemplateSettingRepository repository;

    public EmailTemplateSettingService(EmailTemplateSettingRepository repository) {
        this.repository = repository;
    }

    public List<EmailTemplateSetting> list() {
        return repository.findAll();
    }

    public EmailTemplateSetting get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EmailTemplateSetting %d not found".formatted(id)));
    }

    public EmailTemplateSetting create(EmailTemplateSetting entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EmailTemplateSetting update(Long id, EmailTemplateSetting entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EmailTemplateSetting %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
