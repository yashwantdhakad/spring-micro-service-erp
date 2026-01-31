package com.monash.erp.migration.product.job;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import com.monash.erp.migration.product.config.ProductMigrationProperties;

@Configuration
@EnableBatchProcessing
@EnableConfigurationProperties(ProductMigrationProperties.class)
public class ProductMigrationJobConfig {

    @Bean
    public JdbcCursorItemReader<Map<String, Object>> productReader(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            ProductMigrationProperties properties,
            @Qualifier("productColumns") List<String> productColumns
    ) {
        JdbcCursorItemReader<Map<String, Object>> reader = new JdbcCursorItemReader<>();
        reader.setDataSource(sourceDataSource);
        reader.setSql("SELECT " + String.join(", ", productColumns) + " FROM product");
        reader.setRowMapper(new ColumnMapRowMapper());
        reader.setFetchSize(properties.getFetchSize());
        return reader;
    }

    @Bean
    public JdbcBatchItemWriter<Map<String, Object>> productWriter(
            @Qualifier("targetDataSource") DataSource targetDataSource,
            @Qualifier("productColumns") List<String> productColumns
    ) {
        JdbcBatchItemWriter<Map<String, Object>> writer = new JdbcBatchItemWriter<>();
        writer.setDataSource(targetDataSource);
        writer.setSql(buildInsertSql(productColumns));
        writer.setItemPreparedStatementSetter(new ItemPreparedStatementSetter<Map<String, Object>>() {
            @Override
            public void setValues(Map<String, Object> item, PreparedStatement ps) throws SQLException {
                int index = 1;
                for (String column : productColumns) {
                    ps.setObject(index++, item.get(column));
                }
            }
        });
        return writer;
    }

    @Bean
    public Step productMigrationStep(
            JobRepository jobRepository,
            PlatformTransactionManager transactionManager,
            JdbcCursorItemReader<Map<String, Object>> productReader,
            JdbcBatchItemWriter<Map<String, Object>> productWriter,
            ProductMigrationProperties properties
    ) {
        return new StepBuilder("productMigrationStep", jobRepository)
                .<Map<String, Object>, Map<String, Object>>chunk(properties.getChunkSize(), transactionManager)
                .reader(productReader)
                .writer(productWriter)
                .build();
    }

    @Bean
    public Job productMigrationJob(JobRepository jobRepository, Step productMigrationStep) {
        return new JobBuilder("productMigrationJob", jobRepository)
                .incrementer(new RunIdIncrementer())
                .start(productMigrationStep)
                .build();
    }

    @Bean
    public CommandLineRunner runProductMigrationOnStartup(
            JobLauncher jobLauncher,
            Job productMigrationJob,
            ProductMigrationProperties properties
    ) {
        return args -> {
            if (!properties.isRunOnStartup()) {
                return;
            }
            JobParametersBuilder params = new JobParametersBuilder();
            params.addLong("run.id", System.currentTimeMillis());
            jobLauncher.run(productMigrationJob, params.toJobParameters());
        };
    }

    private String buildInsertSql(List<String> productColumns) {
        String columns = String.join(", ", productColumns);
        String placeholders = productColumns.stream().map(col -> "?").collect(Collectors.joining(", "));
        String updateClause = productColumns.stream()
                .map(col -> col + "=VALUES(" + col + ")")
                .collect(Collectors.joining(", "));
        return "INSERT INTO product (" + columns + ") VALUES (" + placeholders + ") ON DUPLICATE KEY UPDATE " + updateClause;
    }
}
