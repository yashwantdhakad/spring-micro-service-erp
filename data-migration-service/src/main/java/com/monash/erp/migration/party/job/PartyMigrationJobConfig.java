package com.monash.erp.migration.party.job;

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

import com.monash.erp.migration.party.config.PartyMigrationProperties;

@Configuration
@EnableBatchProcessing
@EnableConfigurationProperties(PartyMigrationProperties.class)
public class PartyMigrationJobConfig {

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> partyReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("partyColumns") List<String> partyColumns,
            PartyMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "party", partyColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> partyWriter(
            @Qualifier("partyTargetDataSource") DataSource targetDataSource,
            @Qualifier("partyColumns") List<String> partyColumns
    ) {
        return createWriter(targetDataSource, "party", partyColumns);
    }

    @Bean
    public Step partyMigrationStep(
            JobRepository jobRepository,
            @Qualifier("partyTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> partyReader,
            JdbcBatchItemWriter<Map<String, Object>> partyWriter,
            PartyMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "partyMigrationStep", partyReader, partyWriter, properties);
    }

    @Bean
    public Job partyMigrationJob(JobRepository jobRepository, Step partyMigrationStep) {
        return new JobBuilder("partyMigrationJob", jobRepository)
                .start(partyMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> personReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("personColumns") List<String> personColumns,
            PartyMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "person", personColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> personWriter(
            @Qualifier("partyTargetDataSource") DataSource targetDataSource,
            @Qualifier("personColumns") List<String> personColumns
    ) {
        return createWriter(targetDataSource, "person", personColumns);
    }

    @Bean
    public Step personMigrationStep(
            JobRepository jobRepository,
            @Qualifier("partyTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> personReader,
            JdbcBatchItemWriter<Map<String, Object>> personWriter,
            PartyMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "personMigrationStep", personReader, personWriter, properties);
    }

    @Bean
    public Job personMigrationJob(JobRepository jobRepository, Step personMigrationStep) {
        return new JobBuilder("personMigrationJob", jobRepository)
                .start(personMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> partyGroupReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("partyGroupColumns") List<String> partyGroupColumns,
            PartyMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "party_group", partyGroupColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> partyGroupWriter(
            @Qualifier("partyTargetDataSource") DataSource targetDataSource,
            @Qualifier("partyGroupColumns") List<String> partyGroupColumns
    ) {
        return createWriter(targetDataSource, "party_group", partyGroupColumns);
    }

    @Bean
    public Step partyGroupMigrationStep(
            JobRepository jobRepository,
            @Qualifier("partyTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> partyGroupReader,
            JdbcBatchItemWriter<Map<String, Object>> partyGroupWriter,
            PartyMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "partyGroupMigrationStep", partyGroupReader, partyGroupWriter, properties);
    }

    @Bean
    public Job partyGroupMigrationJob(JobRepository jobRepository, Step partyGroupMigrationStep) {
        return new JobBuilder("partyGroupMigrationJob", jobRepository)
                .start(partyGroupMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> partyRoleReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("partyRoleColumns") List<String> partyRoleColumns,
            PartyMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "party_role", partyRoleColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> partyRoleWriter(
            @Qualifier("partyTargetDataSource") DataSource targetDataSource,
            @Qualifier("partyRoleColumns") List<String> partyRoleColumns
    ) {
        return createWriter(targetDataSource, "party_role", partyRoleColumns);
    }

    @Bean
    public Step partyRoleMigrationStep(
            JobRepository jobRepository,
            @Qualifier("partyTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> partyRoleReader,
            JdbcBatchItemWriter<Map<String, Object>> partyRoleWriter,
            PartyMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "partyRoleMigrationStep", partyRoleReader, partyRoleWriter, properties);
    }

    @Bean
    public Job partyRoleMigrationJob(JobRepository jobRepository, Step partyRoleMigrationStep) {
        return new JobBuilder("partyRoleMigrationJob", jobRepository)
                .start(partyRoleMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> partyIdentificationReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("partyIdentificationColumns") List<String> partyIdentificationColumns,
            PartyMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "party_identification", partyIdentificationColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> partyIdentificationWriter(
            @Qualifier("partyTargetDataSource") DataSource targetDataSource,
            @Qualifier("partyIdentificationColumns") List<String> partyIdentificationColumns
    ) {
        return createWriter(targetDataSource, "party_identification", partyIdentificationColumns);
    }

    @Bean
    public Step partyIdentificationMigrationStep(
            JobRepository jobRepository,
            @Qualifier("partyTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> partyIdentificationReader,
            JdbcBatchItemWriter<Map<String, Object>> partyIdentificationWriter,
            PartyMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "partyIdentificationMigrationStep", partyIdentificationReader, partyIdentificationWriter, properties);
    }

    @Bean
    public Job partyIdentificationMigrationJob(JobRepository jobRepository, Step partyIdentificationMigrationStep) {
        return new JobBuilder("partyIdentificationMigrationJob", jobRepository)
                .start(partyIdentificationMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> partyContactMechReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("partyContactMechColumns") List<String> partyContactMechColumns,
            PartyMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "party_contact_mech", partyContactMechColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> partyContactMechWriter(
            @Qualifier("partyTargetDataSource") DataSource targetDataSource,
            @Qualifier("partyContactMechColumns") List<String> partyContactMechColumns
    ) {
        return createWriter(targetDataSource, "party_contact_mech", partyContactMechColumns);
    }

    @Bean
    public Step partyContactMechMigrationStep(
            JobRepository jobRepository,
            @Qualifier("partyTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> partyContactMechReader,
            JdbcBatchItemWriter<Map<String, Object>> partyContactMechWriter,
            PartyMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "partyContactMechMigrationStep", partyContactMechReader, partyContactMechWriter, properties);
    }

    @Bean
    public Job partyContactMechMigrationJob(JobRepository jobRepository, Step partyContactMechMigrationStep) {
        return new JobBuilder("partyContactMechMigrationJob", jobRepository)
                .start(partyContactMechMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> partyContactMechPurposeReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("partyContactMechPurposeColumns") List<String> partyContactMechPurposeColumns,
            PartyMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "party_contact_mech_purpose", partyContactMechPurposeColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> partyContactMechPurposeWriter(
            @Qualifier("partyTargetDataSource") DataSource targetDataSource,
            @Qualifier("partyContactMechPurposeColumns") List<String> partyContactMechPurposeColumns
    ) {
        return createWriter(targetDataSource, "party_contact_mech_purpose", partyContactMechPurposeColumns);
    }

    @Bean
    public Step partyContactMechPurposeMigrationStep(
            JobRepository jobRepository,
            @Qualifier("partyTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> partyContactMechPurposeReader,
            JdbcBatchItemWriter<Map<String, Object>> partyContactMechPurposeWriter,
            PartyMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "partyContactMechPurposeMigrationStep", partyContactMechPurposeReader, partyContactMechPurposeWriter, properties);
    }

    @Bean
    public Job partyContactMechPurposeMigrationJob(JobRepository jobRepository, Step partyContactMechPurposeMigrationStep) {
        return new JobBuilder("partyContactMechPurposeMigrationJob", jobRepository)
                .start(partyContactMechPurposeMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> postalAddressReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("postalAddressColumns") List<String> postalAddressColumns,
            PartyMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "postal_address", postalAddressColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> postalAddressWriter(
            @Qualifier("partyTargetDataSource") DataSource targetDataSource,
            @Qualifier("postalAddressColumns") List<String> postalAddressColumns
    ) {
        return createWriter(targetDataSource, "postal_address", postalAddressColumns);
    }

    @Bean
    public Step postalAddressMigrationStep(
            JobRepository jobRepository,
            @Qualifier("partyTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> postalAddressReader,
            JdbcBatchItemWriter<Map<String, Object>> postalAddressWriter,
            PartyMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "postalAddressMigrationStep", postalAddressReader, postalAddressWriter, properties);
    }

    @Bean
    public Job postalAddressMigrationJob(JobRepository jobRepository, Step postalAddressMigrationStep) {
        return new JobBuilder("postalAddressMigrationJob", jobRepository)
                .start(postalAddressMigrationStep)
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> telecomNumberReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("telecomNumberColumns") List<String> telecomNumberColumns,
            PartyMigrationProperties properties
    ) {
        return createReader(sourceDataSource, "telecom_number", telecomNumberColumns, properties);
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> telecomNumberWriter(
            @Qualifier("partyTargetDataSource") DataSource targetDataSource,
            @Qualifier("telecomNumberColumns") List<String> telecomNumberColumns
    ) {
        return createWriter(targetDataSource, "telecom_number", telecomNumberColumns);
    }

    @Bean
    public Step telecomNumberMigrationStep(
            JobRepository jobRepository,
            @Qualifier("partyTransactionManager") PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> telecomNumberReader,
            JdbcBatchItemWriter<Map<String, Object>> telecomNumberWriter,
            PartyMigrationProperties properties
    ) {
        return createStep(jobRepository, transactionManager, "telecomNumberMigrationStep", telecomNumberReader, telecomNumberWriter, properties);
    }

    @Bean
    public Job telecomNumberMigrationJob(JobRepository jobRepository, Step telecomNumberMigrationStep) {
        return new JobBuilder("telecomNumberMigrationJob", jobRepository)
                .start(telecomNumberMigrationStep)
                .build();
    }

    private JdbcCursorItemReader<Map<String, Object>> createReader(
            DataSource sourceDataSource,
            String tableName,
            List<String> columns,
            PartyMigrationProperties properties
    ) {
        JdbcCursorItemReader<Map<String, Object>> reader = new JdbcCursorItemReader<>();
        reader.setDataSource(sourceDataSource);
        reader.setSql("SELECT " + String.join(", ", columns) + " FROM " + tableName);
        reader.setRowMapper(new ColumnMapRowMapper());
        reader.setFetchSize(properties.getFetchSize());
        return reader;
    }

    private JdbcBatchItemWriter<Map<String, Object>> createWriter(
            DataSource targetDataSource,
            String tableName,
            List<String> columns
    ) {
        JdbcBatchItemWriter<Map<String, Object>> writer = new JdbcBatchItemWriter<>();
        writer.setDataSource(targetDataSource);
        writer.setSql(buildInsertSql(tableName, columns));
        writer.setItemPreparedStatementSetter(new ItemPreparedStatementSetter<Map<String, Object>>() {
            @Override
            public void setValues(Map<String, Object> item, PreparedStatement ps) throws SQLException {
                int index = 1;
                for (String column : columns) {
                    ps.setObject(index++, item.get(column));
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
            PartyMigrationProperties properties
    ) {
        return new StepBuilder(stepName, jobRepository)
                .<Map<String, Object>, Map<String, Object>>chunk(properties.getChunkSize(), transactionManager)
                .reader(reader)
                .writer(writer)
                .build();
    }

    private String buildInsertSql(String tableName, List<String> columns) {
        String columnList = String.join(", ", columns);
        String placeholders = columns.stream().map(col -> "?").collect(Collectors.joining(", "));
        String updateClause = columns.stream()
                .map(col -> col + "=VALUES(" + col + ")")
                .collect(Collectors.joining(", "));
        return "INSERT INTO " + tableName + " (" + columnList + ") VALUES (" + placeholders + ") ON DUPLICATE KEY UPDATE " + updateClause;
    }
}
