package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.ProductAverageCost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductAverageCostRepository extends JpaRepository<ProductAverageCost, Long> {
}
