package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ContentKeyword;
import com.monash.erp.wms.service.ContentKeywordService;
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
@RequestMapping("/api/content-keywords")
public class ContentKeywordController {

    private final ContentKeywordService service;

    public ContentKeywordController(ContentKeywordService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContentKeyword> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContentKeyword get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContentKeyword> create(@RequestBody ContentKeyword entity) {
        ContentKeyword created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContentKeyword update(@PathVariable Long id, @RequestBody ContentKeyword entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}