package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.ContentRevisionItem;
import com.example.erp.wms.ofbiz.service.ContentRevisionItemService;
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
@RequestMapping("/ofbiz/content-revision-items")
public class ContentRevisionItemController {

    private final ContentRevisionItemService service;

    public ContentRevisionItemController(ContentRevisionItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContentRevisionItem> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContentRevisionItem get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContentRevisionItem> create(@RequestBody ContentRevisionItem entity) {
        ContentRevisionItem created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContentRevisionItem update(@PathVariable Long id, @RequestBody ContentRevisionItem entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}