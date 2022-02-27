package com.pda.patterns.strategy;

public class ExportFileContext {
    private final ExportFileStrategy strategy;
    // we can have here some extra data that may be used by Strategies
    // in this case we need to pass this Context object in Strategy as a param
    // this can be used if we need different data/params for different Strategies.

    public ExportFileContext(ExportFileStrategy strategy) {
        this.strategy = strategy;
    }

    public void exportFile(String filename) {
        strategy.export(filename);
    }
}
