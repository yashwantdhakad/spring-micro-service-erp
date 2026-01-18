package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ContentApproval;
import com.monash.erp.wms.service.ContentApprovalService;
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
@RequestMapping("/ofbiz/content-approvals")
public class ContentApprovalController {

    private final ContentApprovalService service;

    public ContentApprovalController(ContentApprovalService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContentApproval> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContentApproval get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ContentApproval> create(@RequestBody ContentApproval entity) {
        ContentApproval created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ContentApproval update(@PathVariable Long id, @RequestBody ContentApproval entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}