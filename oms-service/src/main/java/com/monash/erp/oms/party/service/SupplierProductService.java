package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.dto.SupplierProductDto;
import com.monash.erp.oms.party.entity.SupplierProduct;
import com.monash.erp.oms.party.repository.SupplierProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SupplierProductService {

    private final SupplierProductRepository repository;

    public SupplierProductService(SupplierProductRepository repository) {
        this.repository = repository;
    }

    public List<SupplierProductDto> list() {
        List<SupplierProduct> products = repository.findAll();
        // Product summary enrichment removed due to gRPC removal
        return products.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public SupplierProductDto get(Long id) {
        SupplierProduct entity = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "SupplierProduct %d not found".formatted(id)));

        return toDto(entity);
    }

    public SupplierProductDto create(SupplierProductDto dto) {
        SupplierProduct entity = new SupplierProduct();
        BeanUtils.copyProperties(dto, entity);
        entity.setId(null);
        entity = repository.save(entity);
        return toDto(entity);
    }

    public SupplierProductDto update(Long id, SupplierProductDto dto) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SupplierProduct %d not found".formatted(id));
        }
        SupplierProduct entity = new SupplierProduct();
        BeanUtils.copyProperties(dto, entity);
        entity.setId(id);
        entity = repository.save(entity);
        return toDto(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    private SupplierProductDto toDto(SupplierProduct entity) {
        SupplierProductDto dto = new SupplierProductDto();
        BeanUtils.copyProperties(entity, dto);
        // Internal product name enrichment removed
        return dto;
    }
}