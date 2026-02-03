package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ProductAssoc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductAssocRepository extends JpaRepository<ProductAssoc, Long> {
    List<ProductAssoc> findByProductId(String productId);

    List<ProductAssoc> findByProductIdTo(String productIdTo);

    @Query("""
            select distinct pa.productId
            from ProductAssoc pa
            where (
                upper(pa.productAssocTypeId) like '%BOM%'
                or upper(pa.productAssocTypeId) like '%COMPONENT%'
            )
            and (:bomTypeId is null or pa.productAssocTypeId = :bomTypeId)
            and (:query is null or lower(pa.productId) like lower(concat('%', :query, '%')))
            """)
    Page<String> findBomProductIds(
            @Param("bomTypeId") String bomTypeId,
            @Param("query") String query,
            Pageable pageable
    );

    @Query("""
            select pa
            from ProductAssoc pa
            where pa.productId in :productIds
            and (
                upper(pa.productAssocTypeId) like '%BOM%'
                or upper(pa.productAssocTypeId) like '%COMPONENT%'
            )
            """)
    List<ProductAssoc> findBomAssocsByProductIdIn(@Param("productIds") List<String> productIds);
}
