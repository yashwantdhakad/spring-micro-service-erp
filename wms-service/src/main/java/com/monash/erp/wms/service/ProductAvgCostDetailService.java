package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductAvgCostDetail;
import com.monash.erp.wms.repository.ProductAvgCostDetailRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductAvgCostDetailService {

    private final ProductAvgCostDetailRepository repository;

    public ProductAvgCostDetailService(ProductAvgCostDetailRepository repository) {
        this.repository = repository;
    }

    public List<ProductAvgCostDetail> list() {
        return repository.findAll();
    }

    public ProductAvgCostDetail get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductAvgCostDetail %d not found".formatted(id)));
    }

    public ProductAvgCostDetail create(ProductAvgCostDetail entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductAvgCostDetail update(Long id, ProductAvgCostDetail entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductAvgCostDetail %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}