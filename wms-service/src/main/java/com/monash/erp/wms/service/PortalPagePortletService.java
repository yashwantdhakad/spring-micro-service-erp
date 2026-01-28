package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.PortalPagePortlet;
import com.monash.erp.wms.repository.PortalPagePortletRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PortalPagePortletService {

    private final PortalPagePortletRepository repository;

    public PortalPagePortletService(PortalPagePortletRepository repository) {
        this.repository = repository;
    }

    public List<PortalPagePortlet> list() {
        return repository.findAll();
    }

    public PortalPagePortlet get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PortalPagePortlet %d not found".formatted(id)));
    }

    public PortalPagePortlet create(PortalPagePortlet entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PortalPagePortlet update(Long id, PortalPagePortlet entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PortalPagePortlet %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}