package com.monash.erp.migration.party.config;

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
public class PartyColumnConfig {

    private static final Logger logger = LoggerFactory.getLogger(PartyColumnConfig.class);

    @Bean
    public List<String> partyColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("partyTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "party");
    }

    @Bean
    public List<String> personColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("partyTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "person");
    }

    @Bean
    public List<String> partyGroupColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("partyTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "party_group");
    }

    @Bean
    public List<String> partyRoleColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("partyTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "party_role");
    }

    @Bean
    public List<String> partyIdentificationColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("partyTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "party_identification");
    }

    @Bean
    public List<String> partyContactMechColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("partyTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "party_contact_mech");
    }

    @Bean
    public List<String> partyContactMechPurposeColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("partyTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "party_contact_mech_purpose");
    }

    @Bean
    public List<String> postalAddressColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("partyTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "postal_address");
    }

    @Bean
    public List<String> telecomNumberColumns(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("partyTargetDataSource") DataSource targetDataSource
    ) {
        return resolveColumns(sourceDataSource, targetDataSource, "telecom_number");
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
