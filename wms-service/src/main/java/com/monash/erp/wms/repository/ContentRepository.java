package com.monash.erp.wms.repository;

import com.monash.erp.wms.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContentRepository extends JpaRepository<Content, Long> {
    Optional<Content> findByContentId(String contentId);
}
