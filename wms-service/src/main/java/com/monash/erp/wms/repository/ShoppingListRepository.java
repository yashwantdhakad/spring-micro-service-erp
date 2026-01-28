package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ShoppingList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingListRepository extends JpaRepository<ShoppingList, Long> {
}