package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.FixedAssetMaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetMaintRepository extends JpaRepository<FixedAssetMaint, Long> {
}