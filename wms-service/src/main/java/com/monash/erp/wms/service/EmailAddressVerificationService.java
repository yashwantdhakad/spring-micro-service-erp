package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.EmailAddressVerification;
import com.monash.erp.wms.repository.EmailAddressVerificationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmailAddressVerificationService {

    private final EmailAddressVerificationRepository repository;

    public EmailAddressVerificationService(EmailAddressVerificationRepository repository) {
        this.repository = repository;
    }

    public List<EmailAddressVerification> list() {
        return repository.findAll();
    }

    public EmailAddressVerification get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EmailAddressVerification %d not found".formatted(id)));
    }

    public EmailAddressVerification create(EmailAddressVerification entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EmailAddressVerification update(Long id, EmailAddressVerification entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EmailAddressVerification %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}