package com.monash.erp.migration.product.job;

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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.transaction.PlatformTransactionManager;

import com.monash.erp.migration.product.config.ProductMigrationProperties;

@Configuration
@EnableBatchProcessing
public class ProductIdentificationMigrationJobConfig {

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> productIdentificationReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            ProductMigrationProperties properties,
            @Qualifier("productIdentificationColumns") List<String> productIdentificationColumns
    ) {
        JdbcCursorItemReader<Map<String, Object>> reader = new JdbcCursorItemReader<>();
        reader.setDataSource(sourceDataSource);
        reader.setSql("SELECT " + String.join(", ", productIdentificationColumns) + " FROM product_identification");
        reader.setRowMapper(new ColumnMapRowMapper());
        reader.setFetchSize(properties.getFetchSize());
        return reader;
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> productIdentificationWriter(
            @Qualifier("targetDataSource") DataSource targetDataSource,
            @Qualifier("productIdentificationColumns") List<String> productIdentificationColumns
    ) {
        JdbcBatchItemWriter<Map<String, Object>> writer = new JdbcBatchItemWriter<>();
        writer.setDataSource(targetDataSource);
        writer.setSql(buildInsertSql("product_identification", productIdentificationColumns));
        writer.setItemPreparedStatementSetter(new ItemPreparedStatementSetter<Map<String, Object>>() {
            @Override
            public void setValues(Map<String, Object> item, PreparedStatement ps) throws SQLException {
                int index = 1;
                for (String column : productIdentificationColumns) {
                    ps.setObject(index++, item.get(column));
                }
            }
        });
        return writer;
    }

    @Bean
    public Step productIdentificationMigrationStep(
            JobRepository jobRepository,
            PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> productIdentificationReader,
            JdbcBatchItemWriter<Map<String, Object>> productIdentificationWriter,
            ProductMigrationProperties properties
    ) {
        return new StepBuilder("productIdentificationMigrationStep", jobRepository)
                .<Map<String, Object>, Map<String, Object>>chunk(properties.getChunkSize(), transactionManager)
                .reader(productIdentificationReader)
                .writer(productIdentificationWriter)
                .build();
    }

    @Bean
    public Job productIdentificationMigrationJob(JobRepository jobRepository, Step productIdentificationMigrationStep) {
        return new JobBuilder("productIdentificationMigrationJob", jobRepository)
                .start(productIdentificationMigrationStep)
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
