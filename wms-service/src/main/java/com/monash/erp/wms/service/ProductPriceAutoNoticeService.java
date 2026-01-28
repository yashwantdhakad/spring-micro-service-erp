package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPriceAutoNotice;
import com.monash.erp.wms.repository.ProductPriceAutoNoticeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPriceAutoNoticeService {

    private final ProductPriceAutoNoticeRepository repository;

    public ProductPriceAutoNoticeService(ProductPriceAutoNoticeRepository repository) {
        this.repository = repository;
    }

    public List<ProductPriceAutoNotice> list() {
        return repository.findAll();
    }

    public ProductPriceAutoNotice get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPriceAutoNotice %d not found".formatted(id)));
    }

    public ProductPriceAutoNotice create(ProductPriceAutoNotice entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPriceAutoNotice update(Long id, ProductPriceAutoNotice entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPriceAutoNotice %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}