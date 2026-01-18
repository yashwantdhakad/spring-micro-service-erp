package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ContentApproval;
import com.monash.erp.wms.repository.ContentApprovalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentApprovalService {

    private final ContentApprovalRepository repository;

    public ContentApprovalService(ContentApprovalRepository repository) {
        this.repository = repository;
    }

    public List<ContentApproval> list() {
        return repository.findAll();
    }

    public ContentApproval get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentApproval %d not found".formatted(id)));
    }

    public ContentApproval create(ContentApproval entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentApproval update(Long id, ContentApproval entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentApproval %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}