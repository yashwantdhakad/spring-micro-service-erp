package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.PortletAttribute;
import com.monash.erp.wms.repository.PortletAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PortletAttributeService {

    private final PortletAttributeRepository repository;

    public PortletAttributeService(PortletAttributeRepository repository) {
        this.repository = repository;
    }

    public List<PortletAttribute> list() {
        return repository.findAll();
    }

    public PortletAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PortletAttribute %d not found".formatted(id)));
    }

    public PortletAttribute create(PortletAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PortletAttribute update(Long id, PortletAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PortletAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}