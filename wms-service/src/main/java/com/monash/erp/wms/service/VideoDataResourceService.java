package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.VideoDataResource;
import com.monash.erp.wms.repository.VideoDataResourceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class VideoDataResourceService {

    private final VideoDataResourceRepository repository;

    public VideoDataResourceService(VideoDataResourceRepository repository) {
        this.repository = repository;
    }

    public List<VideoDataResource> list() {
        return repository.findAll();
    }

    public VideoDataResource get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "VideoDataResource %d not found".formatted(id)));
    }

    public VideoDataResource create(VideoDataResource entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public VideoDataResource update(Long id, VideoDataResource entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "VideoDataResource %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}