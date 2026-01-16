package com.example.erp.wms.controller;

import com.example.erp.wms.domain.OldProduct;
import com.example.erp.wms.service.OldProductService;
import com.example.erp.wms.service.OldProductService.ProductWithWorkOrders;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class OldProductController {

    private final OldProductService service;

    public OldProductController(OldProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<OldProduct> listProducts() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OldProduct getProduct(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/old/sku/{sku}")
    public OldProduct getBySku(@PathVariable String sku) {
        return service.getBySku(sku);
    }

    @GetMapping("/old/sku/{sku}/work-orders")
    public ProductWithWorkOrders getProductWithWorkOrders(@PathVariable String sku) {
        return service.getProductWithWorkOrders(sku);
    }

    @PostMapping
    public ResponseEntity<OldProduct> create(@Valid @RequestBody OldProduct oldProduct) {
        oldProduct.setId(null);
        OldProduct created = service.create(oldProduct);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OldProduct update(@PathVariable Long id, @Valid @RequestBody OldProduct oldProduct) {
        return service.update(id, oldProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgument(IllegalArgumentException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
