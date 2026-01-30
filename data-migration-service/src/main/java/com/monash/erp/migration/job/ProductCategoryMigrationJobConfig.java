package com.monash.erp.migration.job;

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

import com.monash.erp.migration.config.ProductMigrationProperties;

@Configuration
@EnableBatchProcessing
public class ProductCategoryMigrationJobConfig {

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> productCategoryReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            ProductMigrationProperties properties,
            @Qualifier("productCategoryColumns") List<String> productCategoryColumns
    ) {
        JdbcCursorItemReader<Map<String, Object>> reader = new JdbcCursorItemReader<>();
        reader.setDataSource(sourceDataSource);
        reader.setSql("SELECT " + String.join(", ", productCategoryColumns) + " FROM product_category");
        reader.setRowMapper(new ColumnMapRowMapper());
        reader.setFetchSize(properties.getFetchSize());
        return reader;
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> productCategoryWriter(
            @Qualifier("targetDataSource") DataSource targetDataSource,
            @Qualifier("productCategoryColumns") List<String> productCategoryColumns
    ) {
        JdbcBatchItemWriter<Map<String, Object>> writer = new JdbcBatchItemWriter<>();
        writer.setDataSource(targetDataSource);
        writer.setSql(buildInsertSql("product_category", productCategoryColumns));
        writer.setItemPreparedStatementSetter(new ItemPreparedStatementSetter<Map<String, Object>>() {
            @Override
            public void setValues(Map<String, Object> item, PreparedStatement ps) throws SQLException {
                int index = 1;
                for (String column : productCategoryColumns) {
                    ps.setObject(index++, item.get(column));
                }
            }
        });
        return writer;
    }

    @Bean
    public Step productCategoryMigrationStep(
            JobRepository jobRepository,
            PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> productCategoryReader,
            JdbcBatchItemWriter<Map<String, Object>> productCategoryWriter,
            ProductMigrationProperties properties
    ) {
        return new StepBuilder("productCategoryMigrationStep", jobRepository)
                .<Map<String, Object>, Map<String, Object>>chunk(properties.getChunkSize(), transactionManager)
                .reader(productCategoryReader)
                .writer(productCategoryWriter)
                .build();
    }

    @Bean
    public Job productCategoryMigrationJob(JobRepository jobRepository, Step productCategoryMigrationStep) {
        return new JobBuilder("productCategoryMigrationJob", jobRepository)
                .start(productCategoryMigrationStep)
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
