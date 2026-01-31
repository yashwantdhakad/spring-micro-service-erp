package com.monash.erp.migration.party.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "migration.party")
public class PartyMigrationProperties {

    private int chunkSize = 1000;
    private int fetchSize = 1000;

    public int getChunkSize() {
        return chunkSize;
    }

    public void setChunkSize(int chunkSize) {
        this.chunkSize = chunkSize;
    }

    public int getFetchSize() {
        return fetchSize;
    }

    public void setFetchSize(int fetchSize) {
        this.fetchSize = fetchSize;
    }
}
