package com.pda.patterns.command;

public class OpenCommand implements FileCommand {

    private final Document document;

    public OpenCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        // the logic that should be applied to a Document object may be
        // implemented outside the Document class, e.g. the Receiver will be implemented separately
        // from the request object
        document.open();
    }
}
