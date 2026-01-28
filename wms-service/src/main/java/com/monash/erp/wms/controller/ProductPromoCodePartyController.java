package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ProductPromoCodeParty;
import com.monash.erp.wms.service.ProductPromoCodePartyService;
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
@RequestMapping("/api/product-promo-code-parties")
public class ProductPromoCodePartyController {

    private final ProductPromoCodePartyService service;

    public ProductPromoCodePartyController(ProductPromoCodePartyService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductPromoCodeParty> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductPromoCodeParty get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ProductPromoCodeParty> create(@RequestBody ProductPromoCodeParty entity) {
        ProductPromoCodeParty created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductPromoCodeParty update(@PathVariable Long id, @RequestBody ProductPromoCodeParty entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}