package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.OrderItemAssociation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemAssociationRepository extends JpaRepository<OrderItemAssociation, Long> {
}