package com.monash.erp.oms.party.mapper;

import com.monash.erp.oms.party.dto.PartyDto;
import com.monash.erp.oms.party.entity.Party;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class PartyMapper {

    public PartyDto toDTO(Party entity) {
        if (entity == null) {
            return null;
        }
        PartyDto dto = new PartyDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public Party toEntity(PartyDto dto) {
        if (dto == null) {
            return null;
        }
        Party entity = new Party();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}
