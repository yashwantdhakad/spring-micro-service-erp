package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.MimeTypeHtmlTemplate;
import com.monash.erp.wms.service.MimeTypeHtmlTemplateService;
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
@RequestMapping("/ofbiz/mime-type-html-templates")
public class MimeTypeHtmlTemplateController {

    private final MimeTypeHtmlTemplateService service;

    public MimeTypeHtmlTemplateController(MimeTypeHtmlTemplateService service) {
        this.service = service;
    }

    @GetMapping
    public List<MimeTypeHtmlTemplate> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public MimeTypeHtmlTemplate get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<MimeTypeHtmlTemplate> create(@RequestBody MimeTypeHtmlTemplate entity) {
        MimeTypeHtmlTemplate created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public MimeTypeHtmlTemplate update(@PathVariable Long id, @RequestBody MimeTypeHtmlTemplate entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}