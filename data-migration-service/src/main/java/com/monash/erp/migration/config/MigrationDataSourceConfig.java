package com.monash.erp.migration.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class MigrationDataSourceConfig {

    @Bean(name = "sourceDataSource")
    @ConfigurationProperties("migration.datasource.source")
    public DataSource sourceDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "targetDataSource")
    @Primary
    @ConfigurationProperties("migration.datasource.target")
    public DataSource targetDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "partyTargetDataSource")
    @ConfigurationProperties("migration.datasource.party-target")
    public DataSource partyTargetDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "orderTargetDataSource")
    @ConfigurationProperties("migration.datasource.order-target")
    public DataSource orderTargetDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "dataSource")
    public DataSource dataSource(@Qualifier("targetDataSource") DataSource targetDataSource) {
        return targetDataSource;
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource targetDataSource) {
        return new DataSourceTransactionManager(targetDataSource);
    }

    @Bean(name = "partyTransactionManager")
    public PlatformTransactionManager partyTransactionManager(
            @Qualifier("partyTargetDataSource") DataSource partyTargetDataSource
    ) {
        return new DataSourceTransactionManager(partyTargetDataSource);
    }

    @Bean(name = "orderTransactionManager")
    public PlatformTransactionManager orderTransactionManager(
            @Qualifier("orderTargetDataSource") DataSource orderTargetDataSource
    ) {
        return new DataSourceTransactionManager(orderTargetDataSource);
    }
}
