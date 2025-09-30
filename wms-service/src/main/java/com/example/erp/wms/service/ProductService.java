package com.example.erp.wms.service;

import com.example.erp.wms.client.WorkOrderClient;
import com.example.erp.wms.client.WorkOrderSummary;
import com.example.erp.wms.domain.Product;
import com.example.erp.wms.domain.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {

    private final ProductRepository repository;
    private final WorkOrderClient workOrderClient;

    public ProductService(ProductRepository repository, WorkOrderClient workOrderClient) {
        this.repository = repository;
        this.workOrderClient = workOrderClient;
    }

    public Product create(Product product) {
        if (repository.existsBySku(product.getSku())) {
            throw new IllegalArgumentException("Product with SKU %s already exists".formatted(product.getSku()));
        }
        return repository.save(product);
    }

    public Product update(Long id, Product update) {
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
    public List<Product> list() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Product get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Product %d not found".formatted(id)));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Product getBySku(String sku) {
        return repository.findBySku(sku)
                .orElseThrow(() -> new IllegalArgumentException("Product with SKU %s not found".formatted(sku)));
    }

    @Transactional(readOnly = true)
    public ProductWithWorkOrders getProductWithWorkOrders(String sku) {
        Product product = getBySku(sku);
        List<WorkOrderSummary> workOrders = workOrderClient.findByProduct(sku);
        return new ProductWithWorkOrders(product, workOrders);
    }

    public record ProductWithWorkOrders(Product product, List<WorkOrderSummary> workOrders) {
    }
}
