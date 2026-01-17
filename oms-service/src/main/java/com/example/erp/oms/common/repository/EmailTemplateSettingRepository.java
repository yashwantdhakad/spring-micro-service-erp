package com.example.erp.oms.common.repository;

import com.example.erp.oms.common.domain.EmailTemplateSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailTemplateSettingRepository extends JpaRepository<EmailTemplateSetting, Long> {
}
