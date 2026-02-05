package com.monash.erp.migration.lookup;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class WorkEffortMigrationService {

    private static final Logger logger = LoggerFactory.getLogger(WorkEffortMigrationService.class);

    private final DataSource sourceDataSource;
    private final DataSource mfgTargetDataSource;
    private final SchemaTableResolver schemaTableResolver;

    public WorkEffortMigrationService(
            @Qualifier("sourceDataSource") DataSource sourceDataSource,
            @Qualifier("mfgTargetDataSource") DataSource mfgTargetDataSource,
            SchemaTableResolver schemaTableResolver
    ) {
        this.sourceDataSource = sourceDataSource;
        this.mfgTargetDataSource = mfgTargetDataSource;
        this.schemaTableResolver = schemaTableResolver;
    }

    public WorkEffortMigrationResult migrateAll() {
        WorkEffortMigrationResult result = new WorkEffortMigrationResult();
        List<String> tables = schemaTableResolver.resolveTablesByPrefix("mfg-schema.sql", "work_effort");
        if (tables.isEmpty()) {
            result.message = "No work_effort tables found in mfg-schema.sql";
            return result;
        }
        JdbcTemplate sourceJdbc = new JdbcTemplate(sourceDataSource);
        JdbcTemplate targetJdbc = new JdbcTemplate(mfgTargetDataSource);
        for (String table : tables) {
            if (!tableExists(sourceJdbc, table) || !tableExists(targetJdbc, table)) {
                result.skippedTables.add(table);
                continue;
            }
            List<String> columns = resolveColumns(sourceJdbc, targetJdbc, table, result);
            if (columns.isEmpty()) {
                result.skippedTables.add(table);
                continue;
            }
            int migrated = migrateTable(sourceJdbc, targetJdbc, table, columns);
            result.migratedTables.put(table, migrated);
        }
        result.message = "Completed";
        return result;
    }

    private boolean tableExists(JdbcTemplate jdbcTemplate, String tableName) {
        String sql = "SELECT COUNT(*) FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = DATABASE() AND TABLE_NAME = ?";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, tableName);
        return count != null && count > 0;
    }

    private List<String> resolveColumns(JdbcTemplate sourceJdbc, JdbcTemplate targetJdbc, String tableName, WorkEffortMigrationResult result) {
        List<String> sourceColumns = fetchColumns(sourceJdbc, tableName);
        List<String> targetColumns = fetchColumns(targetJdbc, tableName);
        Set<String> targetSet = new LinkedHashSet<>(targetColumns);
        List<String> common = sourceColumns.stream()
                .filter(targetSet::contains)
                .collect(Collectors.toList());
        List<String> missingInTarget = sourceColumns.stream()
                .filter(col -> !targetSet.contains(col))
                .collect(Collectors.toList());
        List<String> missingInSource = targetColumns.stream()
                .filter(col -> !sourceColumns.contains(col))
                .collect(Collectors.toList());
        if (!missingInTarget.isEmpty()) {
            result.missingTargetColumns.put(tableName, missingInTarget);
        }
        if (!missingInSource.isEmpty()) {
            result.missingSourceColumns.put(tableName, missingInSource);
        }
        return common;
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

    private int migrateTable(JdbcTemplate sourceJdbc, JdbcTemplate targetJdbc, String tableName, List<String> columns) {
        String sql = buildInsertSql(tableName, columns);
        Map<String, Integer> maxLengths = fetchColumnMaxLengths(targetJdbc, tableName, columns);
        Map<String, String> dataTypes = fetchColumnDataTypes(targetJdbc, tableName, columns);
        String selectSql = "SELECT " + String.join(", ", columns) + " FROM " + tableName;
        int batchSize = 500;
        List<Object[]> batch = new ArrayList<>(batchSize);
        final int[] total = new int[] { 0 };

        sourceJdbc.query(selectSql, rs -> {
            Object[] row = new Object[columns.size()];
            for (int i = 0; i < columns.size(); i++) {
                String column = columns.get(i);
                Object value = rs.getObject(column);
                Integer maxLength = maxLengths.get(column);
                if (value instanceof String && maxLength != null && maxLength > 0) {
                    String text = (String) value;
                    if (text.length() > maxLength) {
                        value = text.substring(0, maxLength);
                    }
                }
                String dataType = dataTypes.get(column);
                if (dataType != null && dataType.equalsIgnoreCase("bit")) {
                    value = normalizeBitValue(value);
                }
                row[i] = value;
            }
            batch.add(row);
            if (batch.size() >= batchSize) {
                total[0] += batchInsert(targetJdbc, sql, batch);
                batch.clear();
            }
        });

        if (!batch.isEmpty()) {
            total[0] += batchInsert(targetJdbc, sql, batch);
            batch.clear();
        }
        return total[0];
    }

    private int batchInsert(JdbcTemplate targetJdbc, String sql, List<Object[]> batch) {
        int[] counts = targetJdbc.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                Object[] row = batch.get(i);
                for (int index = 0; index < row.length; index++) {
                    ps.setObject(index + 1, row[index]);
                }
            }

            @Override
            public int getBatchSize() {
                return batch.size();
            }
        });
        int sum = 0;
        for (int count : counts) {
            sum += count;
        }
        return sum;
    }

    private Object normalizeBitValue(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof Boolean) {
            return (Boolean) value ? 1 : 0;
        }
        if (value instanceof Number) {
            return ((Number) value).intValue() == 0 ? 0 : 1;
        }
        String text = value.toString().trim();
        if (text.isEmpty()) {
            return null;
        }
        String upper = text.toUpperCase(Locale.ROOT);
        if (upper.equals("Y") || upper.equals("YES") || upper.equals("TRUE") || upper.equals("T") || upper.equals("1")) {
            return 1;
        }
        return 0;
    }

    private Map<String, Integer> fetchColumnMaxLengths(
            JdbcTemplate jdbcTemplate,
            String tableName,
            List<String> columns
    ) {
        String sql = "SELECT COLUMN_NAME, CHARACTER_MAXIMUM_LENGTH "
                + "FROM INFORMATION_SCHEMA.COLUMNS "
                + "WHERE TABLE_SCHEMA = DATABASE() AND TABLE_NAME = ?";
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, tableName);
        Map<String, Integer> maxLengths = new LinkedHashMap<>();
        for (Map<String, Object> row : rows) {
            String columnName = String.valueOf(row.get("COLUMN_NAME")).toUpperCase(Locale.ROOT);
            if (!columns.contains(columnName)) {
                continue;
            }
            Object lengthValue = row.get("CHARACTER_MAXIMUM_LENGTH");
            if (lengthValue == null) {
                continue;
            }
            if (lengthValue instanceof Number) {
                maxLengths.put(columnName, ((Number) lengthValue).intValue());
            } else {
                try {
                    maxLengths.put(columnName, Integer.parseInt(lengthValue.toString()));
                } catch (NumberFormatException ex) {
                    logger.debug("Unable to parse max length for {}.{}", tableName, columnName, ex);
                }
            }
        }
        return maxLengths;
    }

    private Map<String, String> fetchColumnDataTypes(
            JdbcTemplate jdbcTemplate,
            String tableName,
            List<String> columns
    ) {
        String sql = "SELECT COLUMN_NAME, DATA_TYPE "
                + "FROM INFORMATION_SCHEMA.COLUMNS "
                + "WHERE TABLE_SCHEMA = DATABASE() AND TABLE_NAME = ?";
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, tableName);
        Map<String, String> dataTypes = new LinkedHashMap<>();
        for (Map<String, Object> row : rows) {
            String columnName = String.valueOf(row.get("COLUMN_NAME")).toUpperCase(Locale.ROOT);
            if (!columns.contains(columnName)) {
                continue;
            }
            Object typeValue = row.get("DATA_TYPE");
            if (typeValue == null) {
                continue;
            }
            dataTypes.put(columnName, typeValue.toString());
        }
        return dataTypes;
    }

    private String buildInsertSql(String tableName, List<String> columns) {
        String columnList = String.join(", ", columns);
        String placeholders = columns.stream().map(col -> "?").collect(Collectors.joining(", "));
        String updateClause = columns.stream()
                .map(col -> col + "=VALUES(" + col + ")")
                .collect(Collectors.joining(", "));
        return "INSERT INTO " + tableName + " (" + columnList + ") VALUES (" + placeholders + ") ON DUPLICATE KEY UPDATE " + updateClause;
    }

    public static class WorkEffortMigrationResult {
        public String message;
        public Map<String, Integer> migratedTables = new LinkedHashMap<>();
        public List<String> skippedTables = new ArrayList<>();
        public Map<String, List<String>> missingTargetColumns = new LinkedHashMap<>();
        public Map<String, List<String>> missingSourceColumns = new LinkedHashMap<>();
    }
}
