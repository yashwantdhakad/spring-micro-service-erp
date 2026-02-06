package com.monash.erp.oms.order.mapper;

import com.monash.erp.oms.entity.OrderHeader;
import com.monash.erp.oms.order.dto.OrderHeaderDto;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;

@Component
public class OrderHeaderMapper {

    public OrderHeaderDto toDTO(OrderHeader entity) {
        if (entity == null) {
            return null;
        }
        OrderHeaderDto dto = new OrderHeaderDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public OrderHeader toEntity(OrderHeaderDto dto) {
        if (dto == null) {
            return null;
        }
        OrderHeader entity = new OrderHeader();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}
