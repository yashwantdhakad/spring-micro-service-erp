package com.monash.erp.oms.order.repository;

import com.monash.erp.oms.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findByOrderId(String orderId);

    Optional<OrderItem> findByOrderIdAndOrderItemSeqId(String orderId, String orderItemSeqId);

    @Query("""
            select oi.orderId as orderId,
                   sum(oi.quantity) as quantityTotal,
                   sum(coalesce(oi.unitPrice, 0) * coalesce(oi.quantity, 0)) as grandTotal
            from OrderItem oi
            where oi.orderId in :orderIds
            group by oi.orderId
            """)
    List<OrderItemAggregate> findAggregatesByOrderIdIn(@Param("orderIds") List<String> orderIds);

    interface OrderItemAggregate {
        String getOrderId();

        BigDecimal getQuantityTotal();

        BigDecimal getGrandTotal();
    }
}
