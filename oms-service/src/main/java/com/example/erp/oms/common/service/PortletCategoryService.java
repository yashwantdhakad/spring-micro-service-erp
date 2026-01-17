package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.PortletCategory;
import com.example.erp.oms.common.repository.PortletCategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PortletCategoryService {

    private final PortletCategoryRepository repository;

    public PortletCategoryService(PortletCategoryRepository repository) {
        this.repository = repository;
    }

    public List<PortletCategory> list() {
        return repository.findAll();
    }

    public PortletCategory get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PortletCategory %d not found".formatted(id)));
    }

    public PortletCategory create(PortletCategory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PortletCategory update(Long id, PortletCategory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PortletCategory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
