package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.WebslingerServerBase;
import com.monash.erp.wms.service.WebslingerServerBaseService;
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
@RequestMapping("/api/webslinger-server-bases")
public class WebslingerServerBaseController {

    private final WebslingerServerBaseService service;

    public WebslingerServerBaseController(WebslingerServerBaseService service) {
        this.service = service;
    }

    @GetMapping
    public List<WebslingerServerBase> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WebslingerServerBase get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WebslingerServerBase> create(@RequestBody WebslingerServerBase entity) {
        WebslingerServerBase created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WebslingerServerBase update(@PathVariable Long id, @RequestBody WebslingerServerBase entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}