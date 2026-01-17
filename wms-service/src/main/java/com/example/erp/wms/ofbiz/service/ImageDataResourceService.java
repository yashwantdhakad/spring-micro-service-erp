package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ImageDataResource;
import com.example.erp.wms.ofbiz.repository.ImageDataResourceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ImageDataResourceService {

    private final ImageDataResourceRepository repository;

    public ImageDataResourceService(ImageDataResourceRepository repository) {
        this.repository = repository;
    }

    public List<ImageDataResource> list() {
        return repository.findAll();
    }

    public ImageDataResource get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ImageDataResource %d not found".formatted(id)));
    }

    public ImageDataResource create(ImageDataResource entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ImageDataResource update(Long id, ImageDataResource entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ImageDataResource %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}