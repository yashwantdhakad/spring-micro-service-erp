package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ProductCategoryMember;
import com.example.erp.wms.ofbiz.repository.ProductCategoryMemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductCategoryMemberService {

    private final ProductCategoryMemberRepository repository;

    public ProductCategoryMemberService(ProductCategoryMemberRepository repository) {
        this.repository = repository;
    }

    public List<ProductCategoryMember> list() {
        return repository.findAll();
    }

    public ProductCategoryMember get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryMember %d not found".formatted(id)));
    }

    public ProductCategoryMember create(ProductCategoryMember entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductCategoryMember update(Long id, ProductCategoryMember entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryMember %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}