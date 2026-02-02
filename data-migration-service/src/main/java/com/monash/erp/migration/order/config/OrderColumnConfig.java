package com.monash.erp.migration.order.config;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class OrderColumnConfig {

    private static final Logger logger = LoggerFactory.getLogger(OrderColumnConfig.class);

    @Bean
    public List<String> orderAdjustmentColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_adjustment");
    }

    @Bean
    public List<String> orderAdjustmentAttributeColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_adjustment_attribute");
    }

    @Bean
    public List<String> orderAdjustmentBillingColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_adjustment_billing");
    }

    @Bean
    public List<String> orderAttributeColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_attribute");
    }

    @Bean
    public List<String> orderContactMechColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_contact_mech");
    }

    @Bean
    public List<String> orderContentColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_content");
    }

    @Bean
    public List<String> orderDeliveryScheduleColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_delivery_schedule");
    }

    @Bean
    public List<String> orderHeaderColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_header");
    }

    @Bean
    public List<String> orderHeaderWorkEffortColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_header_work_effort");
    }

    @Bean
    public List<String> orderInventoryItemApplColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_inventory_item_appl");
    }

    @Bean
    public List<String> orderItemColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item");
    }

    @Bean
    public List<String> orderItemAssocColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item_assoc");
    }

    @Bean
    public List<String> orderItemAssociationColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item_association");
    }

    @Bean
    public List<String> orderItemAttributeColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item_attribute");
    }

    @Bean
    public List<String> orderItemBillingColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item_billing");
    }

    @Bean
    public List<String> orderItemChangeColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item_change");
    }

    @Bean
    public List<String> orderItemContactMechColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item_contact_mech");
    }

    @Bean
    public List<String> orderItemGroupColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item_group");
    }

    @Bean
    public List<String> orderItemInventoryResColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item_inventory_res");
    }

    @Bean
    public List<String> orderItemNoteColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item_note");
    }

    @Bean
    public List<String> orderItemPriceInfoColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item_price_info");
    }

    @Bean
    public List<String> orderItemQAOverrideColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item_q_a_override");
    }

    @Bean
    public List<String> orderItemRoleColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item_role");
    }

    @Bean
    public List<String> orderItemShipGroupColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item_ship_group");
    }

    @Bean
    public List<String> orderItemShipGroupAssocColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item_ship_group_assoc");
    }

    @Bean
    public List<String> orderItemShipGrpInvResColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item_ship_grp_inv_res");
    }

    @Bean
    public List<String> orderItemWorkEffortColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_item_work_effort");
    }

    @Bean
    public List<String> orderLabelColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_label");
    }

    @Bean
    public List<String> orderNotificationColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_notification");
    }

    @Bean
    public List<String> orderPaymentPreferenceColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_payment_preference");
    }

    @Bean
    public List<String> orderProductPromoCodeColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_product_promo_code");
    }

    @Bean
    public List<String> orderRequirementCommitmentColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_requirement_commitment");
    }

    @Bean
    public List<String> orderRoleColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_role");
    }

    @Bean
    public List<String> orderShipmentColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_shipment");
    }

    @Bean
    public List<String> orderShipmentPreferenceColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_shipment_preference");
    }

    @Bean
    public List<String> orderStatusColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_status");
    }

    @Bean
    public List<String> orderSummaryEntryColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_summary_entry");
    }

    @Bean
    public List<String> orderTermColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_term");
    }

    @Bean
    public List<String> orderTermAttributeColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_term_attribute");
    }

    @Bean
    public List<String> orderWorkEffortApplColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "order_work_effort_appl");
    }

    private List<String> resolveColumns(DataSource sourceDataSource, DataSource targetDataSource, String tableName) {
        JdbcTemplate sourceJdbc = new JdbcTemplate(sourceDataSource);
        JdbcTemplate targetJdbc = new JdbcTemplate(targetDataSource);

        List<String> targetColumns = fetchColumns(targetJdbc, tableName);
        Set<String> sourceColumns = new LinkedHashSet<>(fetchColumns(sourceJdbc, tableName));

        List<String> missingInTarget = sourceColumns.stream()
                .filter(col -> !targetColumns.contains(col))
                .sorted()
                .collect(Collectors.toList());
        List<String> missingInSource = targetColumns.stream()
                .filter(col -> !sourceColumns.contains(col))
                .sorted()
                .collect(Collectors.toList());

        if (!missingInTarget.isEmpty()) {
            throw new IllegalStateException("Target " + tableName + " table is missing columns: " + missingInTarget);
        }
        if (!missingInSource.isEmpty()) {
            logger.warn("Skipping columns missing in source {} table: {}", tableName, missingInSource);
        }

        if (sourceColumns.isEmpty()) {
            throw new IllegalStateException("No columns found in source " + tableName + " table");
        }

        return sourceColumns.stream().collect(Collectors.toList());
    }

    private List<String> fetchColumns(JdbcTemplate jdbcTemplate, String tableName) {
        String sql = "SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS "
                + "WHERE TABLE_SCHEMA = DATABASE() AND TABLE_NAME = ? "
                + "ORDER BY ORDINAL_POSITION";
        return jdbcTemplate.queryForList(sql, String.class, tableName)
                .stream()
                .map(value -> value.toUpperCase(Locale.ROOT))
                .collect(Collectors.toList());
    }
}