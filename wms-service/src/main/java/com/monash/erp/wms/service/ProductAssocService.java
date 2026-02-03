package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductAssoc;
import com.monash.erp.wms.repository.ProductAssocRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;

@Service
public class ProductAssocService {

    private final ProductAssocRepository repository;

    public ProductAssocService(ProductAssocRepository repository) {
        this.repository = repository;
    }

    public List<ProductAssoc> list() {
        return repository.findAll();
    }

    public ProductAssoc get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductAssoc %d not found".formatted(id)));
    }

    public ProductAssoc create(ProductAssoc entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductAssoc update(Long id, ProductAssoc entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductAssoc %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public ProductAssoc expire(Long id) {
        ProductAssoc assoc = get(id);
        assoc.setThruDate(LocalDateTime.now());
        return repository.save(assoc);
    }

    public ProductAssoc updateFields(Long id, String quantity, String fromDate, String sequenceNum) {
        ProductAssoc assoc = get(id);
        if (quantity != null) {
            assoc.setQuantity(quantity);
        }
        if (sequenceNum != null) {
            assoc.setSequenceNum(sequenceNum);
        }
        if (fromDate != null) {
            assoc.setFromDate(parseDate(fromDate));
        }
        return repository.save(assoc);
    }

    private LocalDateTime parseDate(String value) {
        try {
            return OffsetDateTime.parse(value).toLocalDateTime();
        } catch (Exception ignored) {
            return LocalDateTime.parse(value);
        }
    }
}
