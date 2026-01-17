package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.AudioDataResource;
import com.example.erp.wms.ofbiz.repository.AudioDataResourceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AudioDataResourceService {

    private final AudioDataResourceRepository repository;

    public AudioDataResourceService(AudioDataResourceRepository repository) {
        this.repository = repository;
    }

    public List<AudioDataResource> list() {
        return repository.findAll();
    }

    public AudioDataResource get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AudioDataResource %d not found".formatted(id)));
    }

    public AudioDataResource create(AudioDataResource entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AudioDataResource update(Long id, AudioDataResource entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AudioDataResource %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}