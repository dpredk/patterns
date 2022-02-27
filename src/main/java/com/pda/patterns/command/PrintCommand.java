package com.pda.patterns.command;

public class PrintCommand implements FileCommand {

    private final Document document;

    public PrintCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.print();
    }
}
