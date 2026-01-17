package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.DataResourceMetaData;
import com.example.erp.wms.ofbiz.service.DataResourceMetaDataService;
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
@RequestMapping("/ofbiz/data-resource-meta-datas")
public class DataResourceMetaDataController {

    private final DataResourceMetaDataService service;

    public DataResourceMetaDataController(DataResourceMetaDataService service) {
        this.service = service;
    }

    @GetMapping
    public List<DataResourceMetaData> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public DataResourceMetaData get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<DataResourceMetaData> create(@RequestBody DataResourceMetaData entity) {
        DataResourceMetaData created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public DataResourceMetaData update(@PathVariable Long id, @RequestBody DataResourceMetaData entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}