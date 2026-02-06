package com.monash.erp.wms.mapper;

import com.monash.erp.wms.dto.FacilityDto;
import com.monash.erp.wms.entity.Facility;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class FacilityMapper {

    public FacilityDto toDTO(Facility entity) {
        if (entity == null) {
            return null;
        }
        FacilityDto dto = new FacilityDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public Facility toEntity(FacilityDto dto) {
        if (dto == null) {
            return null;
        }
        Facility entity = new Facility();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}
