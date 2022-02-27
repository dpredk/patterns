package com.pda.patterns.strategy;

public class ExportFileCsvStrategy implements ExportFileStrategy {

    @Override
    public void export(String filename) {
        System.out.println("Saving file " + filename + " as csv");
    }
}
