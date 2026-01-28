package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductSearchResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSearchResultRepository extends JpaRepository<ProductSearchResult, Long> {
}