package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.ContentMetaData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContentMetaDataRepository extends JpaRepository<ContentMetaData, Long> {
    List<ContentMetaData> findByContentId(String contentId);
}
