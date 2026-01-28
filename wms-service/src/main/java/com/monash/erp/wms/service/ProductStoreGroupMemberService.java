package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStoreGroupMember;
import com.monash.erp.wms.repository.ProductStoreGroupMemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStoreGroupMemberService {

    private final ProductStoreGroupMemberRepository repository;

    public ProductStoreGroupMemberService(ProductStoreGroupMemberRepository repository) {
        this.repository = repository;
    }

    public List<ProductStoreGroupMember> list() {
        return repository.findAll();
    }

    public ProductStoreGroupMember get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreGroupMember %d not found".formatted(id)));
    }

    public ProductStoreGroupMember create(ProductStoreGroupMember entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStoreGroupMember update(Long id, ProductStoreGroupMember entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreGroupMember %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}