package com.example.erp.oms.accounting.repository;

import com.example.erp.oms.accounting.domain.FixedAssetMaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedAssetMaintRepository extends JpaRepository<FixedAssetMaint, Long> {
}
