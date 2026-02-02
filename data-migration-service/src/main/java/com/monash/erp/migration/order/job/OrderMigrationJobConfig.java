package com.monash.erp.migration.order.job;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.transaction.PlatformTransactionManager;

import com.monash.erp.migration.order.config.OrderMigrationProperties;

@Configuration
@EnableBatchProcessing
@EnableConfigurationProperties(OrderMigrationProperties.class)
public class OrderMigrationJobConfig {

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderAdjustmentReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderAdjustmentColumns") List<String> orderAdjustmentColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_adjustment", orderAdjustmentColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderAdjustmentWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderAdjustmentColumns") List<String> orderAdjustmentColumns
    ) {
        return createWriter(targetDataSource, "order_adjustment", orderAdjustmentColumns);
    }

    @Bean
    public Step orderAdjustmentMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderAdjustmentReader,
            JdbcBatchItemWriter<Map<String, Object>> orderAdjustmentWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderAdjustmentMigrationStep", orderAdjustmentReader, orderAdjustmentWriter, properties);
    }

    @Bean
    public Job orderAdjustmentMigrationJob(JobRepository jobRepository, @Qualifier("orderAdjustmentMigrationStep") Step orderAdjustmentMigrationStep) {
        return new JobBuilder("orderAdjustmentMigrationJob", jobRepository)
                .start(orderAdjustmentMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderAdjustmentAttributeReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderAdjustmentAttributeColumns") List<String> orderAdjustmentAttributeColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_adjustment_attribute", orderAdjustmentAttributeColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderAdjustmentAttributeWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderAdjustmentAttributeColumns") List<String> orderAdjustmentAttributeColumns
    ) {
        return createWriter(targetDataSource, "order_adjustment_attribute", orderAdjustmentAttributeColumns);
    }

    @Bean
    public Step orderAdjustmentAttributeMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderAdjustmentAttributeReader,
            JdbcBatchItemWriter<Map<String, Object>> orderAdjustmentAttributeWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderAdjustmentAttributeMigrationStep", orderAdjustmentAttributeReader, orderAdjustmentAttributeWriter, properties);
    }

    @Bean
    public Job orderAdjustmentAttributeMigrationJob(JobRepository jobRepository, @Qualifier("orderAdjustmentAttributeMigrationStep") Step orderAdjustmentAttributeMigrationStep) {
        return new JobBuilder("orderAdjustmentAttributeMigrationJob", jobRepository)
                .start(orderAdjustmentAttributeMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderAdjustmentBillingReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderAdjustmentBillingColumns") List<String> orderAdjustmentBillingColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_adjustment_billing", orderAdjustmentBillingColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderAdjustmentBillingWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderAdjustmentBillingColumns") List<String> orderAdjustmentBillingColumns
    ) {
        return createWriter(targetDataSource, "order_adjustment_billing", orderAdjustmentBillingColumns);
    }

    @Bean
    public Step orderAdjustmentBillingMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderAdjustmentBillingReader,
            JdbcBatchItemWriter<Map<String, Object>> orderAdjustmentBillingWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderAdjustmentBillingMigrationStep", orderAdjustmentBillingReader, orderAdjustmentBillingWriter, properties);
    }

    @Bean
    public Job orderAdjustmentBillingMigrationJob(JobRepository jobRepository, @Qualifier("orderAdjustmentBillingMigrationStep") Step orderAdjustmentBillingMigrationStep) {
        return new JobBuilder("orderAdjustmentBillingMigrationJob", jobRepository)
                .start(orderAdjustmentBillingMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderAttributeReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderAttributeColumns") List<String> orderAttributeColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_attribute", orderAttributeColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderAttributeWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderAttributeColumns") List<String> orderAttributeColumns
    ) {
        return createWriter(targetDataSource, "order_attribute", orderAttributeColumns);
    }

    @Bean
    public Step orderAttributeMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderAttributeReader,
            JdbcBatchItemWriter<Map<String, Object>> orderAttributeWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderAttributeMigrationStep", orderAttributeReader, orderAttributeWriter, properties);
    }

    @Bean
    public Job orderAttributeMigrationJob(JobRepository jobRepository, @Qualifier("orderAttributeMigrationStep") Step orderAttributeMigrationStep) {
        return new JobBuilder("orderAttributeMigrationJob", jobRepository)
                .start(orderAttributeMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderContactMechReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderContactMechColumns") List<String> orderContactMechColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_contact_mech", orderContactMechColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderContactMechWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderContactMechColumns") List<String> orderContactMechColumns
    ) {
        return createWriter(targetDataSource, "order_contact_mech", orderContactMechColumns);
    }

    @Bean
    public Step orderContactMechMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderContactMechReader,
            JdbcBatchItemWriter<Map<String, Object>> orderContactMechWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderContactMechMigrationStep", orderContactMechReader, orderContactMechWriter, properties);
    }

    @Bean
    public Job orderContactMechMigrationJob(JobRepository jobRepository, @Qualifier("orderContactMechMigrationStep") Step orderContactMechMigrationStep) {
        return new JobBuilder("orderContactMechMigrationJob", jobRepository)
                .start(orderContactMechMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderContentReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderContentColumns") List<String> orderContentColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_content", orderContentColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderContentWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderContentColumns") List<String> orderContentColumns
    ) {
        return createWriter(targetDataSource, "order_content", orderContentColumns);
    }

    @Bean
    public Step orderContentMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderContentReader,
            JdbcBatchItemWriter<Map<String, Object>> orderContentWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderContentMigrationStep", orderContentReader, orderContentWriter, properties);
    }

    @Bean
    public Job orderContentMigrationJob(JobRepository jobRepository, @Qualifier("orderContentMigrationStep") Step orderContentMigrationStep) {
        return new JobBuilder("orderContentMigrationJob", jobRepository)
                .start(orderContentMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderDeliveryScheduleReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderDeliveryScheduleColumns") List<String> orderDeliveryScheduleColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_delivery_schedule", orderDeliveryScheduleColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderDeliveryScheduleWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderDeliveryScheduleColumns") List<String> orderDeliveryScheduleColumns
    ) {
        return createWriter(targetDataSource, "order_delivery_schedule", orderDeliveryScheduleColumns);
    }

    @Bean
    public Step orderDeliveryScheduleMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderDeliveryScheduleReader,
            JdbcBatchItemWriter<Map<String, Object>> orderDeliveryScheduleWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderDeliveryScheduleMigrationStep", orderDeliveryScheduleReader, orderDeliveryScheduleWriter, properties);
    }

    @Bean
    public Job orderDeliveryScheduleMigrationJob(JobRepository jobRepository, @Qualifier("orderDeliveryScheduleMigrationStep") Step orderDeliveryScheduleMigrationStep) {
        return new JobBuilder("orderDeliveryScheduleMigrationJob", jobRepository)
                .start(orderDeliveryScheduleMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderHeaderReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderHeaderColumns") List<String> orderHeaderColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_header", orderHeaderColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderHeaderWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderHeaderColumns") List<String> orderHeaderColumns
    ) {
        return createWriter(targetDataSource, "order_header", orderHeaderColumns);
    }

    @Bean
    public Step orderHeaderMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderHeaderReader,
            JdbcBatchItemWriter<Map<String, Object>> orderHeaderWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderHeaderMigrationStep", orderHeaderReader, orderHeaderWriter, properties);
    }

    @Bean
    public Job orderHeaderMigrationJob(JobRepository jobRepository, @Qualifier("orderHeaderMigrationStep") Step orderHeaderMigrationStep) {
        return new JobBuilder("orderHeaderMigrationJob", jobRepository)
                .start(orderHeaderMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderHeaderWorkEffortReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderHeaderWorkEffortColumns") List<String> orderHeaderWorkEffortColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_header_work_effort", orderHeaderWorkEffortColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderHeaderWorkEffortWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderHeaderWorkEffortColumns") List<String> orderHeaderWorkEffortColumns
    ) {
        return createWriter(targetDataSource, "order_header_work_effort", orderHeaderWorkEffortColumns);
    }

    @Bean
    public Step orderHeaderWorkEffortMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderHeaderWorkEffortReader,
            JdbcBatchItemWriter<Map<String, Object>> orderHeaderWorkEffortWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderHeaderWorkEffortMigrationStep", orderHeaderWorkEffortReader, orderHeaderWorkEffortWriter, properties);
    }

    @Bean
    public Job orderHeaderWorkEffortMigrationJob(JobRepository jobRepository, @Qualifier("orderHeaderWorkEffortMigrationStep") Step orderHeaderWorkEffortMigrationStep) {
        return new JobBuilder("orderHeaderWorkEffortMigrationJob", jobRepository)
                .start(orderHeaderWorkEffortMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderInventoryItemApplReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderInventoryItemApplColumns") List<String> orderInventoryItemApplColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_inventory_item_appl", orderInventoryItemApplColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderInventoryItemApplWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderInventoryItemApplColumns") List<String> orderInventoryItemApplColumns
    ) {
        return createWriter(targetDataSource, "order_inventory_item_appl", orderInventoryItemApplColumns);
    }

    @Bean
    public Step orderInventoryItemApplMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderInventoryItemApplReader,
            JdbcBatchItemWriter<Map<String, Object>> orderInventoryItemApplWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderInventoryItemApplMigrationStep", orderInventoryItemApplReader, orderInventoryItemApplWriter, properties);
    }

    @Bean
    public Job orderInventoryItemApplMigrationJob(JobRepository jobRepository, @Qualifier("orderInventoryItemApplMigrationStep") Step orderInventoryItemApplMigrationStep) {
        return new JobBuilder("orderInventoryItemApplMigrationJob", jobRepository)
                .start(orderInventoryItemApplMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemColumns") List<String> orderItemColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item", orderItemColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemColumns") List<String> orderItemColumns
    ) {
        return createWriter(targetDataSource, "order_item", orderItemColumns);
    }

    @Bean
    public Step orderItemMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemMigrationStep", orderItemReader, orderItemWriter, properties);
    }

    @Bean
    public Job orderItemMigrationJob(JobRepository jobRepository, @Qualifier("orderItemMigrationStep") Step orderItemMigrationStep) {
        return new JobBuilder("orderItemMigrationJob", jobRepository)
                .start(orderItemMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemAssocReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemAssocColumns") List<String> orderItemAssocColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item_assoc", orderItemAssocColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemAssocWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemAssocColumns") List<String> orderItemAssocColumns
    ) {
        return createWriter(targetDataSource, "order_item_assoc", orderItemAssocColumns);
    }

    @Bean
    public Step orderItemAssocMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemAssocReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemAssocWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemAssocMigrationStep", orderItemAssocReader, orderItemAssocWriter, properties);
    }

    @Bean
    public Job orderItemAssocMigrationJob(JobRepository jobRepository, @Qualifier("orderItemAssocMigrationStep") Step orderItemAssocMigrationStep) {
        return new JobBuilder("orderItemAssocMigrationJob", jobRepository)
                .start(orderItemAssocMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemAssociationReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemAssociationColumns") List<String> orderItemAssociationColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item_association", orderItemAssociationColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemAssociationWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemAssociationColumns") List<String> orderItemAssociationColumns
    ) {
        return createWriter(targetDataSource, "order_item_association", orderItemAssociationColumns);
    }

    @Bean
    public Step orderItemAssociationMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemAssociationReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemAssociationWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemAssociationMigrationStep", orderItemAssociationReader, orderItemAssociationWriter, properties);
    }

    @Bean
    public Job orderItemAssociationMigrationJob(JobRepository jobRepository, @Qualifier("orderItemAssociationMigrationStep") Step orderItemAssociationMigrationStep) {
        return new JobBuilder("orderItemAssociationMigrationJob", jobRepository)
                .start(orderItemAssociationMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemAttributeReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemAttributeColumns") List<String> orderItemAttributeColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item_attribute", orderItemAttributeColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemAttributeWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemAttributeColumns") List<String> orderItemAttributeColumns
    ) {
        return createWriter(targetDataSource, "order_item_attribute", orderItemAttributeColumns);
    }

    @Bean
    public Step orderItemAttributeMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemAttributeReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemAttributeWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemAttributeMigrationStep", orderItemAttributeReader, orderItemAttributeWriter, properties);
    }

    @Bean
    public Job orderItemAttributeMigrationJob(JobRepository jobRepository, @Qualifier("orderItemAttributeMigrationStep") Step orderItemAttributeMigrationStep) {
        return new JobBuilder("orderItemAttributeMigrationJob", jobRepository)
                .start(orderItemAttributeMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemBillingReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemBillingColumns") List<String> orderItemBillingColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item_billing", orderItemBillingColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemBillingWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemBillingColumns") List<String> orderItemBillingColumns
    ) {
        return createWriter(targetDataSource, "order_item_billing", orderItemBillingColumns);
    }

    @Bean
    public Step orderItemBillingMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemBillingReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemBillingWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemBillingMigrationStep", orderItemBillingReader, orderItemBillingWriter, properties);
    }

    @Bean
    public Job orderItemBillingMigrationJob(JobRepository jobRepository, @Qualifier("orderItemBillingMigrationStep") Step orderItemBillingMigrationStep) {
        return new JobBuilder("orderItemBillingMigrationJob", jobRepository)
                .start(orderItemBillingMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemChangeReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemChangeColumns") List<String> orderItemChangeColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item_change", orderItemChangeColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemChangeWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemChangeColumns") List<String> orderItemChangeColumns
    ) {
        return createWriter(targetDataSource, "order_item_change", orderItemChangeColumns);
    }

    @Bean
    public Step orderItemChangeMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemChangeReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemChangeWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemChangeMigrationStep", orderItemChangeReader, orderItemChangeWriter, properties);
    }

    @Bean
    public Job orderItemChangeMigrationJob(JobRepository jobRepository, @Qualifier("orderItemChangeMigrationStep") Step orderItemChangeMigrationStep) {
        return new JobBuilder("orderItemChangeMigrationJob", jobRepository)
                .start(orderItemChangeMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemContactMechReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemContactMechColumns") List<String> orderItemContactMechColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item_contact_mech", orderItemContactMechColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemContactMechWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemContactMechColumns") List<String> orderItemContactMechColumns
    ) {
        return createWriter(targetDataSource, "order_item_contact_mech", orderItemContactMechColumns);
    }

    @Bean
    public Step orderItemContactMechMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemContactMechReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemContactMechWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemContactMechMigrationStep", orderItemContactMechReader, orderItemContactMechWriter, properties);
    }

    @Bean
    public Job orderItemContactMechMigrationJob(JobRepository jobRepository, @Qualifier("orderItemContactMechMigrationStep") Step orderItemContactMechMigrationStep) {
        return new JobBuilder("orderItemContactMechMigrationJob", jobRepository)
                .start(orderItemContactMechMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemGroupReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemGroupColumns") List<String> orderItemGroupColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item_group", orderItemGroupColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemGroupWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemGroupColumns") List<String> orderItemGroupColumns
    ) {
        return createWriter(targetDataSource, "order_item_group", orderItemGroupColumns);
    }

    @Bean
    public Step orderItemGroupMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemGroupReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemGroupWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemGroupMigrationStep", orderItemGroupReader, orderItemGroupWriter, properties);
    }

    @Bean
    public Job orderItemGroupMigrationJob(JobRepository jobRepository, @Qualifier("orderItemGroupMigrationStep") Step orderItemGroupMigrationStep) {
        return new JobBuilder("orderItemGroupMigrationJob", jobRepository)
                .start(orderItemGroupMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemInventoryResReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemInventoryResColumns") List<String> orderItemInventoryResColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item_inventory_res", orderItemInventoryResColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemInventoryResWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemInventoryResColumns") List<String> orderItemInventoryResColumns
    ) {
        return createWriter(targetDataSource, "order_item_inventory_res", orderItemInventoryResColumns);
    }

    @Bean
    public Step orderItemInventoryResMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemInventoryResReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemInventoryResWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemInventoryResMigrationStep", orderItemInventoryResReader, orderItemInventoryResWriter, properties);
    }

    @Bean
    public Job orderItemInventoryResMigrationJob(JobRepository jobRepository, @Qualifier("orderItemInventoryResMigrationStep") Step orderItemInventoryResMigrationStep) {
        return new JobBuilder("orderItemInventoryResMigrationJob", jobRepository)
                .start(orderItemInventoryResMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemNoteReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemNoteColumns") List<String> orderItemNoteColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item_note", orderItemNoteColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemNoteWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemNoteColumns") List<String> orderItemNoteColumns
    ) {
        return createWriter(targetDataSource, "order_item_note", orderItemNoteColumns);
    }

    @Bean
    public Step orderItemNoteMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemNoteReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemNoteWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemNoteMigrationStep", orderItemNoteReader, orderItemNoteWriter, properties);
    }

    @Bean
    public Job orderItemNoteMigrationJob(JobRepository jobRepository, @Qualifier("orderItemNoteMigrationStep") Step orderItemNoteMigrationStep) {
        return new JobBuilder("orderItemNoteMigrationJob", jobRepository)
                .start(orderItemNoteMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemPriceInfoReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemPriceInfoColumns") List<String> orderItemPriceInfoColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item_price_info", orderItemPriceInfoColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemPriceInfoWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemPriceInfoColumns") List<String> orderItemPriceInfoColumns
    ) {
        return createWriter(targetDataSource, "order_item_price_info", orderItemPriceInfoColumns);
    }

    @Bean
    public Step orderItemPriceInfoMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemPriceInfoReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemPriceInfoWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemPriceInfoMigrationStep", orderItemPriceInfoReader, orderItemPriceInfoWriter, properties);
    }

    @Bean
    public Job orderItemPriceInfoMigrationJob(JobRepository jobRepository, @Qualifier("orderItemPriceInfoMigrationStep") Step orderItemPriceInfoMigrationStep) {
        return new JobBuilder("orderItemPriceInfoMigrationJob", jobRepository)
                .start(orderItemPriceInfoMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemQAOverrideReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemQAOverrideColumns") List<String> orderItemQAOverrideColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item_q_a_override", orderItemQAOverrideColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemQAOverrideWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemQAOverrideColumns") List<String> orderItemQAOverrideColumns
    ) {
        return createWriter(targetDataSource, "order_item_q_a_override", orderItemQAOverrideColumns);
    }

    @Bean
    public Step orderItemQAOverrideMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemQAOverrideReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemQAOverrideWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemQAOverrideMigrationStep", orderItemQAOverrideReader, orderItemQAOverrideWriter, properties);
    }

    @Bean
    public Job orderItemQAOverrideMigrationJob(JobRepository jobRepository, @Qualifier("orderItemQAOverrideMigrationStep") Step orderItemQAOverrideMigrationStep) {
        return new JobBuilder("orderItemQAOverrideMigrationJob", jobRepository)
                .start(orderItemQAOverrideMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemRoleReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemRoleColumns") List<String> orderItemRoleColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item_role", orderItemRoleColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemRoleWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemRoleColumns") List<String> orderItemRoleColumns
    ) {
        return createWriter(targetDataSource, "order_item_role", orderItemRoleColumns);
    }

    @Bean
    public Step orderItemRoleMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemRoleReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemRoleWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemRoleMigrationStep", orderItemRoleReader, orderItemRoleWriter, properties);
    }

    @Bean
    public Job orderItemRoleMigrationJob(JobRepository jobRepository, @Qualifier("orderItemRoleMigrationStep") Step orderItemRoleMigrationStep) {
        return new JobBuilder("orderItemRoleMigrationJob", jobRepository)
                .start(orderItemRoleMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemShipGroupReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemShipGroupColumns") List<String> orderItemShipGroupColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item_ship_group", orderItemShipGroupColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemShipGroupWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemShipGroupColumns") List<String> orderItemShipGroupColumns
    ) {
        return createWriter(targetDataSource, "order_item_ship_group", orderItemShipGroupColumns);
    }

    @Bean
    public Step orderItemShipGroupMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemShipGroupReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemShipGroupWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemShipGroupMigrationStep", orderItemShipGroupReader, orderItemShipGroupWriter, properties);
    }

    @Bean
    public Job orderItemShipGroupMigrationJob(JobRepository jobRepository, @Qualifier("orderItemShipGroupMigrationStep") Step orderItemShipGroupMigrationStep) {
        return new JobBuilder("orderItemShipGroupMigrationJob", jobRepository)
                .start(orderItemShipGroupMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemShipGroupAssocReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemShipGroupAssocColumns") List<String> orderItemShipGroupAssocColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item_ship_group_assoc", orderItemShipGroupAssocColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemShipGroupAssocWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemShipGroupAssocColumns") List<String> orderItemShipGroupAssocColumns
    ) {
        return createWriter(targetDataSource, "order_item_ship_group_assoc", orderItemShipGroupAssocColumns);
    }

    @Bean
    public Step orderItemShipGroupAssocMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemShipGroupAssocReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemShipGroupAssocWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemShipGroupAssocMigrationStep", orderItemShipGroupAssocReader, orderItemShipGroupAssocWriter, properties);
    }

    @Bean
    public Job orderItemShipGroupAssocMigrationJob(JobRepository jobRepository, @Qualifier("orderItemShipGroupAssocMigrationStep") Step orderItemShipGroupAssocMigrationStep) {
        return new JobBuilder("orderItemShipGroupAssocMigrationJob", jobRepository)
                .start(orderItemShipGroupAssocMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemShipGrpInvResReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemShipGrpInvResColumns") List<String> orderItemShipGrpInvResColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item_ship_grp_inv_res", orderItemShipGrpInvResColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemShipGrpInvResWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemShipGrpInvResColumns") List<String> orderItemShipGrpInvResColumns
    ) {
        return createWriter(targetDataSource, "order_item_ship_grp_inv_res", orderItemShipGrpInvResColumns);
    }

    @Bean
    public Step orderItemShipGrpInvResMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemShipGrpInvResReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemShipGrpInvResWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemShipGrpInvResMigrationStep", orderItemShipGrpInvResReader, orderItemShipGrpInvResWriter, properties);
    }

    @Bean
    public Job orderItemShipGrpInvResMigrationJob(JobRepository jobRepository, @Qualifier("orderItemShipGrpInvResMigrationStep") Step orderItemShipGrpInvResMigrationStep) {
        return new JobBuilder("orderItemShipGrpInvResMigrationJob", jobRepository)
                .start(orderItemShipGrpInvResMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderItemWorkEffortReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderItemWorkEffortColumns") List<String> orderItemWorkEffortColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_item_work_effort", orderItemWorkEffortColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderItemWorkEffortWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderItemWorkEffortColumns") List<String> orderItemWorkEffortColumns
    ) {
        return createWriter(targetDataSource, "order_item_work_effort", orderItemWorkEffortColumns);
    }

    @Bean
    public Step orderItemWorkEffortMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderItemWorkEffortReader,
            JdbcBatchItemWriter<Map<String, Object>> orderItemWorkEffortWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderItemWorkEffortMigrationStep", orderItemWorkEffortReader, orderItemWorkEffortWriter, properties);
    }

    @Bean
    public Job orderItemWorkEffortMigrationJob(JobRepository jobRepository, @Qualifier("orderItemWorkEffortMigrationStep") Step orderItemWorkEffortMigrationStep) {
        return new JobBuilder("orderItemWorkEffortMigrationJob", jobRepository)
                .start(orderItemWorkEffortMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderLabelReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderLabelColumns") List<String> orderLabelColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_label", orderLabelColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderLabelWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderLabelColumns") List<String> orderLabelColumns
    ) {
        return createWriter(targetDataSource, "order_label", orderLabelColumns);
    }

    @Bean
    public Step orderLabelMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderLabelReader,
            JdbcBatchItemWriter<Map<String, Object>> orderLabelWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderLabelMigrationStep", orderLabelReader, orderLabelWriter, properties);
    }

    @Bean
    public Job orderLabelMigrationJob(JobRepository jobRepository, @Qualifier("orderLabelMigrationStep") Step orderLabelMigrationStep) {
        return new JobBuilder("orderLabelMigrationJob", jobRepository)
                .start(orderLabelMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderNotificationReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderNotificationColumns") List<String> orderNotificationColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_notification", orderNotificationColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderNotificationWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderNotificationColumns") List<String> orderNotificationColumns
    ) {
        return createWriter(targetDataSource, "order_notification", orderNotificationColumns);
    }

    @Bean
    public Step orderNotificationMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderNotificationReader,
            JdbcBatchItemWriter<Map<String, Object>> orderNotificationWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderNotificationMigrationStep", orderNotificationReader, orderNotificationWriter, properties);
    }

    @Bean
    public Job orderNotificationMigrationJob(JobRepository jobRepository, @Qualifier("orderNotificationMigrationStep") Step orderNotificationMigrationStep) {
        return new JobBuilder("orderNotificationMigrationJob", jobRepository)
                .start(orderNotificationMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderPaymentPreferenceReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderPaymentPreferenceColumns") List<String> orderPaymentPreferenceColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_payment_preference", orderPaymentPreferenceColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderPaymentPreferenceWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderPaymentPreferenceColumns") List<String> orderPaymentPreferenceColumns
    ) {
        return createWriter(targetDataSource, "order_payment_preference", orderPaymentPreferenceColumns);
    }

    @Bean
    public Step orderPaymentPreferenceMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderPaymentPreferenceReader,
            JdbcBatchItemWriter<Map<String, Object>> orderPaymentPreferenceWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderPaymentPreferenceMigrationStep", orderPaymentPreferenceReader, orderPaymentPreferenceWriter, properties);
    }

    @Bean
    public Job orderPaymentPreferenceMigrationJob(JobRepository jobRepository, @Qualifier("orderPaymentPreferenceMigrationStep") Step orderPaymentPreferenceMigrationStep) {
        return new JobBuilder("orderPaymentPreferenceMigrationJob", jobRepository)
                .start(orderPaymentPreferenceMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderProductPromoCodeReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderProductPromoCodeColumns") List<String> orderProductPromoCodeColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_product_promo_code", orderProductPromoCodeColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderProductPromoCodeWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderProductPromoCodeColumns") List<String> orderProductPromoCodeColumns
    ) {
        return createWriter(targetDataSource, "order_product_promo_code", orderProductPromoCodeColumns);
    }

    @Bean
    public Step orderProductPromoCodeMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderProductPromoCodeReader,
            JdbcBatchItemWriter<Map<String, Object>> orderProductPromoCodeWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderProductPromoCodeMigrationStep", orderProductPromoCodeReader, orderProductPromoCodeWriter, properties);
    }

    @Bean
    public Job orderProductPromoCodeMigrationJob(JobRepository jobRepository, @Qualifier("orderProductPromoCodeMigrationStep") Step orderProductPromoCodeMigrationStep) {
        return new JobBuilder("orderProductPromoCodeMigrationJob", jobRepository)
                .start(orderProductPromoCodeMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderRequirementCommitmentReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderRequirementCommitmentColumns") List<String> orderRequirementCommitmentColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_requirement_commitment", orderRequirementCommitmentColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderRequirementCommitmentWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderRequirementCommitmentColumns") List<String> orderRequirementCommitmentColumns
    ) {
        return createWriter(targetDataSource, "order_requirement_commitment", orderRequirementCommitmentColumns);
    }

    @Bean
    public Step orderRequirementCommitmentMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderRequirementCommitmentReader,
            JdbcBatchItemWriter<Map<String, Object>> orderRequirementCommitmentWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderRequirementCommitmentMigrationStep", orderRequirementCommitmentReader, orderRequirementCommitmentWriter, properties);
    }

    @Bean
    public Job orderRequirementCommitmentMigrationJob(JobRepository jobRepository, @Qualifier("orderRequirementCommitmentMigrationStep") Step orderRequirementCommitmentMigrationStep) {
        return new JobBuilder("orderRequirementCommitmentMigrationJob", jobRepository)
                .start(orderRequirementCommitmentMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderRoleReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderRoleColumns") List<String> orderRoleColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_role", orderRoleColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderRoleWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderRoleColumns") List<String> orderRoleColumns
    ) {
        return createWriter(targetDataSource, "order_role", orderRoleColumns);
    }

    @Bean
    public Step orderRoleMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderRoleReader,
            JdbcBatchItemWriter<Map<String, Object>> orderRoleWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderRoleMigrationStep", orderRoleReader, orderRoleWriter, properties);
    }

    @Bean
    public Job orderRoleMigrationJob(JobRepository jobRepository, @Qualifier("orderRoleMigrationStep") Step orderRoleMigrationStep) {
        return new JobBuilder("orderRoleMigrationJob", jobRepository)
                .start(orderRoleMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderShipmentReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderShipmentColumns") List<String> orderShipmentColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_shipment", orderShipmentColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderShipmentWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderShipmentColumns") List<String> orderShipmentColumns
    ) {
        return createWriter(targetDataSource, "order_shipment", orderShipmentColumns);
    }

    @Bean
    public Step orderShipmentMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderShipmentReader,
            JdbcBatchItemWriter<Map<String, Object>> orderShipmentWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderShipmentMigrationStep", orderShipmentReader, orderShipmentWriter, properties);
    }

    @Bean
    public Job orderShipmentMigrationJob(JobRepository jobRepository, @Qualifier("orderShipmentMigrationStep") Step orderShipmentMigrationStep) {
        return new JobBuilder("orderShipmentMigrationJob", jobRepository)
                .start(orderShipmentMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderShipmentPreferenceReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderShipmentPreferenceColumns") List<String> orderShipmentPreferenceColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_shipment_preference", orderShipmentPreferenceColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderShipmentPreferenceWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderShipmentPreferenceColumns") List<String> orderShipmentPreferenceColumns
    ) {
        return createWriter(targetDataSource, "order_shipment_preference", orderShipmentPreferenceColumns);
    }

    @Bean
    public Step orderShipmentPreferenceMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderShipmentPreferenceReader,
            JdbcBatchItemWriter<Map<String, Object>> orderShipmentPreferenceWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderShipmentPreferenceMigrationStep", orderShipmentPreferenceReader, orderShipmentPreferenceWriter, properties);
    }

    @Bean
    public Job orderShipmentPreferenceMigrationJob(JobRepository jobRepository, @Qualifier("orderShipmentPreferenceMigrationStep") Step orderShipmentPreferenceMigrationStep) {
        return new JobBuilder("orderShipmentPreferenceMigrationJob", jobRepository)
                .start(orderShipmentPreferenceMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderStatusReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderStatusColumns") List<String> orderStatusColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_status", orderStatusColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderStatusWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderStatusColumns") List<String> orderStatusColumns
    ) {
        return createWriter(targetDataSource, "order_status", orderStatusColumns);
    }

    @Bean
    public Step orderStatusMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderStatusReader,
            JdbcBatchItemWriter<Map<String, Object>> orderStatusWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderStatusMigrationStep", orderStatusReader, orderStatusWriter, properties);
    }

    @Bean
    public Job orderStatusMigrationJob(JobRepository jobRepository, @Qualifier("orderStatusMigrationStep") Step orderStatusMigrationStep) {
        return new JobBuilder("orderStatusMigrationJob", jobRepository)
                .start(orderStatusMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderSummaryEntryReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderSummaryEntryColumns") List<String> orderSummaryEntryColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_summary_entry", orderSummaryEntryColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderSummaryEntryWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderSummaryEntryColumns") List<String> orderSummaryEntryColumns
    ) {
        return createWriter(targetDataSource, "order_summary_entry", orderSummaryEntryColumns);
    }

    @Bean
    public Step orderSummaryEntryMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderSummaryEntryReader,
            JdbcBatchItemWriter<Map<String, Object>> orderSummaryEntryWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderSummaryEntryMigrationStep", orderSummaryEntryReader, orderSummaryEntryWriter, properties);
    }

    @Bean
    public Job orderSummaryEntryMigrationJob(JobRepository jobRepository, @Qualifier("orderSummaryEntryMigrationStep") Step orderSummaryEntryMigrationStep) {
        return new JobBuilder("orderSummaryEntryMigrationJob", jobRepository)
                .start(orderSummaryEntryMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderTermReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTermColumns") List<String> orderTermColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_term", orderTermColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderTermWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderTermColumns") List<String> orderTermColumns
    ) {
        return createWriter(targetDataSource, "order_term", orderTermColumns);
    }

    @Bean
    public Step orderTermMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderTermReader,
            JdbcBatchItemWriter<Map<String, Object>> orderTermWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderTermMigrationStep", orderTermReader, orderTermWriter, properties);
    }

    @Bean
    public Job orderTermMigrationJob(JobRepository jobRepository, @Qualifier("orderTermMigrationStep") Step orderTermMigrationStep) {
        return new JobBuilder("orderTermMigrationJob", jobRepository)
                .start(orderTermMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderTermAttributeReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderTermAttributeColumns") List<String> orderTermAttributeColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_term_attribute", orderTermAttributeColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderTermAttributeWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderTermAttributeColumns") List<String> orderTermAttributeColumns
    ) {
        return createWriter(targetDataSource, "order_term_attribute", orderTermAttributeColumns);
    }

    @Bean
    public Step orderTermAttributeMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderTermAttributeReader,
            JdbcBatchItemWriter<Map<String, Object>> orderTermAttributeWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderTermAttributeMigrationStep", orderTermAttributeReader, orderTermAttributeWriter, properties);
    }

    @Bean
    public Job orderTermAttributeMigrationJob(JobRepository jobRepository, @Qualifier("orderTermAttributeMigrationStep") Step orderTermAttributeMigrationStep) {
        return new JobBuilder("orderTermAttributeMigrationJob", jobRepository)
                .start(orderTermAttributeMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> orderWorkEffortApplReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("orderWorkEffortApplColumns") List<String> orderWorkEffortApplColumns,
            OrderMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "order_work_effort_appl", orderWorkEffortApplColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> orderWorkEffortApplWriter(
            @Qualifier("orderTargetDataSource") DataSource targetDataSource,
            @Qualifier("orderWorkEffortApplColumns") List<String> orderWorkEffortApplColumns
    ) {
        return createWriter(targetDataSource, "order_work_effort_appl", orderWorkEffortApplColumns);
    }

    @Bean
    public Step orderWorkEffortApplMigrationStep(
            JobRepository jobRepository,
            @Qualifier("orderTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> orderWorkEffortApplReader,
            JdbcBatchItemWriter<Map<String, Object>> orderWorkEffortApplWriter,
            OrderMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "orderWorkEffortApplMigrationStep", orderWorkEffortApplReader, orderWorkEffortApplWriter, properties);
    }

    @Bean
    public Job orderWorkEffortApplMigrationJob(JobRepository jobRepository, @Qualifier("orderWorkEffortApplMigrationStep") Step orderWorkEffortApplMigrationStep) {
        return new JobBuilder("orderWorkEffortApplMigrationJob", jobRepository)
                .start(orderWorkEffortApplMigrationStep)
                .build();
    }

    private JdbcCursorItemReader<Map<String, Object>> createReader(
            DataSource sourceDataSource,
            String tableName,
            List<String> columns,
            OrderMigrationProperties properties
    ) {
        JdbcCursorItemReader<Map<String, Object>> reader = new JdbcCursorItemReader<>();
        reader.setDataSource(sourceDataSource);
        reader.setFetchSize(properties.getFetchSize());
        reader.setRowMapper(new ColumnMapRowMapper());
        reader.setSql("SELECT " + String.join(", ", columns) + " FROM " + tableName);
        return reader;
    }

    private JdbcBatchItemWriter<Map<String, Object>> createWriter(
            DataSource targetDataSource,
            String tableName,
            List<String> columns
    ) {
        String insertColumns = String.join(", ", columns);
        String placeholders = columns.stream().map(c -> "?").collect(Collectors.joining(", "));
        String updateAssignments = columns.stream()
                .map(col -> col + "=VALUES(" + col + ")")
                .collect(Collectors.joining(", "));
        String sql = "INSERT INTO " + tableName + " (" + insertColumns + ") VALUES (" + placeholders + ") "
                + "ON DUPLICATE KEY UPDATE " + updateAssignments;

        JdbcBatchItemWriter<Map<String, Object>> writer = new JdbcBatchItemWriter<>();
        writer.setDataSource(targetDataSource);
        writer.setSql(sql);
        writer.setItemPreparedStatementSetter(new ItemPreparedStatementSetter<>() {
            @Override
            public void setValues(Map<String, Object> item, PreparedStatement ps) throws SQLException {
                for (int i = 0; i < columns.size(); i++) {
                    ps.setObject(i + 1, item.get(columns.get(i)));
                }
            }
        });
        return writer;
    }

    private Step createStep(
            JobRepository jobRepository,
            PlatformTransactionManager transactionManager,
            String stepName,
            JdbcCursorItemReader<Map<String, Object>> reader,
            JdbcBatchItemWriter<Map<String, Object>> writer,
            OrderMigrationProperties properties
    ) {
        return new StepBuilder(stepName, jobRepository)
                .<Map<String, Object>, Map<String, Object>>chunk(properties.getChunkSize(), transactionManager)
                .reader(reader)
                .writer(writer)
                .build();
    }
}