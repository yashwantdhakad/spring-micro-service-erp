package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.AudioDataResource;
import com.monash.erp.wms.service.AudioDataResourceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/audio-data-resources")
public class AudioDataResourceController {

    private final AudioDataResourceService service;

    public AudioDataResourceController(AudioDataResourceService service) {
        this.service = service;
    }

    @GetMapping
    public List<AudioDataResource> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AudioDataResource get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AudioDataResource> create(@RequestBody AudioDataResource entity) {
        AudioDataResource created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AudioDataResource update(@PathVariable Long id, @RequestBody AudioDataResource entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}