package com.monash.erp.mfg.mapper;

import com.monash.erp.mfg.dto.JobDto;
import com.monash.erp.mfg.entity.WorkEffort;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class JobMapper {

    public JobDto toDTO(WorkEffort entity) {
        if (entity == null) {
            return null;
        }
        JobDto dto = new JobDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public WorkEffort toEntity(JobDto dto) {
        if (dto == null) {
            return null;
        }
        WorkEffort entity = new WorkEffort();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}
