package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.PicklistRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PicklistRoleRepository extends JpaRepository<PicklistRole, Long> {
    List<PicklistRole> findByPicklistIdIn(List<String> picklistIds);

    List<PicklistRole> findByPicklistIdAndRoleTypeIdAndThruDateIsNull(String picklistId, String roleTypeId);
}
