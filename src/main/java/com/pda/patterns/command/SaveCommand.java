package com.pda.patterns.command;

public class SaveCommand implements FileCommand {

    private final Document document;

    public SaveCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.save();
    }
}
