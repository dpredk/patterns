package com.pda.patterns.strategy;

import java.util.Map;

public class RealtimeExportFileContext {
    private final Map<ExportFileStrategyType, ExportFileStrategy> strategies;

    public RealtimeExportFileContext(Map<ExportFileStrategyType, ExportFileStrategy> strategies) {
        this.strategies = strategies;
    }

    public void exportFile(ExportFileStrategyType type, String filename) {
        if (!strategies.containsKey(type)) {
            throw new UnsupportedOperationException();
        }
        strategies.get(type).export(filename);
    }

    public enum ExportFileStrategyType {
        CSV, XML
    }
}
