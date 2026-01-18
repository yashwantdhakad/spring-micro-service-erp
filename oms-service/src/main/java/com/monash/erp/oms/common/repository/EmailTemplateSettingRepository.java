package com.monash.erp.oms.common.repository;

import com.monash.erp.oms.common.entity.EmailTemplateSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailTemplateSettingRepository extends JpaRepository<EmailTemplateSetting, Long> {
}
