package com.monash.erp.migration.product.config;

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
public class ProductColumnConfig {

    private static final Logger logger = LoggerFactory.getLogger(ProductColumnConfig.class);

    @Bean
    public List<String> productColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("targetDataSource") DataSource targetDataSource
    ) {
        JdbcTemplate sourceJdbc = new JdbcTemplate(sourceDataSource);
        JdbcTemplate targetJdbc = new JdbcTemplate(targetDataSource);

        List<String> targetColumns = fetchColumns(targetJdbc, "product");
        Set<String> sourceColumns = new LinkedHashSet<>(fetchColumns(sourceJdbc, "product"));

        List<String> missingInTarget = sourceColumns.stream()
                .filter(col -> !targetColumns.contains(col))
                .sorted()
                .collect(Collectors.toList());
        List<String> missingInSource = targetColumns.stream()
                .filter(col -> !sourceColumns.contains(col))
                .sorted()
                .collect(Collectors.toList());

        if (!missingInTarget.isEmpty()) {
            throw new IllegalStateException("Target product table is missing columns: " + missingInTarget);
        }
        if (!missingInSource.isEmpty()) {
            logger.warn("Skipping columns missing in source product table: {}", missingInSource);
        }

        if (sourceColumns.isEmpty()) {
            throw new IllegalStateException("No columns found in source product table");
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
