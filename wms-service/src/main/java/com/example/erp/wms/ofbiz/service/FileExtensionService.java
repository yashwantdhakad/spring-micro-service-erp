package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.FileExtension;
import com.example.erp.wms.ofbiz.repository.FileExtensionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FileExtensionService {

    private final FileExtensionRepository repository;

    public FileExtensionService(FileExtensionRepository repository) {
        this.repository = repository;
    }

    public List<FileExtension> list() {
        return repository.findAll();
    }

    public FileExtension get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FileExtension %d not found".formatted(id)));
    }

    public FileExtension create(FileExtension entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FileExtension update(Long id, FileExtension entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FileExtension %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}