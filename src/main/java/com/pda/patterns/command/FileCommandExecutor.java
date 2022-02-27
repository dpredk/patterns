package com.pda.patterns.command;

import java.util.ArrayList;
import java.util.List;

// The Invoker, only executes a command
public class FileCommandExecutor {

    // we don't have to store the history of commands
    private final List<FileCommand> fileCommands = new ArrayList<>();

    public void executeFileOperation(FileCommand fileCommand) {
        fileCommands.add(fileCommand);
        fileCommand.execute();
    }
}
