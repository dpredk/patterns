package com.pda.patterns.strategy;

import java.util.HashMap;

public class StrategyApplication {
    public static void main(String[] args) {
        String filename = "strategy_file";

        ExportFileContext csvContext = new ExportFileContext(new ExportFileCsvStrategy());
        ExportFileContext xmlContext = new ExportFileContext(new ExportFileXmlStrategy());

        csvContext.exportFile(filename);
        xmlContext.exportFile(filename);

        RealtimeExportFileContext realtimeExportFileContext = new RealtimeExportFileContext(
                new HashMap<>() {{
                    put(RealtimeExportFileContext.ExportFileStrategyType.CSV, new ExportFileCsvStrategy());
                    put(RealtimeExportFileContext.ExportFileStrategyType.XML, new ExportFileXmlStrategy());
                }}
        );

        realtimeExportFileContext.exportFile(RealtimeExportFileContext.ExportFileStrategyType.CSV, filename);
        realtimeExportFileContext.exportFile(RealtimeExportFileContext.ExportFileStrategyType.XML, filename);
    }
}
