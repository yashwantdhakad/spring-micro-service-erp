package com.monash.erp.migration.lookup;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SchemaTableResolver {

    private static final Logger logger = LoggerFactory.getLogger(SchemaTableResolver.class);
    private static final Pattern CREATE_TABLE_PATTERN = Pattern.compile(
            "(?i)create\\s+table\\s+(?:if\\s+not\\s+exists\\s+)?[`\"]?([a-zA-Z0-9_]+)[`\"]?"
    );

    public List<String> resolveLookupTables(String schemaPath) {
        Path path = resolveSchemaPath(schemaPath);
        if (path == null) {
            logger.warn("Schema file not found: {}", schemaPath);
            return List.of();
        }
        String content;
        try {
            content = Files.readString(path);
        } catch (IOException ex) {
            logger.warn("Failed to read schema file: {}", path, ex);
            return List.of();
        }
        Matcher matcher = CREATE_TABLE_PATTERN.matcher(content);
        Set<String> tables = new LinkedHashSet<>();
        while (matcher.find()) {
            String table = matcher.group(1);
            if (isLookupTable(table)) {
                tables.add(table);
            }
        }
        return new ArrayList<>(tables);
    }

    public List<String> resolveTablesByPrefix(String schemaPath, String prefix) {
        Path path = resolveSchemaPath(schemaPath);
        if (path == null) {
            logger.warn("Schema file not found: {}", schemaPath);
            return List.of();
        }
        String content;
        try {
            content = Files.readString(path);
        } catch (IOException ex) {
            logger.warn("Failed to read schema file: {}", path, ex);
            return List.of();
        }
        String matchPrefix = prefix.toLowerCase(Locale.ROOT);
        Matcher matcher = CREATE_TABLE_PATTERN.matcher(content);
        Set<String> tables = new LinkedHashSet<>();
        while (matcher.find()) {
            String table = matcher.group(1);
            if (table.toLowerCase(Locale.ROOT).startsWith(matchPrefix)) {
                tables.add(table);
            }
        }
        return new ArrayList<>(tables);
    }

    public List<String> resolveTablesByPrefixes(String schemaPath, List<String> prefixes) {
        Path path = resolveSchemaPath(schemaPath);
        if (path == null) {
            logger.warn("Schema file not found: {}", schemaPath);
            return List.of();
        }
        String content;
        try {
            content = Files.readString(path);
        } catch (IOException ex) {
            logger.warn("Failed to read schema file: {}", path, ex);
            return List.of();
        }
        List<String> matchPrefixes = prefixes.stream()
                .map(prefix -> prefix.toLowerCase(Locale.ROOT))
                .collect(Collectors.toList());
        Matcher matcher = CREATE_TABLE_PATTERN.matcher(content);
        Set<String> tables = new LinkedHashSet<>();
        while (matcher.find()) {
            String table = matcher.group(1);
            String lower = table.toLowerCase(Locale.ROOT);
            for (String prefix : matchPrefixes) {
                if (lower.startsWith(prefix)) {
                    tables.add(table);
                    break;
                }
            }
        }
        return new ArrayList<>(tables);
    }

    public List<String> resolveAllTables(String schemaPath) {
        Path path = resolveSchemaPath(schemaPath);
        if (path == null) {
            logger.warn("Schema file not found: {}", schemaPath);
            return List.of();
        }
        String content;
        try {
            content = Files.readString(path);
        } catch (IOException ex) {
            logger.warn("Failed to read schema file: {}", path, ex);
            return List.of();
        }
        Matcher matcher = CREATE_TABLE_PATTERN.matcher(content);
        Set<String> tables = new LinkedHashSet<>();
        while (matcher.find()) {
            tables.add(matcher.group(1));
        }
        return new ArrayList<>(tables);
    }

    private boolean isLookupTable(String tableName) {
        String name = tableName.toLowerCase(Locale.ROOT);
        if (name.equals("enum") || name.endsWith("_enum") || name.contains("_enum_")) {
            return true;
        }
        if (name.endsWith("_type") || name.contains("_type_")) {
            return true;
        }
        if (name.equals("status_item") || name.contains("status_item")) {
            return true;
        }
        if (name.equals("status_valid_change") || name.contains("status_valid_change")) {
            return true;
        }
        return false;
    }

    private Path resolveSchemaPath(String schemaPath) {
        List<Path> candidates = new ArrayList<>();
        candidates.add(Paths.get(schemaPath));
        candidates.add(Paths.get("data", "schema", schemaPath));
        candidates.add(Paths.get("..", "data", "schema", schemaPath));
        for (Path candidate : candidates) {
            if (Files.exists(candidate)) {
                return candidate.normalize();
            }
        }
        return null;
    }
}
