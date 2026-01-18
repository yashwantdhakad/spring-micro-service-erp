package com.monash.erp.wms.service;

import com.monash.erp.wms.client.WorkOrderClient;
import com.monash.erp.wms.client.WorkOrderSummary;
import com.monash.erp.wms.entity.OldProduct;
import com.monash.erp.wms.entity.OldProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OldProductService {

    private final OldProductRepository repository;
    private final WorkOrderClient workOrderClient;

    public OldProductService(OldProductRepository repository, WorkOrderClient workOrderClient) {
        this.repository = repository;
        this.workOrderClient = workOrderClient;
    }

    public OldProduct create(OldProduct oldProduct) {
        if (repository.existsBySku(oldProduct.getSku())) {
            throw new IllegalArgumentException("Product with SKU %s already exists".formatted(oldProduct.getSku()));
        }
        return repository.save(oldProduct);
    }

    public OldProduct update(Long id, OldProduct update) {
        return repository.findById(id)
                .map(existing -> {
                    if (!existing.getSku().equals(update.getSku()) && repository.existsBySku(update.getSku())) {
                        throw new IllegalArgumentException("Product with SKU %s already exists".formatted(update.getSku()));
                    }
                    existing.setName(update.getName());
                    existing.setDescription(update.getDescription());
                    existing.setSku(update.getSku());
                    return repository.save(existing);
                })
                .orElseThrow(() -> new IllegalArgumentException("Product %d not found".formatted(id)));
    }

    @Transactional(readOnly = true)
    public List<OldProduct> list() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public OldProduct get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Product %d not found".formatted(id)));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public OldProduct getBySku(String sku) {
        return repository.findBySku(sku)
                .orElseThrow(() -> new IllegalArgumentException("Product with SKU %s not found".formatted(sku)));
    }

    @Transactional(readOnly = true)
    public ProductWithWorkOrders getProductWithWorkOrders(String sku) {
        OldProduct oldProduct = getBySku(sku);
        List<WorkOrderSummary> workOrders = workOrderClient.findByProduct(sku);
        return new ProductWithWorkOrders(oldProduct, workOrders);
    }

    public record ProductWithWorkOrders(OldProduct oldProduct, List<WorkOrderSummary> workOrders) {
    }
}
