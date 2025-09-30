package com.example.erp.oms.service;

import com.example.erp.oms.client.ProductClient;
import com.example.erp.oms.client.ProductSummary;
import com.example.erp.oms.domain.CustomerOrder;
import com.example.erp.oms.domain.CustomerOrderRepository;
import feign.FeignException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderService {

    private final CustomerOrderRepository repository;
    private final ProductClient productClient;

    public OrderService(CustomerOrderRepository repository, ProductClient productClient) {
        this.repository = repository;
        this.productClient = productClient;
    }

    public CustomerOrder create(CustomerOrder order) {
        verifyProduct(order.getProductSku());
        return repository.save(order);
    }

    public CustomerOrder update(Long id, CustomerOrder updated) {
        return repository.findById(id)
                .map(existing -> {
                    verifyProduct(updated.getProductSku());
                    existing.setCustomerName(updated.getCustomerName());
                    existing.setProductSku(updated.getProductSku());
                    existing.setQuantity(updated.getQuantity());
                    existing.setStatus(updated.getStatus());
                    return repository.save(existing);
                })
                .orElseThrow(() -> new IllegalArgumentException("Order %d not found".formatted(id)));
    }

    @Transactional(readOnly = true)
    public List<CustomerOrder> list() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public CustomerOrder get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Order %d not found".formatted(id)));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public OrderView getDetailedOrder(Long id) {
        CustomerOrder order = get(id);
        ProductSummary product = verifyProduct(order.getProductSku());
        return new OrderView(order, product);
    }

    public record OrderView(CustomerOrder order, ProductSummary product) {
    }

    private ProductSummary verifyProduct(String sku) {
        try {
            return productClient.getProduct(sku);
        } catch (FeignException.NotFound e) {
            throw new IllegalArgumentException("Product %s not found in WMS".formatted(sku));
        }
    }
}
