package com.monash.erp.migration.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.batch.BatchDataSource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class MigrationDataSourceConfig {

    @Bean
    @ConfigurationProperties("migration.datasource.source")
    public DataSourceProperties sourceDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "sourceDataSource")
    public DataSource sourceDataSource() {
        return sourceDataSourceProperties()
            .initializeDataSourceBuilder()
            .build();
    }

    @Bean
    @ConfigurationProperties("migration.datasource.target")
    public DataSourceProperties targetDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "targetDataSource")
    @Primary
    @BatchDataSource
    public DataSource targetDataSource() {
        return targetDataSourceProperties()
            .initializeDataSourceBuilder()
            .build();
    }

    @Bean(name = "dataSource")
    public DataSource dataSource(@Qualifier("targetDataSource") DataSource targetDataSource) {
        return targetDataSource;
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource targetDataSource) {
        return new DataSourceTransactionManager(targetDataSource);
    }
}
