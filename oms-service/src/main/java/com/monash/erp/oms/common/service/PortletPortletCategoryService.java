package com.monash.erp.oms.common.service;

import com.monash.erp.oms.common.entity.PortletPortletCategory;
import com.monash.erp.oms.common.repository.PortletPortletCategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PortletPortletCategoryService {

    private final PortletPortletCategoryRepository repository;

    public PortletPortletCategoryService(PortletPortletCategoryRepository repository) {
        this.repository = repository;
    }

    public List<PortletPortletCategory> list() {
        return repository.findAll();
    }

    public PortletPortletCategory get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PortletPortletCategory %d not found".formatted(id)));
    }

    public PortletPortletCategory create(PortletPortletCategory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PortletPortletCategory update(Long id, PortletPortletCategory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PortletPortletCategory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
