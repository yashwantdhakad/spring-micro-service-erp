package com.monash.erp.oms.common.service;

import com.monash.erp.oms.common.entity.PortalPortlet;
import com.monash.erp.oms.common.repository.PortalPortletRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PortalPortletService {

    private final PortalPortletRepository repository;

    public PortalPortletService(PortalPortletRepository repository) {
        this.repository = repository;
    }

    public List<PortalPortlet> list() {
        return repository.findAll();
    }

    public PortalPortlet get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PortalPortlet %d not found".formatted(id)));
    }

    public PortalPortlet create(PortalPortlet entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PortalPortlet update(Long id, PortalPortlet entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PortalPortlet %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
