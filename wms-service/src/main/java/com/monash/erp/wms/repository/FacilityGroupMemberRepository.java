package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.FacilityGroupMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityGroupMemberRepository extends JpaRepository<FacilityGroupMember, Long> {
}