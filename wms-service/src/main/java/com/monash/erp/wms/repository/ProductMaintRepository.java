package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductMaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductMaintRepository extends JpaRepository<ProductMaint, Long> {
}